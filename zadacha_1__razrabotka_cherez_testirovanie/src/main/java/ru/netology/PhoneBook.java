package ru.netology;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, String> listContacts = new TreeMap<>();

    public int add(String name, String phone) {
        listContacts.put(name, phone);
        return listContacts.size();
    }

    public String findByNumber(String phone) {
        for (Map.Entry<String, String> contact : listContacts.entrySet()) {
            if (phone.equals(contact.getValue())) {
                return contact.getKey();
            }
        }
        return null;
    }

    public String findByName() {
        return null;
    }
}
