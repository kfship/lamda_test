package com.dev.lambda;

import java.util.function.Function;


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

        //Function<Person, Person> functionPtr = Person::setName;

        //Reference to an instance moethod of an arbitrary object of a particular type


        Function<Person, Person> functionPtrObj = Person::setArbitraryName;
        //Function<Person, Person> functionPtrObj = (person) -> person.setArbitraryName();

        System.out.println(functionPtrObj.apply(new Person("abc")).getName());

    }
}
