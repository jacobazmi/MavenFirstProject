package jacob;

public class Lorry extends FourWheeler implements IStore{

    //////////Attributes//////////

    private String storageSize;
    private String storageLocation;

    //////////Constructors//////////

    public Lorry(String colour, String make, String model, int wheelSize, String driveAxle, String transmission, String registration){
        super(registration, colour, make, model, wheelSize, driveAxle, transmission);
        this.storageSize = "Lorry has large storage capacity";
        this.storageLocation = "Lorry storage is in a unit connected to the rear of the cab";
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

}
