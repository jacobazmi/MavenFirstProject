package jacob;

public class Plane extends Aircraft implements IStore, ICarryPassenger{

    //////////// Attributes/////////////

    private String storageSize;
    private String storageLocation;

    private int passengerQty;
    private String passengerPosition;

    /////////////Constructors/////////////////
    public Plane(String colour, String make, String model, String registration){
        super(colour, make, model,registration);
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
