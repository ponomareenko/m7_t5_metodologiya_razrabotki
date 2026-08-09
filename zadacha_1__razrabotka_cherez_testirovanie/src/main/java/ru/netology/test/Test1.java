package ru.netology.test;

import java.util.Map;
import java.util.TreeMap;

public class Test1 {
    static void main(String[] args) {
        Map<Integer, String> users = new TreeMap<>();

        users.put(3, "Alex");
        users.put(1, "Ivan");
        users.put(1, "Semen");

        System.out.println(users);
        // {1=Ivan, 2=Semen, 3=Alex}
    }
}
