package jacob;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainerShipTest {

    @Test
    public void testContainerColourMethod() {
        ContainerShip testContainerShip = new ContainerShip("blue","Maersk","V2","BK56EEP");
        assertEquals("The ship was not the same colour","blue",testContainerShip.getColour());
    }
}
