package com.systechafrica.practice;

import java.util.HashSet;
import java.util.Set;

public class Client {
    private int id;
    private String name;
    private String emailAddress;
    private int phoneNumber;
    private String gender;

     
    public Client() {
    }


    public Client(String name, String emailAddress, int phoneNumber, String gender) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
    public Client(int id, String name, String emailAddress, int phoneNumber, String gender) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


private static void SetAndHashSet(){

        Client Mep = new Client(1, "Mep", "MepKem@gmail.com", 123456789, "Female");
        Client Rac = new Client(2, "Rac", "RacKwa@gmail.com", 98765432, "TransMale");
        Client Vee = new Client(2, "Vee", "Vee@gmail.com", 694870609, "Female");

        Set<Client> clients = new HashSet<>();
        clients.add(Vee);
        clients.add(Mep);
        clients.add(Rac);

        printSet(clients);

        }




    private static void printSet(Set<Client> clients) {
}


    @Override
    public String toString() {
        return "Client [id=" + id +
         " ,name=" + name + 
         ", emailAddress=" + emailAddress +
          ",phoneNumber=" + phoneNumber
        + ", gender=" + gender + "]";

       
    }


    

  
    
}
