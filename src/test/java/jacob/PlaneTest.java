package jacob;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    @Test
    public void testPlaneColourMethod() {
        Plane testPlane = new Plane("grey","Boeing","737","BK56EEP");
        assertEquals("The plane was not the same colour","grey",testPlane.getColour());
    }

    @Test
    public void testPlaneMakeMethod() {
        Plane testPlane = new Plane("grey","Boeing","737","BK56EEP");
        assertEquals("The plane was not the same make","Boeing",testPlane.getMake());
    }

    @Test
    public void testPlaneModelMethod() {
        Plane testPlane = new Plane("grey","Boeing","737","BK56EEP");
        assertEquals("The plane was not the same model","737",testPlane.getModel());
    }

    @Test
    public void testPlaneRegistrationMethod() {
        Plane testPlane = new Plane("grey","Boeing","737","BK56EEP");
        assertEquals("The plane was not the same reg","BK56EEP",testPlane.getRegistration());
    }


    @Test
    public void testPlaneStorageSizeMethod() {
        Plane testPlane = new Plane("grey","Boeing","737","BK56EEP");
        assertEquals("The plane was not the same storage size","Plane has large storage capacity",testPlane.storageSize());
    }

    @Test
    public void testPlaneStorageLocationMethod() {
        Plane testPlane = new Plane("grey","Boeing","737","BK56EEP");
        assertEquals("The plane was not the same storage size","Plane storage is beneath passenger cabin",testPlane.storageLocation());
    }
}
