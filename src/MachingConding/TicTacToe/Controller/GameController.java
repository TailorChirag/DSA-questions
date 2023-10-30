package MachingConding.TicTacToe.Controller;

import MachingConding.TicTacToe.Exceptions.BotCountException;
import MachingConding.TicTacToe.Exceptions.PlayerCountException;
import MachingConding.TicTacToe.Exceptions.SymbolCountException;
import MachingConding.TicTacToe.Models.Game;
import MachingConding.TicTacToe.Models.GameState;
import MachingConding.TicTacToe.Models.Player;
import MachingConding.TicTacToe.Strategies.WinningStrategy.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int dimensions,
                          List<Player> players,
                          List<WinningStrategy> winningStrategies) throws PlayerCountException, BotCountException, SymbolCountException {

        return Game.getBuilder().setDimensions(dimensions)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();

    }
    public void makeMove(Game game){
        game.makeMove();

    }
    public void displayboard(Game game){
        game.displayBoard();
    }

    public GameState checkState(Game game){
        return game.getGameState();
    }

    public void undo(Game game){
        game.undo();
    }
    public Player getWinner(Game game){
        return game.getWinner();
    }
}
