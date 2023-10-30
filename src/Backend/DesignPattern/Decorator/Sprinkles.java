package Backend.DesignPattern.Decorator;

public class Sprinkles implements IceCreamIngredient{

    private  IceCreamIngredient iceCreamIngredient ;

    public Sprinkles(IceCreamIngredient iceCreamIngredient) {
        this.iceCreamIngredient = iceCreamIngredient;
    }

    @Override
    public int getCost() {
        return this.iceCreamIngredient.getCost() + 10;
    }

    @Override
    public String getDesc() {
        return this.iceCreamIngredient.getDesc() + " + Sprinkles";
    }
}
