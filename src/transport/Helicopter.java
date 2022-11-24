package transport;

import interfaces.FlyAble;
import interfaces.TransportInterface;

public class Helicopter extends Transport implements FlyAble {
    public Helicopter() {
    }

    public Helicopter(String name, int year, TransportType transportType) {
        super(name, year, transportType);
    }

    @Override
    public void fuelConsumption(String fuel, int litre) {
        System.out.println("The" + getName() + " refuels with " + fuel + " and spends " + litre + " liters!");
    }
    @Override
    public void fly() {
        System.out.println(getName() + " flies!");
    }

    @Override
    public String toString() {
        return "\nHelicopter: " + super.toString();
    }


}
