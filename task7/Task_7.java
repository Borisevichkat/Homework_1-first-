package epam.training.homework1.task7;

import java.io.IOException;

public class Task_7 {

    public static void main(String[] args) throws IOException {
        int x1 = Solution_7.readInt("Введите координаты первой точки (x1):");
        int y1 = Solution_7.readInt("Введите координаты первой точки (y1):");
        int x2 = Solution_7.readInt("Введите координаты второй точки (x2):");
        int y2 = Solution_7.readInt("Введите координаты второй точки (y2):");
        double interval1 = Solution_7.findInterval(x1, y1);
        double interval2 = Solution_7.findInterval(x2, y2);
        Solution_7.printResult(interval1, interval2);
    }
}
