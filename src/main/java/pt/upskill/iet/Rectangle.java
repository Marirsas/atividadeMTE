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
       return 0;
    }
}
