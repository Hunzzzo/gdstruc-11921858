package com.gdstruc.module2;

public class Main {

    public static void main(String[] args) {

        Player eula = new Player(1, "Eula", 90);
        Player ganyu = new Player(2, "Ganyu", 90);
        Player ei = new Player(3, "Ei", 80);
        Player jean = new Player(4, "Jean", 80);

        PlayerLinkedList linkList = new PlayerLinkedList();

        linkList.addToFront(eula);
        linkList.addToFront(ganyu);
        linkList.addToFront(ei);
        linkList.addToFront(jean);

        System.out.println("Initial Linked list");
        System.out.println("Number of players in list: " + linkList.getListSizeCounter());
        linkList.printList();

        System.out.print("\nIndex of player Eula: ");
        System.out.println(linkList.indexOf(eula));

        linkList.removeFront();

        System.out.println("\nPrevious head node removed");
        System.out.println("Number of players in list: " + linkList.getListSizeCounter());
        linkList.printList();

        System.out.print("\nIndex of player Eula: ");
        System.out.println(linkList.indexOf(eula));

        System.out.println("\nContains function");
        System.out.println("Does link list contain player id:1, name: Eula, level: 90");
        System.out.println(linkList.contains(eula));
    }
}
