package Lesson5;

import java.io.*;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        File file = new File("students.csv");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Student> studentArrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("students.csv"))) {
            String tempString;
            while ((tempString = bufferedReader.readLine()) != null) {
                String[] studentParamsArray = tempString.split(";");
                studentArrayList.add(new Student(studentParamsArray[0], studentParamsArray[1],
                        Integer.parseInt(studentParamsArray[2])));
            }  //Oleg Tikhonov 29
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(studentArrayList);

        try (PrintWriter printWriter = new PrintWriter("new_students.csv")) {
            for (Student student : studentArrayList) {
                printWriter.println(student.toString());
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
