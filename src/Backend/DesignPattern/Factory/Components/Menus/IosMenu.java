package Backend.DesignPattern.Factory.Components.Menus;

public class IosMenu implements Menu{
    @Override
    public void changingContents() {
        System.out.println("Changing Contents of IosMenu ");
    }
}
