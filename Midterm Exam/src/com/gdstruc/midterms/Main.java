package com.gdstruc.midterms;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        CardStack playerDeck = new CardStack();
        CardStack playerHand = new CardStack();
        CardStack discardPile = new CardStack();

        int maxDeck = 30;

        String[] cardNames = {"Pass Go ->", "Just Say No", "Deal Breaker",
                              "Wild card", "+4 Wild card", "Uno reverse card",
                              "Credit Card", "Greeting Card", "ID Card"};

        for (int i = 0; i < maxDeck; i++)
        {
            int randomCard = rand.nextInt(cardNames.length);
            playerDeck.push(new Cards(cardNames[randomCard]));
        }

        while (playerDeck.size() > 0)
        {
            int randomAction = rand.nextInt(3);
            int randNumOfCards = (rand.nextInt(5) + 1);

            if (randomAction == 0)
            {
                drawFromDeck(playerHand, playerDeck, randNumOfCards);
            }
            else if (randomAction == 1)
            {
                discardFromHand(playerHand, discardPile, randNumOfCards);
            }
            else
            {
                getFromDiscard(playerHand, discardPile, randNumOfCards);
            }

            printStatus(playerHand, playerDeck, discardPile);
        }
    }

    public static void drawFromDeck(CardStack playerHand, CardStack playerDeck, int randNumOfCards)
    {
        System.out.println("Command 1 was selected: Draw from Deck");

        if (randNumOfCards > 1)
        {
            System.out.println("Player needs to draw " + randNumOfCards + " cards ");
        }
        else
        {
            System.out.println("Player needs to draw " + randNumOfCards + " card ");
        }

        int newNumOfCards = randNumOfCards;

        if (randNumOfCards > playerDeck.size())
        {
            newNumOfCards = playerDeck.size();

            if (newNumOfCards == 0)
            {
                System.out.println("No cards can be drawn");
            }
            else if (newNumOfCards == 1)
            {
                System.out.println("Only " + newNumOfCards + " card can be drawn ");
            }
            else if (newNumOfCards > 1)
            {
                System.out.println("Only " + newNumOfCards + " cards can be drawn ");
            }
        }

        for (int i = 0; i < newNumOfCards; i++)
        {
            playerHand.push(playerDeck.pop());
        }
    }

    public static void discardFromHand(CardStack playerHand, CardStack discardPile, int randNumOfCards)
    {
        System.out.println("Command 2 was selected: Discard cards from hand");

        if (randNumOfCards > 1)
        {
            System.out.println("Player needs to discard " + randNumOfCards + " cards ");
        }
        else
        {
            System.out.println("Player needs to discard " + randNumOfCards + " card ");
        }

        int newNumOfCards = randNumOfCards;

        if (randNumOfCards > playerHand.size())
        {
            newNumOfCards = playerHand.size();

            if (newNumOfCards == 0)
            {
                System.out.println("No cards can be discarded");
            }
            else if (newNumOfCards == 1)
            {
                System.out.println("Only " + newNumOfCards + " card can be discarded ");
            }
            else if (newNumOfCards > 1)
            {
                System.out.println("Only " + newNumOfCards + " cards can be discarded ");
            }
        }

        for (int i = 0; i < newNumOfCards; i++)
        {
            discardPile.push(playerHand.pop());
        }
    }

    public static void getFromDiscard(CardStack playerHand, CardStack discardPile, int randNumOfCards)
    {
        System.out.println("Command 3 was selected: Get cards from discard pile");

        if (randNumOfCards > 1)
        {
            System.out.println("Player needs to get " + randNumOfCards + " cards ");
        }
        else
        {
            System.out.println("Player needs to get " + randNumOfCards + " card ");
        }

        int newNumOfCards = randNumOfCards;

        if (randNumOfCards > discardPile.size())
        {
            newNumOfCards = discardPile.size();

            if (newNumOfCards == 0)
            {
                System.out.println("No cards can be drawn");
            }
            else if (newNumOfCards == 1)
            {
                System.out.println("Only " + newNumOfCards + " card can be drawn ");
            }
            else if (newNumOfCards > 1)
            {
                System.out.println("Only " + newNumOfCards + " cards can be drawn ");
            }
        }

        for (int i = 0; i < newNumOfCards; i++)
        {
            playerHand.push(discardPile.pop());
        }
    }

    public static void printStatus(CardStack playerHand, CardStack playerDeck, CardStack discardPile)
    {
        System.out.println("No. of cards in hand, deck and discard");
        System.out.println("Player hand: " + playerHand.size());
        System.out.println("Cards at hand:");
        playerHand.printCards();
        System.out.println("\nPlayer deck: " + playerDeck.size());
        System.out.println("Discard pile: " + discardPile.size());
        System.out.print("\n");
    }
}
