public class Main {
    public static void main(String[] args)
    {

        Circle c1 = new Circle(5);

        System.out.println(c1.getArea());

        Square s1 = new Square(11);
        System.out.println(s1.getArea());

        ShapeBuilder shape1  = new ShapeBuilder();
        shape1.addShape(c1);
        shape1.addShape(s1);
        System.out.println(shape1.getTotalArea());
    }


}