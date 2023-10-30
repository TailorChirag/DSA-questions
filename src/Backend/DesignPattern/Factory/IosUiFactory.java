package Backend.DesignPattern.Factory;

import Backend.DesignPattern.Factory.Components.Buttons.IosButton;
import Backend.DesignPattern.Factory.Components.DropDowns.IosDropdown;
import Backend.DesignPattern.Factory.Components.Menus.IosMenu;

public class IosUiFactory implements UiFactory{

    @Override
    public IosButton createButton() {
        System.out.println("Creating Ios Button");
        return new IosButton();
    }

    @Override
    public IosDropdown createDropdown() {
        return new IosDropdown();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }
}
