package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DriverTest {

    @Test
    public void testCorrectFullName() {
        Driver driver = new Driver(1, "Иванов Иван Иванович", "1234 567890", "AB1234567");
        assertEquals("Иванов", driver.getSurname());
        assertEquals("Иван", driver.getName());
        assertEquals("Иванович", driver.getPatronymic());
    }

    @Test
    public void testIncorrectFullName() {
        Driver driver = new Driver(1, "Петр", "1234 567890", "AB1234567");
        assertEquals("Не указано", driver.getSurname());
        assertEquals("Петр", driver.getName());
        assertEquals("Не указано", driver.getPatronymic());
    }
}