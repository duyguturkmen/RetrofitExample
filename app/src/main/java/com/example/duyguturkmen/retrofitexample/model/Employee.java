package com.example.duyguturkmen.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

public class Employee {
    @SerializedName("name")
    private String name;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private int phone;

    public Employee(String name, String email,int phone){
            this.name=name;
            this.email=email;
            this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
