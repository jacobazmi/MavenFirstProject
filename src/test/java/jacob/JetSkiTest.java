package jacob;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JetSkiTest {

    @Test
    public void testJetSkiColourMethod() {
        JetSki testJetSki = new JetSki("grey","Airbus","H125","BK56EEP");
        Assert.assertEquals("The helicopter was not the same colour","grey",testJetSki.getColour());
    }

}
