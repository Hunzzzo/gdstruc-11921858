package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] numbers2 = new int[10];

        fillArray(numbers);
        fillArray(numbers2);

        // bubble sorting in descending order
        System.out.println("Before bubble Sort:");
        printArrayElements(numbers);

        bubbleSort(numbers);

        System.out.println("\n\nAfter bubble sort:");
        printArrayElements(numbers);

        // selection sorting in descending order
        System.out.println("\n\nBefore selection Sort:");
        printArrayElements(numbers2);

        selectionSort(numbers2);

        System.out.println("\n\nAfter selection sort:");
        printArrayElements(numbers2);
    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int holder = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = holder;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 0; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int holder = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = holder;
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
    }

    private static void fillArray(int[] arr)
    {
        arr[0] = 420;
        arr[1] = 513;
        arr[2] = 99;
        arr[3] = 21;
        arr[4] = 25;
        arr[5] = 395;
        arr[6] = 4;
        arr[7] = 100;
        arr[8] = 50;
        arr[9] = 1000;
    }
}
