package jacob;

public class Plane extends Aircraft implements IStore, ICarryPassenger{

    //////////// Attributes/////////////

    private String storageSize = "Car has medium storage capacity";
    private String storageLocation = "Boot at back of car";

    private int passengerQty;
    private String passengerPosition;

    /////////////Constructors/////////////////
    public Plane(String colour, String make, String model, String registration){
        super(registration, colour, make, model);
        this.storageSize = "Plane has large storage capacity";
        this.storageLocation = "Plane storage is beneath passenger cabin";
    }

    ////////////Methods///////////////////


    @Override
    public String storageSize(){
        return storageSize;
    }

    @Override
    public String storageLocation(){
        return storageLocation;
    }

    @Override
    public int passengerQty() {
        return passengerQty;
    }

    @Override
    public String passengerPosition() {
        return passengerPosition;
    }

}
