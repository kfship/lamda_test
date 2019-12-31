package com.dev.example;

class Person {
    String name;

    //constructor
    public Person(String name){
        this.name = name;
    }

    //instance method 1
    public int personInstanceMethod1(Person person){
        return this.name.compareTo(person.name);
    }

    //instance method 2
    public int personInstanceMethod2(Person person1, Person person2){
        return person1.name.compareTo(person2.name);
    }
}