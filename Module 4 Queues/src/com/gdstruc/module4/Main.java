package com.gdstruc.module4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int numOfGames = 0;
        int turnNum = 1;
        boolean matchFound = false;

        String[] names = {"Empoleon", "Samurott", "Greninja",
                          "Infernape", "Blaziken", "Charizard",
                          "Torterra", "Serperiror", "Decidueye"};

        ArrayQueue queue = new ArrayQueue(5);

        while (numOfGames < 10)
        {
            System.out.println("Turn: " + turnNum);
            System.out.println("Games started: " + numOfGames);

            int playersToQueue = rand.nextInt(7) + 1;

            for (int i = 0; i < playersToQueue; i++)
            {
                Player playerToQueue = new Player(rand.nextInt(500), names[rand.nextInt(names.length)], rand.nextInt(100));
                queue.add(playerToQueue);
            }

            System.out.println("Players in queue: ");
            queue.printQueue();
            System.out.print("\n");

            if (queue.size() >= 5)
            {
                System.out.println("Match found");
                for (int i = 0; i < 5; i++)
                {
                    System.out.println(queue.remove() + " is joining");
                }
                matchFound = true;
            }

            if (matchFound == true)
            {
                numOfGames++;
            }
            else if (matchFound == false)
            {
                System.out.println("Match not found");
            }

            System.out.print("\n");

            matchFound = false;
            turnNum++;
        }
    }
}
