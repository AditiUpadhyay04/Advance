class Bus {
    private int busId;
    private int noOfSeats;

    Bus(int busId, int noOfSeats) {
        this.busId = busId;
        this.noOfSeats = noOfSeats;
    }

    void setBusData(int busId, int noOfSeats) {
        this.busId = busId;
        this.noOfSeats = noOfSeats;
    }

    void getBusDetails() {
        System.out.println("busId : " + busId + " noOfSeats : " + noOfSeats);
    }
}
public class ConstructorDemo1 {
    public static void main(String[] args) {
        Bus b1 = new Bus(637, 20);
        Bus b2 = new Bus(616, 30);

        b1.getBusDetails();
        b2.getBusDetails();
    }
}
// if we want to initialise the data at the time of object creation so that object can behave properly(constructor)

