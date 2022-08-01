public class Main {
    public static void main(String[] args) {
        System.out.println("===========SHAPE=============");
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
        System.out.println("==============CIRCLE==============");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("indigo",false,3.5);
        System.out.println(circle);
        System.out.println("============Rectangle============");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle();
        System.out.println(rectangle);
        ComparableCircle [] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("indigo", false, 3.5);
        System.out.println("Pre - sorted");
        for (ComparableCircle comparableCircle : circles){
            System.out.println(comparableCircle);
        }
    }
}
