package Backend.DesignPattern.Factory;

import Backend.DesignPattern.Factory.Components.Buttons.Button;
import Backend.DesignPattern.Factory.Components.DropDowns.DropDown;
import Backend.DesignPattern.Factory.Components.Menus.Menu;

public interface UiFactory {

    public Button createButton();
    public DropDown createDropdown();
    public Menu createMenu();
}
