package jacob;

public class Motorbike extends TwoWheeler {

    ///////////Attributes/////////////////

    private String colour;
    private String make;
    private String model;

    ////////////Constructors//////////////
    public Motorbike(String colour, String make, String model, int wheelSize, String registration){
        super(registration, colour, make, model, wheelSize);
    }

    ///////////Methods/////////////


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
