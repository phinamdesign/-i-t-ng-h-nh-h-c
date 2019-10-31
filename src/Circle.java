public class Circle extends Shape {
    private double radius = 1.0;

    public Circle (){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.floor(radius * radius * Math.PI);
    }

    public double getPerimeter() {
        return Math.floor(2 * radius * Math.PI);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Hình tròn có bán kính = " + getRadius() + " Diện tích = " + getPerimeter()+" Chu vi = "+getArea());
    }
}
