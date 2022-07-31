package hr.hrsak;

public class Square implements Shape{
    private float side;

    public Square(float side) {
        this.side = side;
    }
    public Square(){}


    @Override
    public String info() {
        return "Square is size: " + side;
    }
}
