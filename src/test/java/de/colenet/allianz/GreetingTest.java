package de.colenet.allianz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Michael Spanier on 14.06.16.
 */
public class GreetingTest {

    private Greeting sut;
    private long FirstNumber = 0;
    private String FirstString = "TEST";

    @Before
    public void Setup() {
        sut = new Greeting(FirstNumber, FirstString);
    }

    @Test
    public void TestCreation() {
        assertEquals(FirstNumber, sut.getId());
        assertEquals(FirstString, sut.getContent());
    }
}