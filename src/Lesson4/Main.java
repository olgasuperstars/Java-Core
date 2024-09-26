package Lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "two", "three", "four", "one", "two", "five", "six", "seven", "one", "nine");
        Set<String> uniqueWords = new LinkedHashSet<>(words);
        System.out.println(uniqueWords);

        Map<String, Integer> countByWords = new HashMap<>();

        for(String word: words){
            if(!countByWords.containsKey(word)){
                countByWords.put(word, 1);
            }else{
                countByWords.put(word, countByWords.get(word) + 1);
            }
        }
        System.out.println(countByWords);

        PhoneBook pb = new PhoneBook();
        pb.add("Uvarov", "+7(929)1234567");
        pb.add("Ivanov", "+7(916)2224567");
        pb.add("Ivanov", "8(800)5553535");
        pb.add("Soloveva", "+1(123)4567890");

        System.out.println("Ivanov : " + pb.get("Ivanov"));
        System.out.println("Soloveva : " + pb.get("Soloveva"));
        System.out.println("Vyshnevsky : " + pb.get("Vyshnevsky"));

    }
}
