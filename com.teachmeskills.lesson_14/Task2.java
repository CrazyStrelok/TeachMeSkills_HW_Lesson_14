package com.teachmeskills.lesson_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

        List<String> listStud = namesStudent();
        System.out.println(listStud);

        long myName = listStud.stream()
                .filter(n -> n.equalsIgnoreCase("dmitriy"))
                .count();
        System.out.println(myName);

        List<String> filterName = listStud.stream()
                .filter(n -> n.toUpperCase().startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filterName);

        // Закомментирована пустая коллекция

        Optional<List<String>> filterName2 = Optional.of(listStud);
        //Optional<List<String>> filterName2 = Optional.ofNullable(null);


        Boolean present = filterName2.isPresent();
        if (present) {
            Optional<String> fsds =  listStud.stream()
                    .map(String::toUpperCase)
                    .sorted()
                    .findFirst();
            System.out.println(fsds);
        } else {
            System.out.println("Empty");
        }
    }
    private static ArrayList<String> namesStudent() {

        ArrayList<String> namesStr = new ArrayList<>();

        namesStr.add("Dmitriy");
        namesStr.add("dmitriy");
        namesStr.add("Oleg");
        namesStr.add("Andrei");
        namesStr.add("Maksim");
        namesStr.add("Vasya");
        namesStr.add("Tanya");
        namesStr.add("tanya");

        return namesStr;
    }
}








