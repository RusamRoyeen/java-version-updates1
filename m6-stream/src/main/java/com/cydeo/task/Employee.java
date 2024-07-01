package com.cydeo.task;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {

    private int employeeId;
    private String employeeName;
    private String employeeEmailAddress;
    private List<String> employeePhoneNumber;


}
