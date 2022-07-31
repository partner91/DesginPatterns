package hr.hrsak;

public class Demo {
    public static void main(String[] args) {

        final RasterRenderer raster = new RasterRenderer();
        final VectorRenderer vector = new VectorRenderer();
        final Circle circle = new Circle(vector, 5);
        circle.draw();
        circle.resize(2);
        circle.draw();

    }
}
