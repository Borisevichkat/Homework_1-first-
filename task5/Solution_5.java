package epam.training.homework1.task5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5 {

    protected static int readInt(String comment) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(comment);
        String inputInt = reader.readLine();
        return Integer.parseInt(inputInt);
    }
    protected static Boolean isPerfectNum(int number) throws IOException {
        int sum = 0;
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum += i;
            }
        }
        if (number == sum) {
            return true;
        }
        return false;
    }

}