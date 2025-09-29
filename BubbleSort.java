// package DSA-Algo;

//Bubble Sort also known as Sinking Sort or Exchange Sort
//It is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order.
public class BubbleSort {
    public static void main(String[] args) {
        // int arr[] = {5,4,3,2,1,0};
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        bubble(arr, n);
        System.out.println("Sorted Array: ");
        printBubbleArray(arr,n);
    }

    static void bubble(int[] arr, int n){
        //run the steps n - 1 times
        for(int i = 0; i < n - 1; i++){
            boolean swapped = false;
            //for each step, max item will come at the last respective index
            for(int j = 0; j < n - 1 - i; j++){
                //swap if the item is smaller than the previous item
                if(arr[j] > arr [j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swapped == false){
                //array is already sorted
                break;
        }
        }
    }

    static void printBubbleArray(int[] arr, int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
