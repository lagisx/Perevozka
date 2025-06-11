package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Optional;

public class SearchController {

    @FXML
    private TextField nameField;

    @FXML
    private TextArea resultArea;

    private final DriverRepository repository = new DriverRepository();

    @FXML
    public void onSearch() {
        String name = nameField.getText().trim();
        Optional<Driver> driverOptional = repository.findByName(name);

        if (driverOptional.isPresent()) {
            Driver driver = driverOptional.get();
            resultArea.setText(
                    "Фамилия: " + driver.getSurname() + "\n" +
                            "Имя: " + driver.getName() + "\n" +
                            "Отчество: " + driver.getPatronymic() + "\n" +
                            "Паспорт: " + driver.getPassportInfo() + "\n" +
                            "Номер прав: " + driver.getLicenseNumber()
            );
        } else {
            resultArea.setText("Водитель с именем \"" + name + "\" не найден.");
        }
    }
}