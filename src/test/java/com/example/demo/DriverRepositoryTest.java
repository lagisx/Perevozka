package com.example.demo;
import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class DriverRepositoryTest {

    @Test
    public void testFindExistingDriver() {
        DriverRepository repository = new DriverRepository();
        Optional<Driver> driver = repository.findByName("Иван");
        assertTrue(driver.isPresent());
    }

    @Test
    public void testFindNonExistingDriver() {
        DriverRepository repository = new DriverRepository();
        Optional<Driver> driver = repository.findByName("Алексей");
        assertFalse(driver.isPresent());
    }
}