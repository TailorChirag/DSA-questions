package Backend.DesignPattern.Factory.Components.Menus;

public class AndriodMenu implements Menu{
    @Override
    public void changingContents() {
        System.out.println("Changing Contents of AndriodMenu ");
    }
}
