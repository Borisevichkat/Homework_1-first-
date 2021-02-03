package epam.training.homework1.task6;

import java.io.IOException;

public class Task_6 {

    public static void main(String[] args) throws IOException {
        int inputSec = Solution_6.readValue("Введите количество секунд, прошедших с начала суток: ");
        int hours = Solution_6.calculateHours(inputSec);
        int minutes = Solution_6.calculateMinutes(inputSec, hours);
        int seconds = Solution_6.calculateSeconds(inputSec, hours, minutes);
        System.out.println("Прошло " + hours + " часов "+ minutes + " минут " + seconds + " секунд.");
    }
}
