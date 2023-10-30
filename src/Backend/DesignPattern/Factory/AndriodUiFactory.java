package Backend.DesignPattern.Factory;

import Backend.DesignPattern.Factory.Components.Buttons.AndriodButton;
import Backend.DesignPattern.Factory.Components.DropDowns.AndriodDropdown;
import Backend.DesignPattern.Factory.Components.Menus.AndriodMenu;

public class AndriodUiFactory implements UiFactory{
    @Override
    public AndriodButton createButton() {
        System.out.println("Creating Andriod Button");
        return new AndriodButton();
    }

    @Override
    public AndriodDropdown createDropdown() {
        return new AndriodDropdown();
    }

    @Override
    public AndriodMenu createMenu() {
        return new AndriodMenu();
    }
}
