package jacob;

import java.util.ArrayList;

public class VehicleCollection {
    /////////Attributes///////

    private ArrayList<Vehicle> vehicles;


    ////////Constructors////////////////

    public VehicleCollection(ArrayList<Vehicle> vehicles){
        this.vehicles = new ArrayList<>(vehicles);
    }

    ///////////Methods///////////////

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
