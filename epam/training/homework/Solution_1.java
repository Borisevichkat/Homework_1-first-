package epam.training.homework1.task1;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


class Solution_1{

    protected static String readValue() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputNumber;
        return inputNumber = reader.readLine();
    }
    protected static String findLastSquereNumber(String a){
        String lastInputNumber = a.substring(a.length()-1);
        double lastInputNumSquere = Math.pow(Integer.parseInt(lastInputNumber), 2);
        int squereFullNumber = (int) lastInputNumSquere;
        String finalSquere = Integer.toString(squereFullNumber);
        return finalSquere.substring(finalSquere.length()-1);
    }
}
