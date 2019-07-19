package com.example.redvsblue;

public class Celebriety {



    private static String firstName;
    private static String lastName;
    private static int age;
    private static String height;
    private static String famousFor;


     Celebriety() {
    }

    public Celebriety(int age, String fName, String lName, String hgt, String famfor){

         this.firstName = fName;
        this.lastName = lName;
        this.height = hgt;
        this.famousFor = famfor;
        this.age = age;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Celebriety.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Celebriety.lastName = lastName;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Celebriety.age = age;
    }

    public static String getHeight() {
        return height;
    }

    public static void setHeight(String height) {
        Celebriety.height = height;
    }

    public static String getFamousFor() {
        return famousFor;
    }

    public static void setFamousFor(String famousFor) {
        Celebriety.famousFor = famousFor;
    }
}
