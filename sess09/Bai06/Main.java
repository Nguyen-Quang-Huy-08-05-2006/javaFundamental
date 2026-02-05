import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(6));

        double totalArea = 0;

        System.out.println("Ket qua tinh toan hinh hoc:\n");

        for (int i = 0; i < shapes.size(); i++) {
            Shape s = shapes.get(i);
            double area = s.calculateArea();
            totalArea += area;

            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println((i + 1) + ". Hinh tron (r=" + c.getRadius()
                        + ") - Dien tich: " + String.format("%.2f", area));
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                if (r.getWidth() == r.getHeight()) {
                    System.out.println((i + 1) + ". Hinh vuong (canh "
                            + r.getWidth() + ") - Dien tich: " + area);
                } else {
                    System.out.println((i + 1) + ". Hinh chu nhat ("
                            + r.getWidth() + " x " + r.getHeight()
                            + ") - Dien tich: " + area);
                }
            }
            System.out.println();
        }

        System.out.println("=> Tong dien tich cac hinh: "
                + String.format("%.2f", totalArea));
    }
}
