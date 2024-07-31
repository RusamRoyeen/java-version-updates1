package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);
        //toCollections(Supplier) : is used to create a Collection using Collector
        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);


        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 ==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        System.out.println("toList:returns a Collector interface that gather the input data into a new list");

        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numberList2);

        System.out.println("toSet() : returns a Collector interface that gather the input data into a new set");
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x-> x%2 ==0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        System.out.println("toMap(Function, Function) : returns a Collector interface that gather the input data into a new map");
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishMap);

        System.out.println("summingInt(ToIntFunction) : returns a Collector that produces the sum of a Integer-valued function");
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        System.out.println("counting() returns a Collector that counts the number of the elements");
        Long evenCount = numbers.stream()
                .collect(Collectors.counting());

        System.out.println(evenCount);

        System.out.println("averagingInt(ToIntFunction) : returns the average of the numbers of the elements");
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(calorieAverage);

        System.out.println("joining() : returns a Collector that joins the elements");
        List<String> courses = Arrays.asList("Java", "C#", "Python", "PHP");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);








        
    }
}
