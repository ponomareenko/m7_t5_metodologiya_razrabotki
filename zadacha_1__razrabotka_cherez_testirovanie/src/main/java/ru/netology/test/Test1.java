package ru.netology.test;

import java.util.Map;
import java.util.TreeMap;

public class Test1 {
    public static Map<String, String> listContacts = new TreeMap<>();

    static void main(String[] args) {
        listContacts.put("Данил", "79624602075");
        listContacts.put("Настя", "79624222661");

        System.out.println(listContacts);

    }

    public String findByNumber(String phone) {
        for (Map.Entry<String, String> contact : listContacts.entrySet()) {
            if (phone.equals(contact.getValue())) {
                return contact.getKey();
            }
        }
        return null;
    }
}
