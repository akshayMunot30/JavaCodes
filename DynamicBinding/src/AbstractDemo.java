public class AbstractDemo {

    public static void main(String[] args) {
        Shape shape;

        Rectangle rectangle = new Rectangle();

        shape = rectangle;

        // Rectangle's object
        shape.setData(7, 5);

        //area of rectangle
        System.out.println("Area of rectangle : " + shape.compute_area());
        Triangle triangle = new Triangle();
        shape = triangle;

        // Triangle's object
        shape.setData(16, 3);

        // area of triangle
        System.out.println("Area of triangle : " + shape.compute_area());
    }
}