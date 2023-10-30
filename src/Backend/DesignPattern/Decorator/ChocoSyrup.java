package Backend.DesignPattern.Decorator;

public class ChocoSyrup implements IceCreamIngredient{

    private IceCreamIngredient iceCreamIngredient;

    public ChocoSyrup(IceCreamIngredient iceCreamIngredient) {
        this.iceCreamIngredient = iceCreamIngredient;
    }

    @Override
    public int getCost() {
        return this.iceCreamIngredient.getCost() + 15;
    }

    @Override
    public String getDesc() {
        return this.iceCreamIngredient.getDesc() + " + Chocolate Syup";
    }
}
