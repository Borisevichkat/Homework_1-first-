package epam.training.homework1.task8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_8 {

    protected static double readInt(String comment) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(comment);
        String inputVal = reader.readLine();
        return Integer.parseInt(inputVal);
    }
    protected static double calculateFunc (double x){
        double y;
        if (x >= 3){
            y = -Math.pow(x, 2) + 3*x + 9;
        } else {
            y = 1 / (Math.pow(x, 3) - 6);
        }
        return y;
    }
    protected static void printResult(double result){
        System.out.println("Результат: " + result);
    }

}