package jacob;


public class Car extends FourWheeler implements IStore, ICarryPassenger{

    //////////Attributes//////////
    private String storageSize;
    private String storageLocation;
    private int passengerQty;
    private String passengerPosition;

    //////////Constructors//////////
    public Car(String colour, String make, String model, String registration, int wheelSize, String driveAxle, String transmission, int passengerQty){
        super(registration, colour, make, model, wheelSize, driveAxle, transmission);
        this.storageSize = "Car has medium storage capacity";
        this.storageLocation = "Boot at back of car";
        this.passengerQty = passengerQty;
        this.passengerPosition = "Car passengers share cabin with driver";
    }





    //////////Methods////////////
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
