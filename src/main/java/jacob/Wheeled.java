package jacob;


public abstract class Wheeled extends Vehicle{

    //////////Attributes//////////

    private int wheelSize;

    //////////Constructors//////////

    public Wheeled(String registration, String colour, String make, String model, int wheelSize){
        super(registration, colour, make, model);
        this.wheelSize = wheelSize;
    }


    //////////Methods////////////
}
