import java.util.ArrayList;

public class Elevator {
    private int floor;
    private ArrayList<Passenger> listOfPassengers;
    private ArrayList<ElevatorObserver> mObservers;

    public Elevator(int floor){
        listOfPassengers = new ArrayList<>();
        this.floor = floor;
    }

    public void registerObserver(ElevatorObserver e) {
        mObservers.add(e);
    }
    public int getFloor(){
        return this.floor;
    }

    public void setFloor(int floor) {
        announceFloorChanged();
        this.floor = floor;
    }

    public void addPassenger(Passenger pass) {
        listOfPassengers.add(pass);
    }

    public void removePassenger(Passenger p) {
        if (p.getDestination() == floor) {
            listOfPassengers.remove(p);
        }
        else {
            System.out.println("Passenger " + p + " is not on his floor");
        }
    }

    public Passenger getPassenger(int index) {
        return listOfPassengers.get(index);
    }

    public ArrayList<Passenger> getListOfPassengers() {
        return listOfPassengers;
    }

    public void announceFloorChanged() {
        for (ElevatorObserver obs : mObservers) {
            obs.willBoard(this);
        }
    }

    public static void main(String[] args) {
        Elevator el = new Elevator(1);
        Passenger c = new Passenger(5, "c");
        System.out.println(c);
    }
}
