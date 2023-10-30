package Backend.DesignPattern.Decorator;

public class CookiesAndCreamScoop implements IceCreamIngredient {

    private IceCreamIngredient iceCreamIngredient;

    public CookiesAndCreamScoop(IceCreamIngredient iceCreamIngredient) {
        this.iceCreamIngredient = iceCreamIngredient;
    }

    @Override
    public int getCost() {
        return this.iceCreamIngredient.getCost() + 70;
    }

    @Override
    public String getDesc() {
        return this.iceCreamIngredient.getDesc() + " + Cookies&Cream Scoop ";
    }
}
