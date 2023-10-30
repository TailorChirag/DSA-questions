package MachingConding.TicTacToe.Strategies.WinningStrategy;

import MachingConding.TicTacToe.Models.Board;
import MachingConding.TicTacToe.Models.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move move);
}
