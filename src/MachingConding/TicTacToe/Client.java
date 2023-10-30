package MachingConding.TicTacToe;

import MachingConding.TicTacToe.Controller.GameController;
import MachingConding.TicTacToe.Exceptions.BotCountException;
import MachingConding.TicTacToe.Exceptions.PlayerCountException;
import MachingConding.TicTacToe.Exceptions.SymbolCountException;
import MachingConding.TicTacToe.Models.*;
import MachingConding.TicTacToe.Strategies.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        try {
            int dimensions = 3;
            List<Player> players = new ArrayList<>();
            players.add(new Player(1L,"Knok",new Symbol('X'), PlayerType.HUMAN));
            players.add(new Bot(2L,"Bot",new Symbol('O'),PlayerType.BOT,BotDifficultyLevel.EASY));
            List<WinningStrategy> winningStrategies = new ArrayList<>();
            Game game = gameController.startGame(dimensions,
                    players, winningStrategies);

            while (gameController.checkState(game).equals(GameState.IN_PROGRESS)){
                gameController.displayboard(game);
                gameController.makeMove(game);
            }

        }catch (Exception e){
            System.out.println("Kuch too kadbad Hai " + e);
        }
        System.out.println("lets play");


    }
}
