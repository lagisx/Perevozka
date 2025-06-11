package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DriverRepository {
    private List<Driver> drivers = new ArrayList<>();

    public DriverRepository() {
        drivers.add(new Driver(1, "Иванов Иван Иванович", "1234 567890", "AB1234567"));
        drivers.add(new Driver(2, "Петров Петр Петрович", "2345 678901", "BC2345678"));
        drivers.add(new Driver(3, "Сидорова Анна Михайловна", "3456 789012", "CD3456789"));
        drivers.add(new Driver(4, "Смирнова Ольга Дмитриевна", "5678 901234", "EF5678901"));
    }

    public Optional<Driver> findByName(String name) {
        return drivers.stream()
                .filter(d -> d.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}