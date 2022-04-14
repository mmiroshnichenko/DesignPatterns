package net.mmiroshnichenko.basepatterns.creational.builder;

public class Car {
    private Type type;
    private int seatPlaces;
    private int price;

    public void setType(Type type) {
        this.type = type;
    }

    public void setSeatPlaces(int seatPlaces) {
        this.seatPlaces = seatPlaces;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", seatPlaces=" + seatPlaces +
                ", price=" + price +
                '}';
    }
}
