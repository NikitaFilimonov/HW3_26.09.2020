package ru.geekbrains.lessons;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String[] word = {"hi", "hello", "bye", "hello", "cat", "dog", "dog", "cow", "bye", "apple", "duck"};
        HashMap<String, Integer> map = new HashMap<>();
        for (String x : word) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        System.out.println(map);


        Phonebook phonebook = new Phonebook();
        phonebook.addContact("Ivanov", "+79031234567");
        phonebook.addContact("Petrov", "+79161234567");
        phonebook.addContact("Sidorov", "+79261234567");
        phonebook.addContact("Petrov", "+79051234567");
        phonebook.addContact("Ivanov", "+79851234567");

        phonebook.findAndPrintContact("Ivanov");
        phonebook.findAndPrintContact("Petrov");
        phonebook.findAndPrintContact("Sidorov");

    }

}
