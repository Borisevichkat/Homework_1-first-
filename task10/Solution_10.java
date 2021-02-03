package epam.training.homework1.task10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution_10 {

    protected static int readInt(String comment) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(comment);
        String inputVal = reader.readLine();
        return Integer.parseInt(inputVal);
    }
    protected static HashMap<Integer, Double> createTable(int a, int b, int h){
        HashMap<Integer, Double> pointAndValue = new HashMap<>();
        for(int i = a; i <= b; i += h){
            pointAndValue.put(i, Math.tan(i) );
        }
        return pointAndValue;
    }
    protected static void printTable(HashMap<Integer, Double> hashmap) {
        System.out.println("Точка: Значение: ");
        ArrayList<Integer> keys = new ArrayList<Integer>(hashmap.keySet());
        Collections.sort(keys);
        for(Integer key : keys){
            System.out.println((key) + "    " + hashmap.get(key));
        }
    }

}