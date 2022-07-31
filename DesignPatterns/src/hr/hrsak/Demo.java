package hr.hrsak;

public class Demo {
    public static void main(String[] args) {

        final Circle circle = new Circle(10);
        System.out.println(circle.info());

        final ColoredShape blue = new ColoredShape(
                new Square(20),
                "blue"
        );
        System.out.println(blue.info());

        final TransparentShape transparentShape = new TransparentShape(
                new ColoredShape(
                        new Circle(5),
                        "Green"),
                10
        );

        System.out.println(transparentShape.info());

    }
}
