package com.cydeo.task;

import java.util.List;
import java.util.stream.Stream;



public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println("Print all email");
        EmployeeData.readAll()
                // .map(employee -> employee.getEmployeeEmailAddress())
                .map(Employee::getEmployeeEmailAddress)
                .forEach(System.out::println);

        System.out.println("Print all Phone Numbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmployeePhoneNumber().stream())
                .forEach(System.out::println);


        System.out.println("Print all Phone Numbers with Double Colon");
        EmployeeData.readAll()
                .map(Employee::getEmployeePhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);



    }
}
