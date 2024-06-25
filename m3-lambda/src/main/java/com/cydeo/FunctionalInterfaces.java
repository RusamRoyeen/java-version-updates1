package com.cydeo;

import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };


        System.out.println("******************* PREDICATE *************************");

        Predicate<Integer> lesserThan = i -> i<18;
        System.out.println(lesserThan.test(20));

        System.out.println("******************* CONSUMER *************************");

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        System.out.println("******************* BI CONSUMER *************************");

        BiConsumer<Integer, Integer> addTwo = (x, y) ->System.out.println(x+y);
        addTwo.accept(1,2);

        System.out.println("******************* FUNCTION *************************");
        Function<String, String> fun = s -> "Hello" + s;
        System.out.println(fun.apply(" Cydeo"));

        System.out.println("******************* BI FUNCTION *************************");
        BiFunction<Integer, Integer, Integer> func = (x, y) -> x+y;
        System.out.println(func.apply(10,20));





    }
}
