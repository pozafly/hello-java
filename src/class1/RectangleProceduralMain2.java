package class1;

public class RectangleProceduralMain2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.initialData(5, 8);
        rectangle.print();
    }
}

class Rectangle {
    int width;
    int height;

    void initialData(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }

    void print() {
        System.out.println("넓이: " + calculateArea());
        System.out.println("둘레 길이: " + calculatePerimeter());
        System.out.println("정사각형 여부: " + isSquare());
    }
}