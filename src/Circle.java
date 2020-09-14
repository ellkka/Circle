public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    protected static double getArea(double radius) {
        return(Math.PI*radius*radius);
    }

    protected double getPerimeter(double radius) {
       return(2*Math.PI*radius);
    }
}
