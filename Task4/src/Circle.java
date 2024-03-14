public class Circle implements Shape
{

    double number;

    // CONSTRUCTOR
    Circle(double number)
    {
        this.number = number;
    }

    public double getArea()
    {
        double pi = 3.14;
        double result = pi * (number*2);

        return result;
    }

    public void setNumber(double number)
    {
        this.number = number;
    }

    public double getNumber()
    {
        return number;
    }

    @Override
    public String toString()
    {
        return "Result of computation: " + number;
    }
}

