package org.certificatic.ejercicio.biblioteca.cliente;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class InitClienteTest extends TestCase {

	  /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public InitClienteTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( InitClienteTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testInitCliente()
    {
        assertTrue( true );
    }
}
