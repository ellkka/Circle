import java.lang.reflect.Method;

public class Application extends Circle {

    public static void main(String[] args) {

        Application circ1 = new Application();

        double p = circ1.getPerimeter(4);
        double a = circ1.getArea(4);

        System.out.println("Perimeter is: " + p);
        System.out.println("Area is: " + a);
    }
}
