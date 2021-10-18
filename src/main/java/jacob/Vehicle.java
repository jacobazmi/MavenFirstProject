package jacob;

public abstract class Vehicle {

    //////////Attributes//////////

    private String registration;
    private String colour;
    private String make;
    private String model;


    //////////Constructors//////////

    protected Vehicle(String registration, String colour, String make, String model){
        this.registration = registration;
        this.colour = colour;
        this.make = make;
        this.model = model;
    }


    //////////Methods////////////


    public String getRegistration() {
        return registration;
    }


    public String getColour() {
        return colour;
    }


    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }

}
