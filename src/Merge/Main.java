package Merge;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 2, 5, 3, 4, 7, 6, 1};
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static void mergeSort(int[] arr) {
        int length = arr.length;
        if (length <= 1) return;
        int middle = length / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[length - middle];
        int i = 0, j = 0;
         for (; i < length; i++) {
             if (i < middle) {
                 leftArr[i] = arr[i];
             } else {
                 rightArr[j] = arr[j];
                 j++;
             }
         }
         mergeSort(leftArr);
         mergeSort(rightArr);
         merge(leftArr, rightArr, arr);
    }
    private  static void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftsize = arr.length / 2;
        int rightsize = arr.length - leftsize;
        int i = 0, l = 0, r = 0;
        while (l < leftsize && r < rightsize)
            if (leftArr[l] < rightArr[r]) {
                arr[i] = leftArr[l];
                i++;
                l++;
            } else {
                arr[i] = rightArr[r];
                i++; r++;
        }
        while (l < leftsize){
            arr[i] = leftArr[l];
            r++; l++;
        }
        while (r < rightsize){
            arr[i] = rightArr[r];
            i++; r++;
        }
    }
}
