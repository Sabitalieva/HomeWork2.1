package com.company;

public class Person {
    private String name;
    private int age;
    private HairColor hairColor;

    public Person(String name, int age, HairColor hairColor) {

        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void fromCountry(String country, String name) {
        System.out.println("country:" + country + " Name:" + name);
    }

    public void getInfo() {
        System.out.println("Name:" + name + " age " + age + " Color of hair " + hairColor.name());
    }
}
