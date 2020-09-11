import java.util.Scanner;

public class Application {
    public static void main(String args []){

        Circle circ = new Circle();
        Scanner c = new Scanner(System.in);
        System.out.println("Enter circle radius:");
        circ.setRadius(c.nextDouble());

       System.out.println("Perimeter is: "+ getPerimeter(circ.getRadius()));

       System.out.println("Area is: " + getArea(circ.getRadius()));

    }
    static double getArea(double radius){
        return(Math.PI*radius*radius);
    }

    static double getPerimeter(double radius){
        return(2*Math.PI*radius);
    }

}
