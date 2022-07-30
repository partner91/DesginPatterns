package hr.hrsak;

public class RectangleFactory {

    public static Rectangle newRectangle(int width, int height){
        return new Rectangle(width, height);
    }

    public static Rectangle newSquare(int width){
        return new Rectangle(width, width);
    }
}
