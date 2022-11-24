package transport;

import interfaces.TransportInterface;

public abstract class Transport implements TransportInterface{
    private String name;
    private int year;
    private TransportType transportType;

    public Transport() {
    }

    public Transport(String name, int year, TransportType transportType) {
        if(name.length() > 0) {
            this.name = name;
        }else {
            System.out.println("Transport name must not be empty!");
        }
        if (year > 0) {
            this.year = year;
        }else {
            System.out.println("Year cannot be equal to or less than 0!");
        }
        this.transportType = transportType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    @Override
    public String toString() {
        return "Transport: " +
                "name = " + name.toUpperCase() +
                ", year = " + year +
                ", transportType = " + transportType;
    }
}
