package Game;

public class Player {
    String name;
    int guess;

    Player(String name){
        this.name=name;
    }

    void makeGuess(){
        guess=(int)(Math.random()*10);
        System.out.println(name + " guessed " + guess);
    }

}
