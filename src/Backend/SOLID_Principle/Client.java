package Backend.SOLID_Principle;

public class Client {
    public static void main(String[] args) {
        Bird b = new Crow();
        b.eat();
        Eagle e = new Eagle(new PEFB());
        e.fly();
    }
}
