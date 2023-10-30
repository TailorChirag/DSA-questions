package MachingConding.TicTacToe.Strategies.WinningStrategy;

import MachingConding.TicTacToe.Models.Board;
import MachingConding.TicTacToe.Models.Move;
import MachingConding.TicTacToe.Models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategy implements WinningStrategy{
    Map<Integer,Map<Symbol,Integer>> count = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {

        int col = move.getCell().getCol();
        Symbol symbol = move.getCell().getPlayer().getSymbol();

        if(!count.containsKey(col)){
            count.put(col,new HashMap<>());
        }
        Map<Symbol,Integer> colMap = new HashMap<>();

        if(!colMap.containsKey(symbol)){
            colMap.put(symbol,0);
        }
        colMap.put(symbol,colMap.get(symbol)+1);
        if(colMap.size() == board.getSize())
            return true;

        return false;
    }
}
