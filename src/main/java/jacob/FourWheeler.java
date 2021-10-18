package jacob;

public abstract class FourWheeler extends Wheeled {

    //////////Attributes//////////

    private String driveAxle;
    private String transmission;

    ///////////Constructors//////////
    protected FourWheeler(String registration, String colour, String make, String model, int wheelSize, String driveAxle, String transmission){
        super(registration, colour, make, model, wheelSize);
        this.driveAxle = driveAxle;
        this.transmission = transmission;
    }


    ///////////Methods////////////
}
