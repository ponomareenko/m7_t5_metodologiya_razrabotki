package ru.netology.test;

import java.util.Map;
import java.util.TreeMap;

public class Test1 {
    public static Map<String, String> listContacts2 = new TreeMap<>();

    static void main(String[] args) {
        listContacts2.put("Данил", "79624602075");
        listContacts2.put("Настя", "79624222661");

        System.out.println(listContacts2);

        listContacts2.keySet()
                .stream()
                .forEach(System.out::println);
    }

    public String findByNumber(String phone) {
        for (Map.Entry<String, String> contact : listContacts2.entrySet()) {
            if (phone.equals(contact.getValue())) {
                return contact.getKey();
            }
        }
        return null;
    }
}
