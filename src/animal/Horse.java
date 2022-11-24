package animal;

import interfaces.AnimalInterface;

public class Horse extends Animal {
    public Horse() {
    }

    public Horse(String name, int speed, AnimalType animalType) {
        super(name, speed, animalType);
    }

    @Override
    public void run() {
        System.out.println(getName() +" speed " + getSpeed() + " km/h");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + "'s favorite food is " + food);
    }

    @Override
    public String toString() {
        return "\nHorse: " + super.toString();
    }


}
