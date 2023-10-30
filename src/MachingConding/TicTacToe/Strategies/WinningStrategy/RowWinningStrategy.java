package MachingConding.TicTacToe.Strategies.WinningStrategy;

import MachingConding.TicTacToe.Models.Board;
import MachingConding.TicTacToe.Models.Move;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
