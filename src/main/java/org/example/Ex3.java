package org.example;

/*
    Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента
    с нулевым значением
 */

public class Ex3 {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,0};

        System.out.println(containsPairNulls(array));
    }

    public static boolean containsPairNulls(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] == 0)
                if(array[i + 1] == 0)
                    return true;
        }
        return false;
    }
}
