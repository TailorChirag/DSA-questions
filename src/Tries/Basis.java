package Tries;

import java.util.HashMap;

class Node {
    boolean isTerminal;
    HashMap<Character,Node> hm;

    Node(){
        isTerminal = false;
        hm = new HashMap<>();
    }
}
public class Basis {
    public void insert(Node root,String word){
        Node temp = root;
        for(char x : word.toCharArray()){
            if(!temp.hm.containsKey(x)){
                Node n = new Node();
                temp.hm.put(x,n);
            }
            temp = temp.hm.get(x);
        }
        temp.isTerminal = true;
    }
    boolean Search(Node root,String word){
        Node temp = root;
        for(char x : word.toCharArray()){
            if(temp.hm.containsKey(x)){
                temp = temp.hm.get(x);
            }
            else return false;
        }
        return temp.isTerminal;
    }
    public static void main(String[] args) {
        String[] A = {"hat", "cat", "rat"} ;
        String[] B = {"cat", "ball"};
        Node root = new Node();


    }
}
