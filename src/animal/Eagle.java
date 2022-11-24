package animal;

import interfaces.AnimalInterface;
import interfaces.FlyAble;

public class Eagle extends Animal implements FlyAble {
    public Eagle() {
    }

    public Eagle(String name, int speed, AnimalType animalType) {
        super(name, speed, animalType);
    }

    @Override
    public void run() {
        System.out.println(getName() + " speed " + getSpeed() + " km/h");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + "'s favorite food is " + food);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flies!");
    }

    @Override
    public String toString() {
        return "\nEagle: " + super.toString();
    }


}
