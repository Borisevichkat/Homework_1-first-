package epam.training.homework1.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9 {

    protected static int readInt(String comment) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(comment);
        String inputInt = reader.readLine();
        return Integer.parseInt(inputInt);
    }

    protected static double calculateCircumference(double radius){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    protected static double calculateArea(double radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    protected static void printResult( double circumference, double area){
        System.out.println("Длина окружности: " + circumference);
        System.out.println("Площадь круга: " + area);
    }
}