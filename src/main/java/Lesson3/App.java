package Lesson3;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        String[] strs = {"a", "b", "c"};
        System.out.println(Arrays.toString(strs));
        swap(strs, 1,2);
        System.out.println(Arrays.toString(strs));

        List<Apple> apples1 = new ArrayList<>();
        apples1.add(new Apple());
        apples1.add(new Apple());
        apples1.add(new Apple());

        List<Apple> apples2 = new ArrayList<>();
        apples2.add(new Apple());
        apples2.add(new Apple());

        Box<Apple> appleBox1 = new Box<>(apples1);
        Box<Apple> appleBox2 = new Box<>(apples2);

        System.out.println("Apples1 weight = " + appleBox1.getWeight());
        System.out.println("Apples2 weight = " + appleBox2.getWeight());
        System.out.println("Apples1 compare to Apples2 = " + appleBox1.compare(appleBox2));
        System.out.println("Put Apples1 to Apples2");
        appleBox1.putAllToOther(appleBox2);
        System.out.println("Apples1 weight = " + appleBox1.getWeight());
        System.out.println("Apples2 weight = " + appleBox2.getWeight());

        List<Orange> oranges1 = new ArrayList<>();
        oranges1.add(new Orange());
        oranges1.add(new Orange());
        oranges1.add(new Orange());
        oranges1.add(new Orange());
        oranges1.add(new Orange());

        List<Orange> oranges2 = new ArrayList<>();
        oranges2.add(new Orange());
        oranges2.add(new Orange());

        Box<Orange> orangeBox1 = new Box<>(oranges1);
        Box<Orange> orangeBox2 = new Box<>(oranges2);

        System.out.println("Oranges1 weight = " + orangeBox1.getWeight());
        System.out.println("Oranges2 weight = " + orangeBox2.getWeight());
        System.out.println("Oranges1 compare to Oranges2 = " + orangeBox1.compare(orangeBox2));
        System.out.println("Put Oranges1 to Oranges2");
        orangeBox1.putAllToOther(orangeBox2);
        System.out.println("Oranges1 weight = " + orangeBox1.getWeight());
        System.out.println("Oranges2 weight = " + orangeBox2.getWeight());
    }

    public static void swap(Object[] array, int index1, int index2){
        Object tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
