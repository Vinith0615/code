public package vehicles;

public interface Vehicle {
    void speed();
} {
    
}
package vehicles;

public class Bike implements Vehicle {
    public void speed() {
        System.out.println("Bike speed: 80 km/h");
    }
}
package vehicles;

public class Car implements Vehicle {
    public void speed() {
        System.out.println("Car speed: 150 km/h");
    }
}
import vehicles.Bike;
import vehicles.Car;
import vehicles.Vehicle;

public class TestVehicles {
    public static void main(String[] args) {
        Vehicle myBike = new Bike();
        Vehicle myCar = new Car();

        myBike.speed();
        myCar.speed();
    }
}