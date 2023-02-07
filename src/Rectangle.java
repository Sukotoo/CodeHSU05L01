import java.text.DecimalFormat;

/**
 * @file Rectangle.java
 * @date 2/2/2023
 *
 * @description Creates a rectangle with a width and height or a square with a side length.
 * The user can also calculate the perimeter and area of the rectangle and
 * print info about the rectangle.
 */
public class Rectangle { //make public for CS A

    //instance variables
    private double width;
    private double height;
    //default constructor (make public for CS A)
    public Rectangle(double width, double height)
    {
        if(width > 0) { this.width = width; }
        else { this.width = 1.0; }
        if(height > 0) { this.height = height; }
        else { this.height = 1.0; }
    }
    //overloaded constructor (with parameters)
    public Rectangle(int width, int height, double scale)
    {
        this.width = width * scale;
        this.height = height * scale;
    }

    //accessors
    public double getWidth()
    {
        return width;
    }
    public double getHeight() { return height; }

    //mutators
    /**
     * Allows the user to change the width of the rectangle.
     * @param newWidth - desired width
      */
    public void setWidth(double newWidth)
    {
        width = newWidth;
    }

    /**
     * Allows the user to change the height of the rectangle.
     * @param newHeight - desired height
     */
    public void setHeight(double newHeight) { height = newHeight; }
    //other methods

    /**
     * @return returns area of the rectangle
     */
    public double calculateArea() { return width*height; }
    /**
     * @return returns perimeter of the rectangle
     */
    public double calculatePerimeter() { return (2 * width) + (2 * height); }

    // reset rectangle function

    /**
     * @description resets rectangle to its defaults
     * @param rect - rectangle to reset
     */
    public void resetRectangle(Rectangle rect)
    {
        rect.width = 1;
        rect.height = 1;
    }

    //toString method
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.##");
        return "The height of the rectangle is " + df.format(height) + " and the width is " + df.format(width) + ".";
    }
}