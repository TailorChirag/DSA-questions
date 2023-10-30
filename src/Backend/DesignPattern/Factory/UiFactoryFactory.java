package Backend.DesignPattern.Factory;

public class UiFactoryFactory {
    public static UiFactory createUiFactory(String platform){
        if(platform.equals("Andriod"))
            return new AndriodUiFactory();
        if (platform.equals("IOS"))
            return new IosUiFactory();
        return null;
    }
}
