package MachingConding.TicTacToe.Models;

import MachingConding.TicTacToe.Exceptions.BotCountException;
import MachingConding.TicTacToe.Exceptions.PlayerCountException;
import MachingConding.TicTacToe.Exceptions.SymbolCountException;
import MachingConding.TicTacToe.Strategies.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private GameState gameState;
    private Player winner;
    private int nextPlayerTurnIndex;
    private List<WinningStrategy> winningStrategies;

    public Game(int dimensions,List<Player> players, List<WinningStrategy> winningStrategies) {
        board = new Board(dimensions);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.moves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerTurnIndex = 0;

    }

    public void displayBoard(){
        this.board.displayBoard();
    }

    public void makeMove(){
        Player currentPlayer = players.get(nextPlayerTurnIndex);
        System.out.println("It is  " + currentPlayer.getName() + "'s move");
        Move move = currentPlayer.makeMove(board);

        System.out.println(currentPlayer.getName() + " has made a move at " +
                move.getCell().getRow() + "," + move.getCell().getCol());

        if(!validateMove(move)) {
            System.out.println("Its invalid Move");
            return;
        }

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell actualCellOfBoard = board.getboard().get(row).get(col);
        actualCellOfBoard.setCellState(CellState.FILLED);
        actualCellOfBoard.setPlayer(currentPlayer);

        Move actualMove = new Move(actualCellOfBoard,currentPlayer);
        moves.add(actualMove);

        nextPlayerTurnIndex += 1;
        nextPlayerTurnIndex %= players.size();

        if(checkWinner(actualMove)){
            setGameState(GameState.WIN);
            setWinner(currentPlayer);
            return;
        }

        if (moves.size() == board.getSize() + board.getSize()){
            setGameState(GameState.DRAW);
            System.out.println("Game has been Drawn");

        }


    }

    public boolean checkWinner(Move move){
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(board,move))
                return true;
        }
        return false;
    }

    public boolean validateMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if(row < 0 || row >= board.getSize())
            return false;

        if (col < 0 || col >= board.getSize())
            return false;

        if(board.getboard().get(row).get(col).getCellState().equals(CellState.FILLED))
            return false;

        return true;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{

        private List<Player> players;
        private int  dimensions;
        private List<WinningStrategy> winningStrategies;

        public Game build() throws PlayerCountException, BotCountException, SymbolCountException {
            vaildate();
            return new Game(dimensions,players,winningStrategies);
        }
        private void vaildate() throws PlayerCountException, BotCountException, SymbolCountException {
            validatePlayerCount();
            validateBotCount();
            validateSymbolCount();
        }

        private void validatePlayerCount() throws PlayerCountException {
            if(players.size() != dimensions-1)
                throw new PlayerCountException();
        }
        private void validateBotCount() throws BotCountException {
            int countOfBot = 0;
            for(Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT))
                    countOfBot++;
            }
            if (countOfBot > 1)
                throw new BotCountException();
        }
        private void validateSymbolCount() throws SymbolCountException {
            Map<Character,Integer> symbolCount = new HashMap<>();
            for (Player player : players){
                if(!symbolCount.containsKey(player.getSymbol().getaChar())){
                    symbolCount.put(player.getSymbol().getaChar(),0);
                }
                symbolCount.put(player.getSymbol().getaChar(),
                        symbolCount.get(player.getSymbol().getaChar()) + 1);
                if(symbolCount.get(player.getSymbol().getaChar()) > 1)
                    throw new SymbolCountException();
            }
        }


        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setDimensions(int dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerTurnIndex() {
        return nextPlayerTurnIndex;
    }

    public void setNextPlayerTurnIndex(int nextPlayerTurnIndex) {
        this.nextPlayerTurnIndex = nextPlayerTurnIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
}
