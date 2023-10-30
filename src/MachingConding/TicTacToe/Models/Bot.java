package MachingConding.TicTacToe.Models;

import MachingConding.TicTacToe.Strategies.BotStrategy.BotPLayingStrategy;
import MachingConding.TicTacToe.Strategies.BotStrategy.BotPlayingStrategyFactory;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPLayingStrategy botPLayingStrategy;

    public Bot(Long player_id, String name, Symbol symbol, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(player_id, name, symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPLayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy
                (botDifficultyLevel);
    }

    public Move makeMove(Board board){
        return this.botPLayingStrategy.makeMove(board);

    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
