package MidExam;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Shape> shapesList = new ArrayList<Shape>();
        shapesList.add(new Rectangle("Rectangle 1", new Point(4,4), 10, 20));
        shapesList.add(new Rectangle("Rectangle 2", new Point(4,4), 10, 30));
        shapesList.add(new Rectangle("Rectangle 3", new Point(4,4), 10, 10));
        shapesList.add(new Circle("Circle 1", new Point(20, 10), 40));
        shapesList.add(new Circle("Circle 2", new Point(20, 10), 10));
        shapesList.add(new Circle("Circle 3", new Point(20, 10), 20));

        displayShapesList(shapesList);
        sortAndDisplayShapesList(shapesList);
    }

    public static void displayShapesList(ArrayList<Shape> shapesList){
        System.out.println("Without Sorting");
        int count = 0;
        for (Shape shape:shapesList) {
            if (shape instanceof Rectangle) {
                System.out.printf("%5d %s\n", ++count, shape);
            }
        }
        count = 0;
        for (Shape shape:shapesList) {
            if (shape instanceof Circle) {
                System.out.printf("%5d %s\n", ++count, shape);
            }
        }
    }

    public static void sortAndDisplayShapesList(ArrayList<Shape> shapesList){
        System.out.println("With sorting in ascending order");
        shapesList.sort(null);
        int count = 0;
        for (Shape shape:shapesList) {
            System.out.printf("%5d %s   Area : %.2f\n", ++count, shape, shape.area());
        }
    }

}
