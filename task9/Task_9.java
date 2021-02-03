package epam.training.homework1.task9;

import java.io.IOException;

public class Task_9 {

    public static void main(String[] args) throws IOException {
        double radius = Solution_9.readInt("Введите радиус:");
        double circumference = Solution_9.calculateCircumference(radius);
        double area = Solution_9.calculateArea(radius);
        Solution_9.printResult(circumference, area);
    }
}


