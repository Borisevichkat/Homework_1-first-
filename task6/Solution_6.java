package epam.training.homework1.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_6{

    protected static int readValue(String comment) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(comment);
        String sSec = reader.readLine();
        return Integer.parseInt(sSec);
    }

    protected static int calculateHours(int sec){
        int hours = sec / 3600;
        return hours;
    }

    protected static int calculateMinutes(int sec, int hours) {
        int minutes = (sec - hours * 3600) / 60;
        return minutes;
    }
    
    protected static int calculateSeconds(int sec, int hours, int minutes){
        int seconds = sec - hours*3600 - minutes*60;
        return seconds;
    }
}