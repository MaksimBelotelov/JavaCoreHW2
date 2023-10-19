package org.example;

/*
    Написать функцию, возвращающую разницу между самым большим и самым
    маленьким элементами переданного не пустого массива.
 */

public class Ex2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println(diffMaxMin(array));
    }

    public static int diffMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int j : array) {
            if (j > max)
                max = j;
            else if (j < min)
                min = j;
        }
        return max - min;
    }
}
