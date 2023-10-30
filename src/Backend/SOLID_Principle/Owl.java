package Backend.SOLID_Principle;

public class Owl extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Owl is Flying");
    }

    @Override
    public void eat() {
        System.out.println("Owl is eating");
    }
}
