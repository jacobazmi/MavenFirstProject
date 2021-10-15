package jacob;

public class Lorry extends FourWheeler implements ICarryPassenger, IStore{

    //////////Attributes//////////

    private String colour;
    private String size;
    private String make;
    private String model;

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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
