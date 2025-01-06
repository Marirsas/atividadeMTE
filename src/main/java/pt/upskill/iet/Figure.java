package pt.upskill.iet;

public abstract class Figure {
    Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double perimeter();

    public abstract double area();
}
