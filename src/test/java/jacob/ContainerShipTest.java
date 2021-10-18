package jacob;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainerShipTest {

    @Test
    public void testContainerColourMethod() {
        ContainerShip testContainerShip = new ContainerShip("blue","Maersk","V2","BK56EEP");
        assertEquals("The ship was not the same colour","blue",testContainerShip.getColour());
    }

    @Test
    public void testContainerMakeMethod() {
        ContainerShip testContainerShip = new ContainerShip("blue","Maersk","V2","BK56EEP");
        assertEquals("The ship was not the same make","Maersk",testContainerShip.getMake());
    }

    @Test
    public void testContainerModelMethod() {
        ContainerShip testContainerShip = new ContainerShip("blue","Maersk","V2","BK56EEP");
        assertEquals("The ship was not the same model","V2",testContainerShip.getModel());
    }

    @Test
    public void testContainerRegistrationMethod() {
        ContainerShip testContainerShip = new ContainerShip("blue","Maersk","V2","BK56EEP");
        assertEquals("The ship was not the same reg","BK56EEP",testContainerShip.getRegistration());
    }

    @Test
    public void testContainerStorageSizeMethod() {
        ContainerShip testContainerShip = new ContainerShip("blue","Maersk","V2","BK56EEP");
        assertEquals("The ship was not the same storage size","Ship has large storage capacity",testContainerShip.storageSize());
    }

    @Test
    public void testContainerStorageLocationMethod() {
        ContainerShip testContainerShip = new ContainerShip("blue","Maersk","V2","BK56EEP");
        assertEquals("The ship was not the same storage location","Ship load stored at rear of ship",testContainerShip.storageLocation());
    }
}
