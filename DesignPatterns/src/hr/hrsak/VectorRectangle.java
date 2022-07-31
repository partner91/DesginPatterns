package hr.hrsak;

public class VectorRectangle extends VectorObjects{


    public VectorRectangle(int x, int y, int width, int height) {
        add(new Line(new Point(x,y), new Point(x+width,y)));
        add(new Line(new Point(x+width,y), new Point(x+width,y+height)));
        add(new Line(new Point(x,y), new Point(x,y+height)));
        add(new Line(new Point(x,y+height), new Point(x+width,y+height)));
    }
}
