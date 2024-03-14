import java.util.ArrayList;

public class ShapeBuilder
{
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s)
    {
        shapes.add(s);
    }

    public double getTotalArea()
    {
        double sum = 0;
        for (int i = 0;i<shapes.size();i++)
        {
            sum += shapes.get(i).getArea();

        }
        return sum;
    }
}
