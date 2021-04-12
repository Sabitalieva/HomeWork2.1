package com.company;

public class Employee extends Person {

    private String company;

    public Employee(String name, int age, HairColor hairColor) {
        super(name, age, hairColor);
    }


    public String getCompany() {
        return company;
    }

    public void salary(int day, int salary){
        System.out.println("Salary " + day*salary + " $");
    }

    public final void salary(String name, String company){
        System.out.println("name "+name+" working:"+company);
    }

}
