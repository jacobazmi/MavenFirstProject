package jacob;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelicopterTest {

    @Test
    public void testHelicopterColourMethod() {
        Helicopter testHelicopter = new Helicopter("grey","Airbus","H125","BK56EEP");
        assertEquals("The helicopter was not the same colour","grey",testHelicopter.getColour());
    }

    @Test
    public void testHelicopterMakeMethod() {
        Helicopter testHelicopter = new Helicopter("grey","Airbus","H125","BK56EEP");
        assertEquals("The helicopter was not the same colour","grey",testHelicopter.getMake());
    }

    @Test
    public void testHelicopterModelMethod() {
        Helicopter testHelicopter = new Helicopter("grey","Airbus","H125","BK56EEP");
        assertEquals("The helicopter was not the same model","grey",testHelicopter.getModel());
    }

    @Test
    public void testHelicopterRegistrationMethod() {
        Helicopter testHelicopter = new Helicopter("grey","Airbus","H125","BK56EEP");
        assertEquals("The helicopter was not the same registration","grey",testHelicopter.getRegistration());
    }
}
