package com.company.Array;

public class pro02_Max_min_element_in_Array {
    public static int maxInArray(int []a){
        int max = a[0];
        for (int j : a) {
            if (j > max) {
                max = j;
            }
        }
        return  max;
    }

    public static int minInArray(int []a){
        int min = a[0];
        for (int i:a){
            if (i<min){
                min = i;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3, 15, -87, -2};
        System.out.println(maxInArray(a));
        System.out.println(minInArray((a)));
    }
}
