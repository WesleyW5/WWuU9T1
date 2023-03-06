public class VehicleRunner
{
    public static void main(String[] args)
    {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn(90);
        myVehicle.brake(0.25);

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(-90); // inherited method
        myCar.brake(0.50); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR TEST CODE BELOW! ----
        // testing all available methods on a Bicycle object
        System.out.println();

        Bicycle bike = new Bicycle("Mons", 2,80);
        bike.ringBell();
        System.out.println(bike.getGearCount());
        bike.move(80);
        bike.turn(89);
        bike.brake(100);

        System.out.println();

        Plane plane = new Plane("Plane", 8, 266, 4);
        plane.fly(9566);
        System.out.println(plane.getNumWings());
        System.out.println(plane.getPassengerCount());
        System.out.println(plane.getWheels());
        plane.brake(90);
        plane.turn(90);
        plane.move(90);

    }
}
