package com.example.duyguturkmen.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class EmployeeList {

    @SerializedName("employeeList")
    private ArrayList<Employee> employeeList;

    public ArrayList<Employee>  getEmployeeList(){

        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
