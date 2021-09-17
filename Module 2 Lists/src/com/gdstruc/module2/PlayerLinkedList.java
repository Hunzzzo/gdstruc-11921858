package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;
    private int listSizeCounter;

    public int getListSizeCounter()
    {
        return listSizeCounter;
    }

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        listSizeCounter++;
    }

    public void removeFront()
    {
        if (head != null)
        {
            var removeNode = head;
            head = removeNode.getNextPlayer();
            head.setPreviousPlayer(null);
            listSizeCounter--;
        }
        else
        {
            System.out.println("no nodes to remove");
        }
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.print("Head -> ");
        while (current != null)
        {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public boolean contains(Player player)
    {
        PlayerNode current = head;
        while (current != null)
        {
            if (current.getPlayer() == player)
            {
                return true;
            }
            current = current.getNextPlayer();
        }
        return false;
    }

    public int indexOf(Player player)
    {
        int indexCounter = 0;
        PlayerNode current = head;
        while(current != null)
        {
            if (current.getPlayer() == player)
            {
                return indexCounter;
            }
            indexCounter++;
            current = current.getNextPlayer();
        }
        System.out.println("Player not found");
        return -1;
    }
}
