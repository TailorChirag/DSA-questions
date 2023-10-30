package Game;

public class Game {

    private int computerguess;

    Player p1,p2,p3;

    Game(String name1,String name2 , String name3){
        p1=new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }
    boolean chechWinner(){
        if(computerguess== p1.guess){
            System.out.println(p1.name + " won ");
            return  true;
        }
        else if(computerguess== p2.guess){
            System.out.println(p2.name + " won ");
            return true;
        }
        else if(computerguess== p3.guess){
            System.out.println(p3.name + " won ");
            return true;
        }
        return false;

    }

    void play(){
        System.out.println(("Welcome to the game"));
        computerguess = (int)(Math.random()*10);

        while(true) {
            System.out.println("Number to guess is " + computerguess);
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();
            boolean someHaswon= chechWinner();
            if(someHaswon){
                System.out.println("Game Over");
                break;
            }
            else{
                computerguess = (int)(Math.random()*10);
            }
        }
    }




}
