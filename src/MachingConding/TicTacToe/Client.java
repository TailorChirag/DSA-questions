package MachingConding.TicTacToe;

import MachingConding.TicTacToe.Controller.GameController;
import MachingConding.TicTacToe.Exceptions.BotCountException;
import MachingConding.TicTacToe.Exceptions.PlayerCountException;
import MachingConding.TicTacToe.Exceptions.SymbolCountException;
import MachingConding.TicTacToe.Models.*;
import MachingConding.TicTacToe.Strategies.WinningStrategy.ColWinningStrategy;
import MachingConding.TicTacToe.Strategies.WinningStrategy.DiagonalWinningStrategy;
import MachingConding.TicTacToe.Strategies.WinningStrategy.RowWinningStrategy;
import MachingConding.TicTacToe.Strategies.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws PlayerCountException, BotCountException, SymbolCountException {
        GameController gameController = new GameController();
        Scanner scanner = new Scanner(System.in);

        try {
            int dimensions = 3;
            List<Player> players = new ArrayList<>();
            players.add(new Player(1L,"Knok",new Symbol('X'), PlayerType.HUMAN));
            players.add(new Bot(2L,"Bot",new Symbol('O'),PlayerType.BOT,BotDifficultyLevel.EASY));
            List<WinningStrategy> winningStrategies = new ArrayList<>();
            winningStrategies.add(new ColWinningStrategy());
            winningStrategies.add(new DiagonalWinningStrategy());
            winningStrategies.add(new RowWinningStrategy());
            Game game = gameController.startGame(dimensions,
                    players, winningStrategies);

            while (gameController.checkState(game).equals(GameState.IN_PROGRESS)){
                gameController.displayboard(game);

                if(game.getMoves().size() >= 1) {
                    System.out.println("do you want to do Undo");
                    String ans = scanner.next();
                    if (ans.equalsIgnoreCase("y")) {
                        gameController.undo(game);
                        continue;
                    }
                }
                gameController.makeMove(game);
            }

            if(gameController.checkState(game).equals(GameState.DRAW)){
                System.out.println("Game has been drawn");
            }

            if (gameController.checkState(game).equals(GameState.WIN)){
                System.out.println("Game has been won by " + gameController.getWinner(game).getName()  +
                        "\nTu haar gaya lodu " );
            }

        }catch (Exception e){
            throw e;
//            System.out.println("Kuch too kadbad Hai " + e);
        }
        System.out.println("Game has been finished");


    }
}
