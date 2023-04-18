package Linear_search;

public class Main {
    public static void main(String[] args) {
        // linear search = Iterate through a collection one element at a time
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int index = linearSearch(array);
        if (index != -1){
            System.out.println("Element found at index : " + index);
        } else {
            System.out.println("Element can not found at index");
        }
    }

    private static int linearSearch(int[] array) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == 10){
                return i;
            }
        }
        return -1;
    }
}
