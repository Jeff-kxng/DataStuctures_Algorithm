package Selection;

public class Main {
    public static void main(String[] args) {
        // Selection sort = search through an array and keep track of
        // the minimum value during each interaction. we swap variable.
        // Quadratic time O(n^2)
        // small data set = okay
        // large data set = Bad
        int array[] = {8, 9, 4, 6, 7, 3, 1, 5};
        selectionSort(array);
        for (int i : array){
            System.out.print(i);
        }
    }
    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
