package com.company;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 8, 1};

        for (int min = 0; min < arr.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j< arr.length; j++){
                if (arr[j] < arr[least]){
                    least = j;
                }
                }
            int temp= arr[min];
            arr[min] = arr[least];
            arr[least] = temp;
            }

        System.out.println(Arrays.toString(arr));
        }
    }







