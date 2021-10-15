package jacob;

public class Submarine extends Watercraft implements IChangeAltitude{

    ///////////Attributes////////////

    private String colour;
    private String moveUp;
    private String moveDown;
    private String land;


    ///////////Constructors///////////
    public Submarine(String colour, String make, String model, String registration){
        super(registration, colour, make, model);
        this.moveUp = "Submarine can move directly up through water";
        this.moveDown = "Submarine can move directly down through water";
        this.land = "Submarine can surface on open water";
    }

    //////////Methods///////////


    @Override
    public String moveUp(){
        return moveUp;
    }

    @Override
    public String moveDown(){
        return moveDown;
    }

    @Override
    public String land(){
        return land;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
