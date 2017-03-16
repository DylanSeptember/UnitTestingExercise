package dylan.junitTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    @org.junit.Test
    public void testAge() throws Exception
    {
        App app = new App(29,8,1995);
        app.calcAge();
        int age = app.getAge();

        assertEquals(21,age);
    }

    @org.junit.Test
    public void testSetDayMonthYear() throws Exception
    {
        App app = new App();
        app.setDayMonthYear("29-08-1995");
        assertEquals(29,app.getDay());
        assertEquals(8,app.getMonth());
        assertEquals(1995,app.getYear());
    }

    @org.junit.Test
    public void testSetGetName()
    {
        App app = new App();
        app.setName("Jack");
        assertEquals("Jack", app.getName());
    }

    @org.junit.Test
    public void testSetGetSurname()
    {
        App app = new App();
        app.setSurname("Black");
        assertEquals("Black", app.getSurname());
    }

    @org.junit.Test
    public void testSetGetPet()
    {
        App app = new App();
        app.setPet("y");
        assertTrue( app.getPet());
        app.setPet("n");
        assertFalse(app.getPet());
    }

    @org.junit.Test
    public void getOldAge()
    {
        App app = new App(10);
        assertEquals(40, app.getOldAge());
    }

    @org.junit.Test
    public void testSetGetPetName()
    {
        App app = new App();
        app.setPetName("Snoopy");
        assertEquals("Snoopy", app.getPetName());
    }


}
