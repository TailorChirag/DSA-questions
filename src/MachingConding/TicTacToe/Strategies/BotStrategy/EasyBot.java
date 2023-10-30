package MachingConding.TicTacToe.Strategies.BotStrategy;

import MachingConding.TicTacToe.Models.Board;
import MachingConding.TicTacToe.Models.Cell;
import MachingConding.TicTacToe.Models.CellState;
import MachingConding.TicTacToe.Models.Move;

import java.util.List;

public class EasyBot implements BotPLayingStrategy{

    @Override
    public Move makeMove(Board board) {
        for (List<Cell> row : board.getboard()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY))
                    return new Move(cell,null);
            }
        }
        return null;
    }
}
