package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class LocalVariableTypeDemo {

    public static void main(String[] args) {

       //Type Inference
        var str = "Cydeo";
        var number = 5;

        byte x=1;
        var y=1;
        var price = 12.50;

       var numbers = Arrays.asList(3,4,5,6);
       var sum = 0;
       for(var eachNumber:numbers){
           sum += eachNumber;
       }



    }
}
