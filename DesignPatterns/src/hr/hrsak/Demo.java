package hr.hrsak;

public class Demo {
    public static void main(String[] args) {

        ColoredShape<Square> blueSquare =
                new ColoredShape<>(
                        () -> new Square(20), "blue"
                );
        System.out.println(blueSquare.info());

        TransparentShape<Circle> myCircle = new TransparentShape<Circle>(() ->  new ColoredShape<Circle>(()-> new Circle(5), "Green"), 10);
        System.out.println(myCircle.info());
    }
}
