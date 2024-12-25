public class Main {
    public static void main(String[] args) {
        // Примеры сложения
        System.out.println("Sum: " + Calculator.sum(10, 20.5)); // 30.5
        System.out.println("Sum: " + Calculator.sum(5.5, 2));  // 7.5

        // Примеры умножения
        System.out.println("Multiply: " + Calculator.multiply(10, 2.5)); // 25.0
        System.out.println("Multiply: " + Calculator.multiply(3.0, 3)); // 9.0

        // Примеры деления
        System.out.println("Divide: " + Calculator.divide(10, 2));    // 5.0
        System.out.println("Divide: " + Calculator.divide(7.5, 2.5)); // 3.0

        // Примеры вычитания
        System.out.println("Subtract: " + Calculator.subtract(15, 5)); // 10.0
        System.out.println("Subtract: " + Calculator.subtract(10.5, 2.5)); // 8.0

        // Попытка деления на ноль
        try {
            System.out.println("Divide: " + Calculator.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

