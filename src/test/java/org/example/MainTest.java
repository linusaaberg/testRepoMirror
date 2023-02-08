package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MainTest {

    @Test
    public void mainTest() {
        PrintStream originalOut = System.out; // to have a way to undo the binding with your `ByteArrayOutputStream`
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        // action
        Main.main(null);
        // assertion
        assertEquals("Hello World", bos.toString());
        // undo the binding in System
        System.setOut(originalOut);
    }
    @Test
    public void helloWorldTest() {
        String expected = "Hello World";
        String actual = Main.helloWorld();
        assertEquals(expected, actual);
    }

    @Test
    public void answersTest() {
        String expected = "One";
        assertEquals(expected, Main.answers(1));
        expected = "Two";
        assertEquals(expected, Main.answers(2));
        assertNull(Main.answers(3));
    }
}
