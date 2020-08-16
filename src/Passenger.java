public class Passenger {
    private int destination;
    private String name;
    public static int passengerCount;
    public Passenger(int destination, String name){
        this.destination = destination;
        this.name = name;
        ++passengerCount;
    }
    public int getDestination(){
        return this.destination;
    }
    public String getName(){
        return this.name;
    }

    public void setDestination(int destination){
        this.destination = destination;
    }
}


