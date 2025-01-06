package pt.upskill.iet;

public class Rectangle extends Figure {
    Point upperLeft;
    Point bottomRight;

    public Rectangle(Point upperLeft, Point bottomRight , Color color)
    {    super(color);
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public double perimeter() {
        double width = Math.abs(bottomRight.getxCoord() - upperLeft.getyCoord());
        double height = Math.abs(bottomRight.getyCoord() - upperLeft.getyCoord());
        return 2 * (width + height);
    }

    @Override
    public double area() {
        double width = Math.abs(bottomRight.getxCoord() - upperLeft.getxCoord());
        double height = Math.abs(bottomRight.getyCoord() - upperLeft.getyCoord());
        return width * height;
    }
}
