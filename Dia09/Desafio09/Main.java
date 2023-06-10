package Dia09.Desafio09;

// Imports of JUnit Library
import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;

public class Main extends TestCase {
    public Main(String name) {
        super(name);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(Main.class);
        return suite;
    }

    public void testNegation() {
        assertEquals(-2, NumberUtilities.negation(2));
    }

    public void testModule() {
        assertEquals(7, NumberUtilities.module(-7));
    }
}
