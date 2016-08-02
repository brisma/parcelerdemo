package it.brisma.parcelerdemo;

import org.parceler.Parcel;

@Parcel
public class Example {

    public String firstName;
    public String lastName;
    public int age;
    public float height;

    // Costruttore vuoto richiesto da Parceler!
    public Example() {

    }

    public Example(String firstName, String lastName, int age, float height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " - Anni: " + this.age + ", Altezza: " + this.height + "m";
    }
}
