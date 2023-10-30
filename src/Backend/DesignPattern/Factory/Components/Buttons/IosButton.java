package Backend.DesignPattern.Factory.Components.Buttons;

public class IosButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("Changing size");
    }
}
