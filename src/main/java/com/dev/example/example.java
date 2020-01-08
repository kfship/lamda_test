package com.dev.example;
import com.dev.example.range.ThisExample;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;


public class example {

    public static void main(String args[]) {


        Person[] personArray = {new Person("A"), new Person("B")};

        /*
        Function<Person, Person> functionPtr = new Function<Person, Person>() {

            @Override
            public Person apply(Person person) {
                return person.setArbitraryName();
            }
        };
        */

        Function<Person, Person> functionPtr = Person::setArbitraryName;

    }
}
