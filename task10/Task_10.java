package epam.training.homework1.task10;

import java.io.IOException;
import java.util.HashMap;

public class Task_10 {

    public static void main(String[] args) throws IOException {
        int a = Solution_10.readInt("Введите точку а:");
        int b = Solution_10.readInt("Введите точку b:");
        int h = Solution_10.readInt("Введите h:");
        HashMap <Integer, Double > table = Solution_10.createTable(a, b, h);
        Solution_10.printTable(table);
    }
}
