package Backend.DesignPattern.Decorator;

public class StrawberrySyrup implements IceCreamIngredient{
    private IceCreamIngredient iceCreamIngredient;

    public StrawberrySyrup(IceCreamIngredient iceCreamIngredient){
        this.iceCreamIngredient = iceCreamIngredient;
    }
    @Override
    public int getCost() {
        return this.iceCreamIngredient.getCost()+20;
    }

    @Override
    public String getDesc() {
        return this.iceCreamIngredient.getDesc()  + " + Strawberry Syrup ";
    }
}
