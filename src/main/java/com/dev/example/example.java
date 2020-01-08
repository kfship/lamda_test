package com.dev.example;
import java.util.Arrays;
import java.util.function.Function;



public class example {

    public static void main(String args[]) {

        ThisExample te = new ThisExample();
        ThisExample.Inner inner = te.new Inner();
        inner.method();


        Person[] personArray = {new Person("A"), new Person("B")};

        /*
        Function<Person, String> functionPtr = new Function<Person, String>() {
            @Override
            public String apply(Person person) {
                return null;
            }
        };
        */

        //Function<Person, int> functionPtr = Person::personInstanceMethod1;
        //Function<Util, String> functionPtr = x -> x.getInitStr() + "123";
        //System.out.println(functionPtr.apply(new Util("TEST")));

        // Scenario 1 : Getting compiled successfully
        Arrays.sort(personArray, Person::personInstanceMethod1);

        // Scenario 2 : Compile failure
        //Arrays.sort(personArray, Person::personInstanceMethod2);

        // Scenario 3 : Getting compiled successfully.
        Person personInstance = new Person("C");
        Arrays.sort(personArray, personInstance::personInstanceMethod2);

        // Scenario 4 : Getting compiled successfully. As the same way as "Scenario 1"
        String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);


    }
}
