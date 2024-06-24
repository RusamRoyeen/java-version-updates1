package com.cydeo.tasks;

public class OddPredicate implements UnaryPredicate<Integer> {

    @Override
    public boolean test(Integer Obj) {

        int obj = 0;
        return obj %2!=0;

    }

}
