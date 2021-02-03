package epam.training.homework1.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution_2{

    protected static int readInt(String comment) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(comment);
        String inputVal = reader.readLine();
        return Integer.parseInt(inputVal);
    }

    protected static int calculateDays(int year, int month) {
        int numberOfDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return numberOfDays = 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return numberOfDays = 30;
            case 2:
                if(year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))){
                    return numberOfDays = 29;
                } else {
                    return numberOfDays = 28;
                }
        }
        return numberOfDays;
    }

    protected static void printNumberOfDays (int number){
        System.out.println("Количество дней: " + number);
    }
}