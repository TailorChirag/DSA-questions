package MachingConding.TicTacToe.Strategies.BotStrategy;

import MachingConding.TicTacToe.Models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPLayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY))
            return new EasyBot();
        if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM))
            return new MediumBot();
        if(botDifficultyLevel.equals(BotDifficultyLevel.HARD))
            return new Hard();
        return new EasyBot();
    }
}
