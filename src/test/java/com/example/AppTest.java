package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAddStudent() {
        App app = new App();
        app.addStudent("Harinee");
        assertEquals(1, app.viewStudents().size());
    }

    @Test
    void testViewStudents() {
        App app = new App();
        app.addStudent("Harinee");
        app.addStudent("Arun");
        assertEquals("Arun", app.viewStudents().get(1));
    }
}