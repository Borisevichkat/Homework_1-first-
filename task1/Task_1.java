package epam.training.homework1.task1;

import java.io.IOException;

public class Task_1 {

    public static void main(String[] args) throws IOException {
        String inputNumber = Solution_1.readValue("Введите число: ");
        System.out.println(Solution_1.findLastSquereNumber(inputNumber));
    }
}