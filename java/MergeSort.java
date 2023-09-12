package com.javaaid.sort;

import java.util.Arrays;


public class MergeSort {
    int aux[];

    void mergeSort(int array[], int low, int high) {
        int (low < high) {

            int middle = low + (high - low) / 2;

            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);

            merge(array, low, middle, high);
        }
    }

    void merge(int array[], int low, int middle, int high) {
        int i = low, j = middle + 1;
        for (int element = low; element <= high; element++)
            aux[element] = arr[element];

        for (int element = low; element <= high; element++) {
            if (i > middle) {
                array[element] = aux[j++];
            else if (j > high)
                array[element] = aux[i++];
            else if (aux[j] < aux[i])
                array[element] = aux[j++];
            else
                array[element] = aux[i++];
            }
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // int [] intArray = {5, 4, 7, 2, 9};
        // mergeSort(intArray, 5, 9};
    }
}
