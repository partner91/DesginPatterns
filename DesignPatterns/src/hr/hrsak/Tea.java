package hr.hrsak;

public class Tea implements HotDrink{
    @Override
    public void consume() {
        System.out.println("Tea is delicious!");
    }
}
