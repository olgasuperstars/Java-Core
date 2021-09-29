package Lesson4;

import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> phonesByLastNames = new HashMap<>();

    public void add(String lastName, String phone){
        List<String> phones = phonesByLastNames.get(lastName);
        if(phones == null){
            phones = new ArrayList<>();
            phonesByLastNames.put(lastName, phones);
        }
        phones.add(phone);
    }

    public List<String> get(String lastName) {
        return phonesByLastNames.getOrDefault(lastName, Collections.emptyList());
    }
}
