package com.gdstruc.module6;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        int numbers[] = {60, 33, 12, 64, 17, 105, -53};

        System.out.println(linearSearch(numbers, 105));
        System.out.println(linearSearch(numbers, 100));
        System.out.println(binarySearch(numbers, 33));
        //System.out.println(gachaSearch(numbers, 33));
    }

    public static int linearSearch(int[] input, int value)
    {
        for (int i = 0; i < input.length; i++)
        {
            if (input[i] == value)
            {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] input, int value)
    {
        int start = 0;
        int end = input.length - 1;

        while (start <= end)
        {
            int middle = (start + end) / 2;


            if (input[middle] == value)
            {
                return middle;
            }
            else if (value < input[middle]) // value might be at left half
            {
                // this part of the code removes the right half from the search
                // if the value we are looking for is not there
                end =  middle - 1;
            }
            else if (value > input[middle]) // value might be at right half
            {
                start = middle + 1;
            }
        }
        return -1;
    }

    public static int gachaSearch(int[] input, int value)
    {
        Random rand = new Random();
        int randomPick = rand.nextInt(input.length);

        for (int i = 0; i < input.length; i++)
        {
            if (input[randomPick] == value)
            {
                return randomPick;
            }
            else
            {
                //delete the wrong node
                //input.dele(input[randomPick]);
            }

        }
        return -1;
    }
}
