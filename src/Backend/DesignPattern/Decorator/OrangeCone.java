package Backend.DesignPattern.Decorator;

public class OrangeCone implements IceCreamIngredient{

    private IceCreamIngredient iceCreamIngredient;

    public OrangeCone() { }

    public OrangeCone(IceCreamIngredient iceCreamIngredient) {
        this.iceCreamIngredient = iceCreamIngredient;
    }

    @Override
    public int getCost() {
        if(this.iceCreamIngredient != null)
            return this.iceCreamIngredient.getCost() + 20;
        return 20;
    }

    @Override
    public String getDesc() {
        if(this.iceCreamIngredient != null)
            return this.iceCreamIngredient.getDesc() + " + Orange cone" ;
        return "Orange Cone";
    }
}
