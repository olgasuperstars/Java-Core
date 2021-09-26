package Lesson5;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class App {
    public static void main(String[] args) {
        File file = new File("students.csv");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AppData appData = new AppData();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("students.csv"))) {
            String tempString;
            String[] headers = bufferedReader.readLine().split(";");
            appData.setHeader(headers);
            List<int[]> lines = new ArrayList<>();
            while ((tempString = bufferedReader.readLine()) != null) {
                String[] stringLine = tempString.split(";");
                int[] intLine = new int[stringLine.length];
                for(int i = 0; i < intLine.length; i++){
                    intLine[i] = Integer.parseInt(stringLine[i]);
                }
                lines.add(intLine);
            }
            appData.setData(lines.toArray(new int[lines.size()][headers.length]));
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (PrintWriter printWriter = new PrintWriter("new_students.csv")) {
           printWriter.println(String.join(";", appData.getHeader()));
           for(int[] line : appData.getData()){
               List<String> strLine = Arrays.stream(line).mapToObj(a -> Integer.toString(a)).collect(Collectors.toList());
               printWriter.println(String.join(";",strLine.toArray(new String[strLine.size()])));
           }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
