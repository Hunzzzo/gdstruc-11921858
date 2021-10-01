package com.gdstruc.module3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ArrayStack stack = new ArrayStack(5);
        LinkedStack stack = new LinkedStack();

        stack.push(new Player(1, "Lagiacrus", 100));
        stack.push(new Player(2, "Rathalos", 90));
        stack.push(new Player(3, "Zinogre", 80));
        stack.push(new Player(4, "Gore Magala", 70));

        stack.printStack();

        System.out.println("Peeking: " + stack.peek());
        System.out.println();
        stack.printStack();

//        // input a number
//        Scanner intScanner = new Scanner(System.in);
//
//        System.out.println("input a number");
//
//        int numberInput = intScanner.nextInt();
//
//        System.out.println("input: " + numberInput);
//
//        // input a string/text/sentence
//        Scanner stringScanner = new Scanner(System.in);
//
//        System.out.println("input a text");
//
//        String textInput = stringScanner.nextLine();
//
//        System.out.println("input: " + textInput);

        // notes abt user input
        // 1) inputs need the scanner library
        // 2) need to initialize scanner like so,
        //    Scanner scanner = new Scanner(System.in);
        // 2) the scanner can be reused for later inputs
        // 3) int inputs need "scanner.nextInt"
        // 4) String/sentence/text inputs need "scanner.nextLine"
        // 3) each type of input (int, String, etc.) inputs need their own scanner
        // ex: scanner used for "int" inputs can only be used for "int" inputs
        //     with the use of "scanner.nextInt", can cannot be used for other inputs
        //     even if the "scanner.nextInt" has been changed
    }
}
