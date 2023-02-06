import java.sql.SQLOutput;

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.0, 15.0);
        double expectedPerimeter = 2 * 10.0 + 2 * 15.0;
        rect.calculatePerimeter();
        System.out.println(rect.calculatePerimeter() == expectedPerimeter);
    }
}
