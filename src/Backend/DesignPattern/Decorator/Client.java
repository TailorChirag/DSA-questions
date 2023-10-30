package Backend.DesignPattern.Decorator;

public class Client {
    public static void main(String[] args) {
        IceCreamIngredient iceCreamIngredient =
                new Sprinkles(
                        new VanillaScoop(
                                new CookiesAndCreamScoop(
                                        new StrawberrySyrup(
                                                new OrangeCone(
                                                        new ChocoCone()
                                                )
                                        )
                                )
                        )
                );
        System.out.println(iceCreamIngredient.getCost());
        System.out.println(iceCreamIngredient.getDesc());
    }
}
