package jacob;

public class ContainerShip extends Watercraft implements IStore{

    //////////Attributes//////////
    private String storageSize;
    private String storageLocation;

    ///////////Constructors//////////
    public ContainerShip(String colour, String make, String model, String registration){
        super(colour, make, model, registration);
        this.storageSize = "Ship has large storage capacity";
        this.storageLocation = "Ship load stored at rear of ship";
    }


    ///////////Methods////////////
    @Override
    public String storageSize(){
        return storageSize;
    }

    @Override
    public String storageLocation(){
        return storageLocation;
    }

}
