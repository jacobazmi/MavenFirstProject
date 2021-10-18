package jacob;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void testCarColourMethod() {
        Car testCar = new Car("black","BMW","Series 1","CB15RPD",16,"RWD","Automatic",4);
        assertEquals("The car was not the same colour", "black", testCar.getColour());
    }

    @Test
    public void testCarMakeMethod() {
        Car testCar = new Car("black","BMW","Series 1","CB15RPD",16,"RWD","Automatic",4);
        assertEquals("The car was not the same make", "BMW", testCar.getMake());
    }

    @Test
    public void testCarModelMethod() {
        Car testCar = new Car("black","BMW","Series 1","CB15RPD",16,"RWD","Automatic",4);
        assertEquals("The car was not the same model", "Series 1", testCar.getModel());
    }

    @Test
    public void testCarRegistrationMethod() {
        Car testCar = new Car("black","BMW","Series 1","CB15RPD",16,"RWD","Automatic",4);
        assertEquals("The car was not the same registration", "CB15RPD", testCar.getRegistration());
    }

    @Test
    public void testCarStorageSizeMethod() {
        Car testCar = new Car("black","BMW","Series 1","CB15RPD",16,"RWD","Automatic",4);
        assertEquals("The car was not the same storage size", "Car has medium storage capacity", testCar.storageSize());
    }

    @Test
    public void testCarStorageLocationMethod() {
        Car testCar = new Car("black","BMW","Series 1","CB15RPD",16,"RWD","Automatic",4);
        assertEquals("The car was not the same storage location", "Boot at back of car", testCar.storageLocation());
    }

    @Test
    public void testCarPassengerQtyMethod() {
        Car testCar = new Car("black","BMW","Series 1","CB15RPD",16,"RWD","Automatic",4);
        assertEquals("The car does not have the same passenger location", 4, testCar.passengerQty());
    }

    @Test
    public void testCarPassengerPositionMethod() {
        Car testCar = new Car("black","BMW","Series 1","CB15RPD",16,"RWD","Automatic",4);
        assertEquals("The car does not have the same passenger position", "Car passengers share cabin with driver", testCar.passengerPosition());
    }

}
