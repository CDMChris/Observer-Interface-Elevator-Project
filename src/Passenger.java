public class Passenger implements ElevatorObserver {
    private int destination;
    private String name;
    public static int passengerCount;
    private Elevator mCurrentElevator;

    public Passenger(int destination, String name) {
        mCurrentElevator = null;
        this.destination = destination;
        this.name = name;
        ++passengerCount;

    }

    public void setCurrentElevator(Elevator e) {
        mCurrentElevator = e;
    }

    public int getDestination(){
        return destination;
    }

    public String getName(){
        return name;
    }

    public void setDestination(int destination){
        this.destination = destination;
    }

    public static int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public boolean willBoard(Elevator e) {
        return false;
    }

    public String toString() {
        return name;
    }
}


