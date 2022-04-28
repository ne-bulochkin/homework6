package pro.sky;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // 1) 3 arrays
        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        String[] arr3 = {"кот", "собака", "нетфликс"};


        // 2) print 0->max
        for (int i = 0; i < arr1.length; i++) {
            if (i != arr1.length - 1) {
                System.out.print(arr1[i] + ",");
            } else {
                System.out.println(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i != arr2.length - 1) {
                System.out.print(arr2[i] + ",");
            } else {
                System.out.println(arr2[i]);
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            if (i != arr3.length - 1) {
                System.out.print(arr3[i] + ",");
            } else {
                System.out.println(arr3[i]);
            }
        }

        // 3) print max -> 0
        for (int i = arr1.length - 1; i > -1; i--) {
            if (i != 0) {
                System.out.print(arr1[i] + ",");
            } else {
                System.out.println(arr1[i]);
            }
        }
        for (int i = arr2.length - 1; i > -1; i--) {
            if (i != 0) {
                System.out.print(arr2[i] + ",");
            } else {
                System.out.println(arr2[i]);
            }
        }
        for (int i = arr3.length - 1; i > -1; i--) {
            if (i != 0) {
                System.out.print(arr3[i] + ",");
            } else {
                System.out.println(arr3[i]);
            }
        }

        // 4) четкие все
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));


    }
}
