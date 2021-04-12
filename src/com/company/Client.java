package com.company;

public final class Client extends Employee {

    private int sum; // Переменная для хранения суммы на счете
    private String bank;

    public Client(String name, int age, HairColor hairColor) {
        super(name, age, hairColor);
    }


    @Override
    public void fromCountry(String country, String name) {
        super.fromCountry(country, name);
        System.out.println("ПЕРЕЗАПИСАЛИ");
    }

    public void clientInfo(int sum, String bank) {
        System.out.println("Name of Bank: " + bank + " Clients money " + sum + " $");
    }
}
