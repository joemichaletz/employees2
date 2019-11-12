package com.example.employees;

public class Employee
{
    //first name, last name, age, height, and weight.
    String firstName;
    String lastName;
    int age;
    int weight;
    int heightFeet;
    int heightInches;

    public Employee(String f, String l, int a, int w, int hf, int hi)
    {
        this.firstName = f;
        this.lastName = l;
        this.age = a;
        this.weight = w;
        this.heightFeet = hf;
        this.heightInches = hi;
    }



    public String Display()
    {
        /*System.out.println("New Employee:");
        System.out.println();
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight + " lbs");
        System.out.println("Height: " + this.heightFeet + "'" + this.heightInches + '"');*/
        return "New Employee:\nName: " + this.firstName + " " + this.lastName + "\n"
                + "Age: " + this.age + "\nWeight: " + this.weight + " lbs\nHeight: "
                + this.heightFeet + "' " + this.heightInches + '"';
    }
}
