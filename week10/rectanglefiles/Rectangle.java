package week10.rectanglefiles;
/*
 * Rectangle
 - length : double
 - width : double
 + Rectangle(l : double, w : double)
 + Rectangle()
 + setLength(l : double) : void
 + setWidth(w : double) : void
 + getLength() : double
 + getWidth() : double
 + getArea() : double
 */
public class Rectangle
{
    private double length, width;

    public Rectangle(double l, double w)
    {
        this.length = l;
        this.width = w;
    }

    public Rectangle()
    {

    }

    public void setLength(double l)
    {
        length = l;
    }

    public void setWidth(double w)
    {
        width = w;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public double getArea()
    {
        return length*width;
    }

    public String toString()
    {
        return "dimensions\nlength: " + length + "\twidth: " + width + "\narea: " + getArea();
    }
}
