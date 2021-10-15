package jacob;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest2 {

    @Test
    public void testCarColourMethod() {
        Car testCar = new Car("black","BMW","Series 1","CB15RPD",16,"RWD","Automatic",4);
        assertEquals("The car was nt the same colour", "Red", testCar.getColour());
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

}
