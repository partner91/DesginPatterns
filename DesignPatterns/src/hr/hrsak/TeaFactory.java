package hr.hrsak;

public class TeaFactory implements  HotDrinkFactory{
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Put in tea bag, boil, water, pour!");
        return new Tea();
    }
}
