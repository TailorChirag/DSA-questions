package Backend.DesignPattern.Factory;

import Backend.DesignPattern.Factory.Components.Buttons.Button;
import Backend.DesignPattern.Factory.Components.Menus.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UiFactory uiFactory = flutter.createUiFactory("IOS");
        Menu menu = uiFactory.createMenu();
        menu.changingContents();

        Button button = uiFactory.createButton();
        button.changeSize();
    }
}
