package jacob;

public abstract class Vehicle {

    //////////Attributes//////////

    private String registration;
    private String colour;
    private String make;
    private String model;


    //////////Constructors//////////

    public Vehicle(String registration, String colour, String make, String model){
        this.registration = registration;
        this.colour = colour;
        this.make = make;
        this.model = model;
    }


    //////////Methods////////////

    public void stop(){
        System.out.println("Vehicle is off");
    }

    public void start(){
        System.out.println("Vehicle is on");
    }


    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
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
