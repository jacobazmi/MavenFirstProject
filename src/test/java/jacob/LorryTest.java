package jacob;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LorryTest {

    @Test
    public void testLorryColourMethod() {
        Lorry testLorry = new Lorry("black","Renault","Series 1",16,"FWD","Automatic","CB15RPD");
        assertEquals("The lorry was not the same colour", "Renault", testLorry.getColour());
    }

    @Test
    public void testLorryStorageSizeMethod() {
        Lorry testLorry = new Lorry("black","Renault","Series 1",16,"FWD","Automatic","CB15RPD");
        assertEquals("The lorry was not the same storage size", "Lorry has large storage capacity", testLorry.storageSize());
    }

    @Test
    public void testLorryStorageLocationMethod() {
        Lorry testLorry = new Lorry("black","Renault","Series 1",16,"FWD","Automatic","CB15RPD");
        assertEquals("The lorry was not the same storage size", "Lorry storage is in a unit connected to the rear of the cab", testLorry.storageLocation());
    }
}
