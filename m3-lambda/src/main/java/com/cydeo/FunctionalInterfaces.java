package com.cydeo;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };
    }
}
