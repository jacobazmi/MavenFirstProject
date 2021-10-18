package jacob;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // unsure if new object needs to be added as Car, Submarine etc. or superclass as interfaces do not work without
        Car car3 = new Car("black","BMW","Series 1","CB15RPD",16,"RWD","Automatic",4);
        Submarine sub1 = new Submarine("yellow","BoatsRUs","BigBoi","18493");

        vehicles.add(car3);
        vehicles.add(sub1);


        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getRegistration() + " " + vehicle.getColour() + " " + vehicle.getMake() + " " + vehicle.getModel());
        }

    }
}
