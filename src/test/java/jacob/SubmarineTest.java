package jacob;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubmarineTest {

    @Test
    public void testSubmarineColourMethod() {
        Submarine testSubmarine = new Submarine("yellow","BoatsRUs","BigBoi","18493");
        assertEquals("The submarine was not the same colour","yellow",testSubmarine.getColour());
    }

    @Test
    public void testSubmarineMakeMethod() {
        Submarine testSubmarine = new Submarine("yellow","BoatsRUs","BigBoi","18493");
        assertEquals("The submarine was not the same make","BoatsRUs",testSubmarine.getMake());
    }

    @Test
    public void testSubmarineModelMethod() {
        Submarine testSubmarine = new Submarine("yellow","BoatsRUs","BigBoi","18493");
        assertEquals("The submarine was not the same model","BigBoi",testSubmarine.getModel());
    }

    @Test
    public void testSubmarineRegistrationMethod() {
        Submarine testSubmarine = new Submarine("yellow","BoatsRUs","BigBoi","18493");
        assertEquals("The submarine was not the same registration","18493",testSubmarine.getRegistration());
    }
}
