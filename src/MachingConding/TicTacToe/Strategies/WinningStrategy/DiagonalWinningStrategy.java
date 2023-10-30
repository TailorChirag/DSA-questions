package MachingConding.TicTacToe.Strategies.WinningStrategy;

import MachingConding.TicTacToe.Models.Board;
import MachingConding.TicTacToe.Models.Move;
import MachingConding.TicTacToe.Models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy{

    Map<Symbol,Integer> leftDiagonal = new HashMap<>();
    Map<Symbol,Integer> rightDiagonal = new HashMap<>();

    @Override
    public void undo(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if(row == col){
            leftDiagonal.put(symbol, leftDiagonal.get(symbol)-1);
        }
        if ((row + col) == (board.getSize())-1){
            rightDiagonal.put(symbol, rightDiagonal.get(symbol)-1);
        }


        }

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if(row == col){
            if(!leftDiagonal.containsKey(symbol)){
                leftDiagonal.put(symbol,0);
            }
            leftDiagonal.put(symbol,leftDiagonal.get(symbol)+1);
            if(leftDiagonal.get(symbol).equals(board.getSize()))
                return true;
        }

        if ((row + col) == (board.getSize())-1){
            if(!rightDiagonal.containsKey(symbol))
                rightDiagonal.put(symbol,0);

            rightDiagonal.put(symbol, rightDiagonal.get(symbol)+1);

            if (rightDiagonal.get(symbol).equals(board.getSize()))
                return true;
        }



        return false;
    }
}
