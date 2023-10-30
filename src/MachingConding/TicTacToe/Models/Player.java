package MachingConding.TicTacToe.Models;

import java.util.Scanner;

public class Player {
    private Long Player_id;
    private String name;
    private Symbol symbol;
    private PlayerType playerType;
    private Scanner scanner;

    public Player(Long player_id, String name, Symbol symbol, PlayerType playerType) {
        Player_id = player_id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
        this.scanner = new Scanner(System.in);
    }

    public Move makeMove(Board board){
        System.out.println("Enter the Row Number");
        int row = scanner.nextInt();

        System.out.println("Enter the Col Number");
        int col = scanner.nextInt();

        return new Move(new Cell(row , col ), this);

    }

    public Long getPlayer_id() {
        return Player_id;
    }

    public void setPlayer_id(Long player_id) {
        Player_id = player_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }


}
