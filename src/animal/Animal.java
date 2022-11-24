package animal;

import interfaces.AnimalInterface;

public abstract class Animal implements AnimalInterface{
    private String name;
    private int speed;
    private AnimalType animalType;

    public Animal() {
    }

    public Animal(String name, int speed, AnimalType animalType) {
        if(name.length() > 3) {
            this.name = name;
        }else {
            System.out.println("Animal name must be greater than 3!");
        }
        if(speed > 0) {
            this.speed = speed;
        }else {
            System.out.println("Speed cannot be equal to or less than 0!");
        }
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal: " +
                "name = " + name +
                ", speed = " + speed +
                ", animalType = " + animalType;
    }


}
