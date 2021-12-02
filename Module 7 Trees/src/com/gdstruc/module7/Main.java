package com.gdstruc.module7;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Tree tree = new Tree();

        tree.insert(rand.nextInt(100));
        tree.insert(rand.nextInt(100));
        tree.insert(rand.nextInt(100));
        tree.insert(rand.nextInt(100));
        tree.insert(rand.nextInt(100));
        tree.insert(rand.nextInt(100));
        tree.insert(rand.nextInt(100));
        tree.insert(rand.nextInt(100));

        System.out.println("Traverse in order:");
        tree.traverseInOrder();

        System.out.print("\n");

        System.out.println("Traverse in reverse:");
        tree.traverseInReverse();

        System.out.print("\n");

        System.out.println("Minimum value: " + tree.getMin());

        System.out.print("\n");

        System.out.println("Maximum value: " + tree.getMax());
    }
}
