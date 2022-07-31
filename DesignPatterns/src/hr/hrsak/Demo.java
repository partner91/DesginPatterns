package hr.hrsak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;

public class Demo {
    private final static List<VectorObjects> vectorObjects = new ArrayList<>(
            Arrays.asList(
                    new VectorRectangle(1,1,10,10),
                    new VectorRectangle(3,3,5,5)
            )
    );

    public static void drawPoint(Point p)
    {
        System.out.println(".");
    }

    private static void draw(){
        for (VectorObjects vo: vectorObjects)
        {
            for (Line line: vo)
            {
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                adapter.forEach(Demo::drawPoint);
            }
        }
    }
    public static void main(String[] args) {

        draw();

    }
}
