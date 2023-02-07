import java.sql.SQLOutput;

public class RectangleTester {
    public static void main(String[] args) {
        /*
                Rectangle rect = new Rectangle(10.0, 15.0);
        double expectedPerimeter = 2 * 10.0 + 2 * 15.0;
        rect.calculatePerimeter();
        System.out.println(rect.calculatePerimeter() == expectedPerimeter);
         */
        Rectangle rect1 = new Rectangle(5, 10);
        System.out.println(rect1);
        rect1.setWidth(4);
        rect1.setHeight(15);
        System.out.println(rect1);
        System.out.println(rect1.calculateArea());
        System.out.println(rect1.calculatePerimeter());


    }
}
