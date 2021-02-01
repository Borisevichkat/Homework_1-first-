package epam.training.homework1.task3;
import java.io.IOException;

public class Task_3 {

    public static void main(String[] args) throws IOException {
        int bigSquare = Solution_3.readInt("Введите площадь первого квадрата: ");
        System.out.println(Solution_3.calculateRatio(bigSquare));
    }

}
