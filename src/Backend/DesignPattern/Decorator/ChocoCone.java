package Backend.DesignPattern.Decorator;

public class ChocoCone implements IceCreamIngredient{

    private IceCreamIngredient iceCreamIngredient;

    public ChocoCone() {
    }

    public ChocoCone(IceCreamIngredient iceCreamIngredient) {
        this.iceCreamIngredient = iceCreamIngredient;
    }

    @Override
    public int getCost() {
        if(this.iceCreamIngredient != null)
            return this.iceCreamIngredient.getCost() + 30 ;
        return 30;
    }

    @Override
    public String getDesc() {
        if(this.iceCreamIngredient != null)
            return this.iceCreamIngredient.getDesc() + " + Chocolate Cone" ;
        return "Chocolate Cone";
    }
}
