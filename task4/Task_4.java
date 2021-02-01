package epam.training.homework1.task4;
import java.io.IOException;

public class Task_4 {

    public static void main(String[] args) throws IOException {
        int [] array = Solution_4.readInts("Введите числа: ");
        System.out.println(Solution_4.isEven(array));
    }

}
