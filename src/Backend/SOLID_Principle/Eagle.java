package Backend.SOLID_Principle;

public class Eagle extends Bird implements Flyable{
    FlyingBehaviour fb;
    public Eagle(FlyingBehaviour fb){
        this.fb = fb;
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("Eagle is eating");
    }

    @Override
    public void fly() {
//        System.out.println("Eagle is Flying");
        fb.makeFly();
    }

}
