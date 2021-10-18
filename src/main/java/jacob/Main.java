package jacob;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // unsure if new object needs to be added as Car, Submarine etc. or superclass as interfaces do not work without
        Car car3 = new Car("black","BMW","Series 1","CB15RPD",16,"RWD","Automatic",4);
        Submarine sub1 = new Submarine("yellow","BoatsRUs","BigBoi","18493");
        ContainerShip ship1 = new ContainerShip("blue","Maersk","Y","1SJ578");
        Helicopter heli1 = new Helicopter("white","Airbus","F5","DJSJK67");
        JetSki jetSki1 = new JetSki("green","Hison","HS500","FJ57S2");
        Lorry lorry1 = new Lorry("orange","Saab","V8",22,"FWD","automatic","BK16RRP");


        vehicles.add(car3);
        vehicles.add(sub1);
        vehicles.add(ship1);
        vehicles.add(heli1);
        vehicles.add(jetSki1);
        vehicles.add(lorry1);


        System.out.println("The current collection consists of:");
        for (Vehicle i : vehicles) {
            System.out.println(i.getRegistration() + " " + i.getColour() + " " + i.getMake() + " " + i.getModel());
        }

        System.out.println("There are currently " + vehicles.size() + " in the collection.");

        Scanner scan = new Scanner(System.in);

        String newVehicle = "";
        String addNew;
        String newColour = "";
        String newMake = "";
        String newModel = "";
        String newReg = "";

        int newWheelSize = 0;
        String newDriveAxle = "";
        String newTransmission = "";
        int newPassengerQty= 0;

        System.out.println("Would you like to add a new vehicle?");
        addNew = scan.next();

        if (addNew.equalsIgnoreCase("yes")) {
            System.out.println("What is the new vehicle?");
            newVehicle = scan.next();
            System.out.println("What is the colour?");
            newColour = scan.next();
            System.out.println("What is the make?");
            newMake = scan.next();
            System.out.println("What is the model?");
            newModel = scan.next();
            System.out.println("What is the registration?");
            newReg = scan.next();
            if (newVehicle.equalsIgnoreCase("car")){
                System.out.println("What is the wheel size?");
                newWheelSize = scan.nextInt();
                System.out.println("What is the driving axle?");
                newDriveAxle = scan.next();
                System.out.println("What is the transmission?");
                newTransmission = scan.next();
                System.out.println("What is the passenger capacity?");
                newPassengerQty = scan.nextInt();

                vehicles.add(new Car(newColour,newMake,newModel,newReg,newWheelSize,newDriveAxle,newTransmission,newPassengerQty));
            } else if (newVehicle.equalsIgnoreCase("jetski")){
                vehicles.add(new JetSki(newColour,newMake,newModel,newReg));
            }
            System.out.println("New " + newVehicle + " has been added. There are now " + vehicles.size() + " vehicles in the collection.");
        } else {
            System.out.println("No new vehicles have been added. There are " + vehicles.size() + " in the collection.");
        }

        

    }
}
