package hr.hrsak;

public class CoffeeFactory implements HotDrinkFactory{
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Grind some beans, boil some water");
        return new Coffee();
    }
}
