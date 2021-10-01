package com.gdstruc.midterms;

import java.util.LinkedList;

public class CardStack {
    private LinkedList<Cards> stack;

    public CardStack()
    {
        stack = new LinkedList<Cards>();
    }

    public void push(Cards card)
    {
        stack.push(card);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Cards pop()
    {
        return stack.pop();
    }

    public Cards peek()
    {
        return stack.peek();
    }

    public int size()
    {
        return stack.size();
    }

    public void printCards()
    {
        for (Cards card : stack) {
            System.out.print(card.getName() + ", ");
        }
    }
}
