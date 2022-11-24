package transport;

import interfaces.TransportInterface;

public class Bus extends Transport {
    public Bus() {
    }

    public Bus(String name, int year, TransportType transportType) {
        super(name, year, transportType);
    }

    @Override
    public void fuelConsumption(String fuel, int litre) {
        System.out.println("The" + getName() + " refuels with " + fuel + " and spends " + litre + " liters!");
    }

    @Override
    public String toString() {
        return "\nBus: " + super.toString();
    }
}
