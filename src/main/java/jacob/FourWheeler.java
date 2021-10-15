package jacob;

public abstract class FourWheeler extends Wheeled {

    //////////Attributes//////////

    private String drive;
    private String transmission;

    ///////////Constructors//////////
    public FourWheeler(String registration, String colour, String make, String model, int wheelSize, String driveAxle, String transmission){
        super(registration, colour, make, model, wheelSize);
        this.drive = driveAxle;
        this.transmission = transmission;
    }


    ///////////Methods////////////
}
