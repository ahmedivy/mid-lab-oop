package MidExam;

public class Circle extends Shape implements Display {
    private int radius;

    public Circle(String name, Point point, int radius) {
        super(name, point);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getDrawableArea() {
        return area();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setPoint(Point point) {
        setPoint(point);;
    }

    @Override
    public String toString() {
        return String.format("%-15s Center%-7s  radius: %d ", getName(), getPoint(), getRadius());
    }

    
}
