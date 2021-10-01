package com.gdstruc.module3;

import java.util.EmptyStackException;

public class ArrayStack {
    private Player[] stack;
    private int top;

    public ArrayStack(int capacity)
    {
        stack = new Player[capacity];
    }

    // push adds to the top of stack
    public void push(Player player)
    {
        //this block of code is to resize the array if the current array is full
        if(top == stack.length)
        {
            Player[] newStack = new Player[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        // this mean the new player added will be the top
        stack[top++] = player;
    }

    // pop removes the top of the stack
    public Player pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

        Player poppedPlayer = stack[--top];
        stack[top] = null;
        return poppedPlayer;
    }

    // peek gets or accesses the top item of the stack
    public Player peek()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public void printStack()
    {
        System.out.println("Printing stack");
        for(int i = top - 1; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }
}
