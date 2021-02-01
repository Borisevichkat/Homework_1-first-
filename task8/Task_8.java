package epam.training.homework1.task8;
import java.io.IOException;

public class Task_8 {

    public static void main(String[] args) throws IOException {
        double x = Solution_8.readInt("Введите x:");
        double y = Solution_8.calculateFunc(x);
        Solution_8.printResult(y);
    }

}
