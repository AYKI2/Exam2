package person;

import animal.Animal;
import transport.Transport;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private Animal[] animals;
    private Transport[] transports;

    public Person(String name, int age, Animal[] animals, Transport[] transports) {
        if(name.equals(" ")) {
            System.out.println("Name name must not be empty!");
        }else {
            this.name = name;
        }
        if(age > 0) {
            this.age = age;
        }else {
            System.out.println("Age cannot be equal to or less than 0!");
        }
        this.animals = animals;
        this.transports = transports;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Transport[] getTransports() {
        return transports;
    }

    public void setTransports(Transport[] transports) {
        this.transports = transports;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name = " + name +
                ", age = " + age +
                ", \nanimals = " + Arrays.toString(animals) +
                ", \ntransports = " + Arrays.toString(transports);
    }
}
