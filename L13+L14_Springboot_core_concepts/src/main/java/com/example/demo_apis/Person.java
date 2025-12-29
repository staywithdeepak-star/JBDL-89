package com.example.demo_apis;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private  String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        System.out.println("Inside Person parameterized constructor...");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
        System.out.println("Inside Person default constructor..., this = " + this);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
