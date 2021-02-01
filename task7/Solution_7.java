package epam.training.homework1.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_7{

    protected static int readInt(String comment) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(comment);
        String inputVal = reader.readLine();
        return Integer.parseInt(inputVal);
    }
    protected static double findInterval(double x, double y){
        double interval = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return interval;
    }
    protected static void compareInterval(double interval1, double interval2){
        if (interval1 < interval2){
            System.out.println("Первая точка расположена ближе к началу координат.");
        } else if (interval2 < interval1){
            System.out.println("Вторая точка расположена ближе к началу координат.");
        } else {
            System.out.println("Первая и вторая точка равноудалены от начала координат.");
        }
    }

}