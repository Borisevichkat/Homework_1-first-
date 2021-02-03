package epam.training.homework1.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_4{

    protected static int[] readInts(String comment) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(comment);
        int[] array = new int[4];
        for(int i = 0; i < 4; i++){
            String inputInt = reader.readLine();
            int a = Integer.parseInt(inputInt);
            array[i] = a;
        }
        return array;
    }

    protected static boolean isEven(int[] arr){
        int count = 0;
        for(int i :arr){
            if(i%2 == 0){
                count++;
            }
            if (count == 2) {
                return true;
            }
        }
        return false;
    }
}