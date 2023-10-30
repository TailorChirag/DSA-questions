package MachingConding.TicTacToe.Strategies.WinningStrategy;

import MachingConding.TicTacToe.Models.Board;
import MachingConding.TicTacToe.Models.Move;
import MachingConding.TicTacToe.Models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{

    Map<Integer,Map<Symbol,Integer>> count = new HashMap<>();
    
    @Override
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        Symbol symbol = move.getCell().getPlayer().getSymbol();

        if(!count.containsKey(row)){
            count.put(row,new HashMap<>());
        }
        Map<Symbol,Integer> rowMap = count.get(row);

        if(!rowMap.containsKey(symbol)){
            rowMap.put(symbol,0);
        }
        rowMap.put(symbol,rowMap.get(symbol)+1);

        if(rowMap.get(symbol).equals(board.getSize())) {
            return true;
        }

        return false;
    }
}
