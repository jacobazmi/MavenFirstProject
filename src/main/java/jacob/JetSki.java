package jacob;

public class JetSki extends Watercraft{

    ////////////Attributes/////////////////
    private String colour;


    ///////////Constructors//////////////////
    public JetSki(String colour, String make, String model, String registration){
        super(registration, colour, make, model);
    }


    ///////////////Methods/////////////////////


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
