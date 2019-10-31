public class GeometricObject {
    public static void main(String[] args) {
        Shape shape = new Shape("red",false);
        Circle circle = new Circle("blue",false,6);
        Rectangle rectangle = new Rectangle("black",true,10,20);
        Square square = new Square("pink",true,12,15,14);
        shape.showInfo();
        System.out.println();
        System.out.println("Hinh Tron");
        circle.showInfo();
        System.out.println();
        System.out.println("Hinh Chu Nhat :");
        rectangle.showInfo();
        System.out.println();
        System.out.println("Hinh Square :");
        square.showInfo();
    }

}
