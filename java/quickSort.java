package com.quickSort.quickSort;

import Java.util.Random;

public class quickSortMethod1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100000000];

        for (int i = 0; i < numbers.length; ++i) {
          numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Antes:");

        /* quicksortMethod1 */
        quicksortMethod1(numbers, 0, numbers.length - 1);
        /* printArray(numbers); */

        System.out.println("\nDepois:");
        /* printArray(numbers); */
    }

    private static void quicksortMethod1(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = array[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, highIndex);
        quicksortMethod1(array, lowIndex, leftPointer - 1);
        quicksortMethod1(array, leftPointer + 1, highIndex);
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; ++i) {
            System.out.println(numbers[i]);
        }
    }
}

/*
 *
 * BASE quickSort
 *      quickSort recebe: array, menor index à esquerda, maior index pós-pivô ou maior index à direita)
 *      quickSort escolhe um pivô
 *      quickSort fatia o array entre: menores e maiores que o pivô
 *
 *
 * BASE
 *      [1 8 3 9 4 5 7]
 *      pivot = array[highIndex] = 7
 *
 *
 * 1ª PASSAGEM (dentro GRANDE while)
 *
 *      leftPointer => rightPointer, não
 *
 *      leftPointer = lowIndex = 1
 *      rightPointer = highIndex = 5 (acessa 7, mas o valor é 5)
 *
 *      leftPointer
 *         1 é maior que 7, não -> move "leftPointer" para a próxima posição
 *
 *      leftPointer
 *         8 é maior que 7, sim -> continue
 *
 *      rightPointer
 *         5 é menor que 7, sim -> continue
 *
 *      compare
 *         leftPointer > rightPointer
 *            swap
 *               leftPointer = valor(rightPointer) = 5
 *               rightPointer = valor(leftPointer) = 8
 *
 *      [1 5 3 9 4 8 7]
 *
 *
 * 2ª PASSAGEM (dentro GRANDE while)
 *
 *      leftPointer => rightPointer, não
 *
 *      leftPointer = lowIndex = 3
 *      rightPointer = highIndex = 4
 *
 *      leftPointer
 *         3 é maior que 7, não -> move "leftPointer" para a próxima posição
 *
 *      leftPointer
 *         9 é maior que 7, sim -> continue
 *
 *      rightPointer
 *         4 é menor que 7, sim -> continue
 *
 *      compare
 *         leftPointer > rightPointer
 *            swap
 *               leftPointer = valor(rightPointer) = 4
 *               rightPointer = valor(leftPointer) = 9
 *
 *      [1 5 3 4 9 8 7]
 *
 * 3ª PASSAGEM (fora do GRANDE while)
 *
 *      leftPointer >= rightPointer, sim
 *
 *      leftPointer = lowIndex = 9
 *      rightPointer = highIndex = 9
 *
 *      leftPointer and rightPointer = 9
 *
 *            swap
 *               pivot = valor(leftPointer and rightPointer) = valor(leftPointer) = 9
 *               leftPointer and rightPointer = valor(leftPointer) = valor(pivot) = 7
 *
 *      [1 5 3 4 7 8 9]
 *
 * 4ª PASSAGEM (chama quickSort recursivamente)
 *      lado esquerdo do pivot, menores que o pivot (sub-array, fatia do array)
 *      para manipular, APENAS, esta fatia (esquerda, de menores que o pivot) do array
 *      pegue a posição anterior ao pivot (pra onde apontam os ponteiros "leftPointer" and "rightPointer")
 *          quickSort (array, menor index do array, menores que o pivô)
 *          quickSort (array, lowIndex, leftPointer - 1)
 *
 *      lado direito do pivot, maiores que o pivot (sub-array, fatia do array)
 *      para manipular, APENAS, esta fatia (direita, de maiores que o pivot) do array
 *      pegue a posição posterior ao pivot (pra onde apontam os ponteiros "leftPointer" and "rightPointer")
 *          quickSort (array, maior index depois do pivô , maiores que o pivô)
 *          quickSort (array, leftPointer + 1, maior index depois do pivô)
 */

/*
 * REFERÊCIAS
 * [Quicksort Sort Algorithm in Java - Full Tutorial With Source](https://youtube.com/watch?v=h8eyY7dIiN4)
 */
