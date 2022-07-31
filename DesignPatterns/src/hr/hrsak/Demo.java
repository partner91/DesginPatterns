package hr.hrsak;

public class Demo {
    public static void main(String[] args) throws Exception {
        Point point = Point.Factory.newPolarPoint(2, 3);
        System.out.println(point);

        HotDrinkMachine hm = new HotDrinkMachine();
        HotDrink drink = hm.makeDrink();
        drink.consume();



    }
}
