package ru.netology;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, String> listContactsName = new TreeMap<>();
    Map<String, String> listContactsPhone = new TreeMap<>();

    public int add(String name, String phone) {
        listContactsName.put(name, phone);
        listContactsPhone.put(phone, name);
        return listContactsName.size();
    }

    public String findByNumber(String phone) {
        return listContactsPhone.get(phone);
    }

    public String findByName(String name) {
        return listContactsName.get(name);
    }

    public void printAllNames() {
        listContactsName.keySet().stream().forEach(System.out::println);
    }
}
