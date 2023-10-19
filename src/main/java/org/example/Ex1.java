package org.example;

/*
    Написать метод, возвращающий количество чётных элементов массива.
    countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
 */

public class Ex1 {
    public static void main(String[] args) {
        int[] arr1 = {2,1,2,3,4};
        int[] arr2 = {2,2,0};
        int[] arr3 = {1,3,5};

        System.out.println(countEvens(arr1));
        System.out.println(countEvens(arr2));
        System.out.println(countEvens(arr3));
    }

    public static int countEvens(int[] array) {
        int counter = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0)
                counter++;
        }
        return counter;
    }
}