public class Plane extends Vehicle{

    private int numWings;
    private int passengerCount;

    public Plane(String name,int wheels, int passengerCount, int numWings){
        super(name, wheels);
        this.numWings = numWings;
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount(){
        return passengerCount;
    }

    public int getNumWings(){
        return numWings;
    }

    public void fly(int height){
        System.out.println("We are flying " + height + " feet in the air!");
    }

}
