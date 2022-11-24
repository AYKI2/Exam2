import animal.Animal;
import animal.AnimalType;
import animal.Eagle;
import animal.Horse;
import person.Person;
import transport.Bus;
import transport.Helicopter;
import transport.Transport;
import transport.TransportType;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Person person1 = new Person("Asan",20,new Animal[]{
                new Horse("Betsy",80, AnimalType.DOMESTIC_ANIMAL),
                new Eagle("Storm",120, AnimalType.BIRD)
        },new Transport[]{
                new Bus("BUZ",1999,TransportType.ROAD_TRANSPORT),
                new Bus("UAZ",2001,TransportType.ROAD_TRANSPORT),
                new Helicopter("Boing",2010,TransportType.AIR_TRANSPORT)
        });
        Person person2 = new Person("Uson",25,new Animal[]{
                new Horse("Alaa",100, AnimalType.DOMESTIC_ANIMAL),
                new Eagle("Teza",135, AnimalType.BIRD)
        },new Transport[]{
                new Bus("Zaka",2000,TransportType.ROAD_TRANSPORT),
                new Bus("KAIa",2013,TransportType.ROAD_TRANSPORT),
                new Helicopter("Air",2020,TransportType.AIR_TRANSPORT)
        });
        Person person3 = new Person("Adyl",35,new Animal[]{
                new Horse("Maki",120, AnimalType.DOMESTIC_ANIMAL),
                new Eagle("Groza",150, AnimalType.BIRD)
        },new Transport[]{
                new Bus("ZUB",1997,TransportType.ROAD_TRANSPORT),
                new Bus("NAK",2005,TransportType.ROAD_TRANSPORT),
                new Helicopter("Peak",2015,TransportType.AIR_TRANSPORT)
        });
        Person[] people = {person1, person2,person3};

        Animal horse1 = new Horse("Betsy",80, AnimalType.DOMESTIC_ANIMAL);
        Animal horse2 = new Horse("Alal",100, AnimalType.DOMESTIC_ANIMAL);
        Animal eagle1 = new Eagle("Storm",120, AnimalType.BIRD);
        Animal eagle2 = new Eagle("Groza",150, AnimalType.BIRD);
        Animal[] animals = {horse1,horse2,eagle1,eagle2};

        Transport transport1 = new Bus("ZUB",1997,TransportType.ROAD_TRANSPORT);
        Transport transport2 = new Bus("NAK",2005,TransportType.ROAD_TRANSPORT);
        Transport transport3 = new Helicopter("Peak",2015,TransportType.AIR_TRANSPORT);
        Transport transport4 = new Helicopter("Peak",2015,TransportType.AIR_TRANSPORT);
        Transport[] transports = {transport1,transport2,transport3,transport4};
        boolean isTrue = true;

        while (isTrue){
            System.out.println("Choice 1(Find by name), 2(Animal methods), 3(Transport methods), 4(break): ");
            int number = input.nextInt();
            switch (number){
                case 1:
                    System.out.println("Write name:");
                    method1(input.next(), people);
                    System.out.println();
                    break;
                case 2:
                    method2(animals);
                    break;
                case 3:
                    method3(transports);
                    break;
                case 4:
                    isTrue = false;
                    break;
                default:
                    System.out.println("No such a number!");
                    break;
            }
        }

    }
    public static void method1(String name, Person[] people){
        for (Person person:people) {
            if (name.equals(person.getName())) {
                System.out.println(person);
            }
        }
    }
    public static void method2(Animal[] animals) {
        int counterBird = 0;
        int counterDomestic = 0;
        for (Animal animal : animals) {
            if (AnimalType.DOMESTIC_ANIMAL.equals(animal.getAnimalType())) {
                counterDomestic++;
            } else {
                counterBird++;
            }
        }
        Horse[] horses = new Horse[counterDomestic];
        Eagle[] eagles = new Eagle[counterBird];
        int index1= 0;
        int index2 = 0;
        for (int i = 0; i < animals.length; i++) {
            if (AnimalType.DOMESTIC_ANIMAL.equals(animals[i].getAnimalType())) {
                horses[index1] = (Horse) animals[i];
                index1++;
            } else {
                eagles[index2] = (Eagle) animals[i];
                index2++;
            }
        }
        for (Horse horse:horses) {
            horse.run();
            horse.eat("hay");
            System.out.println();
        }
        for (Eagle eagle:eagles) {
            eagle.run();
            eagle.eat("meat");
            eagle.fly();
            System.out.println();
        }

        System.out.println(Arrays.toString(horses));
        System.out.println(Arrays.toString(eagles));
    }
    public static void method3 (Transport[] transports){
        int counterAir = 0;
        int counterRoad = 0;
        for (Transport transport : transports) {
            if (TransportType.ROAD_TRANSPORT.equals(transport.getTransportType())) {
                counterRoad++;
            } else {
                counterAir++;
            }
        }
        Bus[] buses = new Bus[counterRoad];
        Helicopter[] helicopters = new Helicopter[counterAir];
        int index1= 0;
        int index2 = 0;
        for (int i = 0; i < transports.length; i++) {
            if (TransportType.ROAD_TRANSPORT.equals(transports[i].getTransportType())) {
                buses[index1] = (Bus) transports[i];
                index1++;
            } else {
                helicopters[index2] = (Helicopter) transports[i];
                index2++;
            }
        }
        for (Bus bus:buses) {
            bus.fuelConsumption("gasoline",10);
            System.out.println();
        }
        for (Helicopter helicopter:helicopters) {
            helicopter.fuelConsumption("kerosene",15);
            helicopter.fly();
            System.out.println();
        }

        System.out.println(Arrays.toString(buses));
        System.out.println(Arrays.toString(helicopters));
    }
}