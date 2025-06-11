package com.example.demo;

public class Driver {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String passportInfo;
    private String licenseNumber;

    public Driver(int id, String fullName, String passportInfo, String licenseNumber) {
        this.id = id;
        String[] parts = fullName.split(" ");
        if (parts.length >= 3) {
            this.surname = parts[0];
            this.name = parts[1];
            this.patronymic = parts[2];
        } else {
            this.surname = "Не указано";
            this.name = fullName;
            this.patronymic = "Не указано";
        }
        this.passportInfo = passportInfo;
        this.licenseNumber = licenseNumber;
    }

    public int getId() { return id; }
    public String getSurname() { return surname; }
    public String getName() { return name; }
    public String getPatronymic() { return patronymic; }
    public String getPassportInfo() { return passportInfo; }
    public String getLicenseNumber() { return licenseNumber; }
}