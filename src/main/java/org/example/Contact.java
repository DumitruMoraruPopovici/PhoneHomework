package org.example;

/**
 * class for the list of contacts
 */
public class Contact {

    int position;

    String phoneNumber;

    String firstName;
    String lastName;

    public Contact(int position, String phoneNumber, String firstName, String lastName) {
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
