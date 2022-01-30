package com.teachmeskills.lesson_14;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {



        List<Integer> list =getRandom();
        System.out.println(getRandom());

        List <Integer> dlist = list.stream()
                .distinct()
                .filter(n -> (n % 2 == 0) && n >= 7 && n <= 17)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(dlist);

        long countElements = list.stream()
                .count();
        System.out.println("Количевство элементов " + countElements);

        double sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum() / (double) list.size();
        System.out.println("arithmetic average = " + sum);


    }

    private static ArrayList<Integer> getRandom() {

        return (ArrayList<Integer>) new Random()
                .ints(25, 1, 20)
                .boxed()
                .collect(Collectors.toList());
    }
}




