package com.gdstruc.module3;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<Player> stack;

    public LinkedStack()
    {
        stack = new LinkedList<Player>();
    }

    public void push(Player player)
    {
        stack.push(player);
    }

    public Player pop()
    {
        return stack.pop();
    }

    public Player peek()
    {
        return stack.peek();
    }

    public void printStack()
    {
        ListIterator<Player> iterator = stack.listIterator();

        System.out.println("Printing Stack: ");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
}
