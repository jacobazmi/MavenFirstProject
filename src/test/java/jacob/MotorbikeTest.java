package jacob;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorbikeTest {

    @Test
    public void testMotorbikeColourMethod() {
        Motorbike testMotorbike = new Motorbike("red","Honda","CB500F",12,"BK56EEP");
        assertEquals("The submarine was not the same colour","red",testMotorbike.getColour());
    }

    @Test
    public void testMotorbikeMakeMethod() {
        Motorbike testMotorbike = new Motorbike("red","Honda","CB500F",12,"BK56EEP");
        assertEquals("The submarine was not the same make","Honda",testMotorbike.getMake());
    }

}
