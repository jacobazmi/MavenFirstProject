package jacob;

public class Helicopter extends Aircraft implements IChangeAltitude, ICarryPassenger{

    //////////Attributes//////////

    private int passengerQty;
    private String passengerPosition;
    private String moveUp;
    private String moveDown;
    private String land;

    //////////Constructors//////////
    public Helicopter(String colour, String make, String model, String registration){
        super(colour, make, model, registration);
        this.moveUp = "Helicopter can move directly up through air";
        this.moveDown = "Helicopter can move directly down through air";
        this.land = "Helicopter can land on helipad";
        this.passengerQty = 4;
        this.passengerPosition = "Car passenger cabin behind pilot cockpit";
    }


    /////////Methods///////////

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

    @Override
    public int passengerQty() {
        return passengerQty;
    }

    @Override
    public String passengerPosition() {
        return passengerPosition;
    }

}
