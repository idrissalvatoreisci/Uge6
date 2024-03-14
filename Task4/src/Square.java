public class Square implements Shape{

    double number;
    Square(double number)
    {
        this.number = number;
    }
    public double getArea()
    {
        double result = number*2;

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
