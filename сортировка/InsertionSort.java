package com.company;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
	int[] arr = {2, 4, 6, 3,9,5};

    for(int i= 1 ; i<arr.length; i++){
       int curr =arr[i];
       int j = i;
       while (j > 0 && arr[j - 1] > curr){
           arr [j] = arr [j-1];
           j--;
       }
    arr[j]= curr;
    }
        System.out.println(Arrays.toString(arr));
    }
}
