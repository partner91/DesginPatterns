package hr.hrsak;

public class Demo {

    static void useIt(Rectangle r){
        int width = r.getWidth();
        r.setHeight(10);

        System.out.println("Expect area of " + (width *10) + " got " + r.getArea());

    }
    public static void main(String[] args) {

        Rectangle rc = new Rectangle(2,3);
        useIt(rc);

        Rectangle sq = RectangleFactory.newSquare(5);
        sq.setWidth(5);
        useIt(sq);




    }
}
