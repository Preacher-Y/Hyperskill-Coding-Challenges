import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%.2f", new Square(scanner.nextDouble()).getArea());
    }
}

sealed interface ShapeInterface permits Square {
    double getArea();
}

// Implement the Square class here
final class Square implements ShapeInterface{
    private final double area;
    public Square(double area){
        this.area = area;
    }
    @Override
    public double getArea() {
        return this.area * this.area;
    }
}