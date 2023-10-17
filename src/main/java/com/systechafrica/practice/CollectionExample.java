package com.systechafrica.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionExample {
    private static String i;

    public static void main(String[] args) {

        Collection<Client> clients = new ArrayList<>();
        Client Mep = new Client(1, "Mep", "MepKem@gmail.com", 123456789, "Female");
        Client Rac = new Client(2, "Rac", "RacKwa@gmail.com", 98765432, "TransMale");
        // Add Values
        clients.add(Mep);
        clients.add(Rac);

        printList(clients);
        // Checking Values
        System.out.println(clients.contains(Mep));
        Client Vee = new Client(2, "Vee", "Vee@gmail.com", 694870609, "Female");
        System.out.println("After updates");
        // Updating Values
        Client set = ((ArrayList<Client>) clients).set(0, Vee);
        printList(clients);
        // indexof
        System.out.println("clients.indexOf(Mep)= " + ((ArrayList<Client>) clients).indexOf(Mep));
        System.out.println("clients.indexOf(Rac)= " + ((ArrayList<Client>) clients).indexOf(Rac));

        System.out.println("clients.size= " + ((ArrayList<Client>) clients).size());

        // remove
        clients.remove(Mep);
        printList(clients);

        // clear
        clients.clear();
        System.out.println("clients.isEmpty()= " + ((ArrayList<Client>) clients).isEmpty());

    }

    private static void printList(Collection<Client> clients) {
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(((ArrayList<Client>) clients).get(i));
        }

    }

    
    private static void printSet(Set<Client> clients) {
        for (Client client : clients) {
            System.out.println(client);

        }
    }

}
