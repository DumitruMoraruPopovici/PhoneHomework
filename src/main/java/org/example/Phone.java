package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * the class for Phones with properties and behaviors
 */

public abstract class Phone {
    private double batteryLife = 24;
    String color;

    String material;

    String imei;
    int callnumbers;


    List<Contact> contacts = new ArrayList<>();

    List<Message> messages = new ArrayList<>();

    /**
     * next 2 methods are getter and setter for batteryLife
     */
    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    /**
     * method for adding a contact to the phone
     */
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println(contact.position + ". Phone no.:" + contact.phoneNumber + ", first Name " + contact.firstName + " and last name " + contact.lastName);
    }

    /**
     * getter and setter for List<Contacts>
     */
    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    /**
     * method for printing the first contact
     */
    public void getFirstContact() {

        System.out.println("The first contact is : " + contacts.get(0).position + " with phone no. :" + contacts.get(0).phoneNumber + ", first name:" + contacts.get(0).firstName + " and last name:" + contacts.get(0).lastName);
    }

    /**
     * method for printing the las contact
     */
    public void getLastContact() {

        System.out.println("The last contact is : " + contacts.get(contacts.size() - 1).position + " with phone no. :" + contacts.get(contacts.size() - 1).phoneNumber + ", first name:" + contacts.get(contacts.size() - 1).firstName + " and last name:" + contacts.get(contacts.size() - 1).lastName);
    }

    /**
     * method for sending messages and printing where is sent and what is the message
     */
    public void sendMessage(Message message) {
        messages.add(message);
        setBatteryLife(batteryLife - 1);
        System.out.println("On this number " + message.phoneNumber + " A message was received: " + message.message);
    }

    /**
     * method for printing the first message
     */
    public void getFirstMessage(String phoneNumberFrom) {
        if (messages.get(0).phoneNumber.equals(phoneNumberFrom)) {

            System.out.println(messages.get(0).message);

        }


    }

    /**
     * method for printing the second message
     */
    public void getSecondMessage(String phoneNumberFrom) {
        if (messages.get(1).phoneNumber.equals(phoneNumberFrom)) {
            System.out.println(messages.get(1).message);
        }

    }

    /**
     * method for calling and printing who did it
     */
    public void call(Contact position) {
        Contact j = position;
        setBatteryLife(batteryLife - 2);
        System.out.println(contacts.get(j.position).firstName + " made a call");
        callnumbers++;
    }

    /**
     * method for viewing the call history
     */
    public void viewHistory() {
        System.out.println(contacts.get(1).firstName + " made " + callnumbers + " calls");
    }
}
