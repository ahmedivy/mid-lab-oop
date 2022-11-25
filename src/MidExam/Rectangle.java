package MidExam;

public class Rectangle extends Shape implements Display{
    private int height;
    private int width;

    public Rectangle(String name, Point point, int height, int width) {
        super(name, point);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public double getDrawableArea() {
        return area();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return String.format("%-15s Center%-7s  width: %d height: %d ", getName(), getPoint(), getHeight(), getWidth());
    }
}
