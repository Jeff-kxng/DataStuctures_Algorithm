package Bubble_sort;

public class Main {
    // bubble sort = pairs of adjacent element are compared, and the elements
    // swapped if they are not in order
    // Quadratic time 0(n^2)
    // large data set = bad
    // small data set = okay-ish
    public static void main(String[] args) {
        int array[] = {1, 2, 4, 3, 8, 6, 7, 9, 5};
        bubbleSort(array);
        for (int i : array){
            System.out.print(i);
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i <= array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
