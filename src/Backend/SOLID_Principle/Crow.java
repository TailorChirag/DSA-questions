package Backend.SOLID_Principle;

public class Crow extends Bird implements Flyable{
    FlyingBehaviour flyingBehaviour = new COFB();
    @Override
    public void eat() {
        super.eat();
        System.out.println("Crow is eating");
    }

    @Override
    public void fly() {
//        System.out.println("Crow is Flying");
        flyingBehaviour.makeFly();
    }
}
