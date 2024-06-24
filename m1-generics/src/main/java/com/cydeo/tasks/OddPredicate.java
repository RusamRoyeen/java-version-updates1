package com.cydeo.tasks;

public class OddPredicate implements UnaryPredicate<Integer> {

    @Override
    public boolean test(Integer Obj) {
        return obj %2!=0;

    }

    @Override
    public boolean test(T Obj) {
        return false;
    }
}
