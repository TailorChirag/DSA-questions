package Backend.DesignPattern.Factory;

public class Flutter {

    public void setTheme(){
        System.out.println("Setting Theme");
    }

    public void changeRefreshRate(){
        System.out.println("Changing refresh rate");
    }

    public UiFactory createUiFactory(String platform){
//        if(platform.equals("Andriod"))
//            return new AndriodUiFactory();
//        if (platform.equals("IOS"))
//            return new IosUiFactory();
//        return null;
        return UiFactoryFactory.createUiFactory(platform);
    }
}
