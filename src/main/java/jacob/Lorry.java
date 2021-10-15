package jacob;

public class Lorry extends FourWheeler implements ICarryPassenger, IStore{

    //////////Attributes//////////

    private String storageSize;
    private String storageLocation;
    private int passengerQty;
    private String passengerPosition;

    //////////Constructors//////////

    public Lorry(String colour, String make, String model, int wheelSize, String driveAxle, String transmission, String registration){
        super(registration, colour, make, model, wheelSize, driveAxle, transmission);
        this.storageSize = "Lorry has large storage capacity";
        this.storageLocation = "Lorry storage is in a unit connected to the rear of the cab";
    }



    //////////Methods////////////


    @Override
    public int passengerQty() {
        return passengerQty;
    }

    @Override
    public String passengerPosition() {
        return passengerPosition;
    }

    @Override
    public String storageSize(){
        return storageSize;
    }

    @Override
    public String storageLocation(){
        return storageLocation;
    }

}
