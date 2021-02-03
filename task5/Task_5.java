package epam.training.homework1.task5;

import java.io.IOException;

public class Task_5 {

    public static void main(String[] args) throws IOException {
        int inputInt = Solution_5.readInt("Введите число:");
        System.out.println(Solution_5.isPerfectNum(inputInt));
    }
}
