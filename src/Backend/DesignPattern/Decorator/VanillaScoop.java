package Backend.DesignPattern.Decorator;

public class VanillaScoop implements IceCreamIngredient{
    private IceCreamIngredient iceCreamIngredient;

    public VanillaScoop(IceCreamIngredient iceCreamIngredient) {
        this.iceCreamIngredient = iceCreamIngredient;
    }

    @Override
    public int getCost() {
        return this.iceCreamIngredient.getCost() + 40;
    }

    @Override
    public String getDesc() {
        return this.iceCreamIngredient.getDesc() + " + Vanilla Scoop ";
    }
}
