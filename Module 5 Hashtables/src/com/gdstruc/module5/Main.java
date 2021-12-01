package com.gdstruc.module5;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        Player Empoleon = new Player(rand.nextInt(500), "Empoleon", rand.nextInt(100));
        Player Infernape = new Player(rand.nextInt(500), "Infernape", rand.nextInt(100));
        Player Torterra = new Player(rand.nextInt(500), "Torterra", rand.nextInt(100));
        Player Lucas = new Player(rand.nextInt(500), "Lucas", rand.nextInt(100));
        Player Dawn = new Player(rand.nextInt(500), "Dawn", rand.nextInt(100));

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(Empoleon.getUserName(), Empoleon);
        hashtable.put(Infernape.getUserName(), Infernape);
        hashtable.put(Torterra.getUserName(), Torterra);
        hashtable.put(Lucas.getUserName(), Lucas);
        hashtable.put(Dawn.getUserName(), Dawn);

        System.out.println("Initial Hashtable:");
        hashtable.printHashtable();

        System.out.println("\nRemoving:");
        System.out.println(hashtable.get("Torterra"));
        hashtable.removeKey("Torterra");

        System.out.println("\nAfter removing ");
        hashtable.printHashtable();
    }
}
