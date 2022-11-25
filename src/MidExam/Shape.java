package MidExam;

public abstract class Shape implements Comparable<Shape>{
    private String name;
    private Point point;

    public abstract double area();

    public Shape(String name, Point point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public int compareTo(Shape o) {
        return (int) (this.area() - o.area());
    } 
}
