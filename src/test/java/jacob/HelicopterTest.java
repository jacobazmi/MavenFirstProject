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
        assertEquals("The helicopter was not the same make","Airbus",testHelicopter.getMake());
    }

    @Test
    public void testHelicopterModelMethod() {
        Helicopter testHelicopter = new Helicopter("grey","Airbus","H125","BK56EEP");
        assertEquals("The helicopter was not the same model","H125",testHelicopter.getModel());
    }

    @Test
    public void testHelicopterRegistrationMethod() {
        Helicopter testHelicopter = new Helicopter("grey","Airbus","H125","BK56EEP");
        assertEquals("The helicopter was not the same registration","BK56EEP",testHelicopter.getRegistration());
    }

    @Test
    public void testHelicopterMoveUpMethod() {
        Helicopter testHelicopter = new Helicopter("grey","Airbus","H125","BK56EEP");
        assertEquals("The helicopter was not the same up movement","Helicopter can move directly up through air",testHelicopter.moveUp());
    }

    @Test
    public void testHelicopterMoveDownMethod() {
        Helicopter testHelicopter = new Helicopter("grey","Airbus","H125","BK56EEP");
        assertEquals("The helicopter was not the same down movement","Helicopter can move directly down through air",testHelicopter.moveDown());
    }

    @Test
    public void testHelicopterLandMethod() {
        Helicopter testHelicopter = new Helicopter("grey","Airbus","H125","BK56EEP");
        assertEquals("The helicopter was not the same landing","Helicopter can land on helipad",testHelicopter.land());
    }
}
