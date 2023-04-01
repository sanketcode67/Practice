package Array;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10,80,30,90,40,50,70};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int start,int end)
    {
        //base case
        //when only 1 element is present then the array is already sorted simply return
        //when the start > end the there is no element in array no need to sort return
        if(start >= end) return;

        //to partition the array as per the pivot and returns the correct index of pivot
        int pi = partition(arr,start,end);

        //faith
        //sort the array before pivot using quicksort
        quickSort(arr,start,pi-1);

        //faith
        //sort the array after pivot using quicksort
        quickSort(arr,pi+1,end);
    }
    public static int partition(int[] arr,int start,int end)
    {
        int pivot = arr[end];
        //choto ----> after choto pointer the next smallest element than pivot will come
        int choto = start -1;

        //i is traversing the arr from start index to end-1 index
        //because end is pivot index
        for(int i = start; i <= end -1; i++)
        {
            if(arr[i] < pivot)
            {
                choto++;
                //swap arr[choto] and arr[i]
                swap(arr,choto,i);

            }
        }
        choto++;
        //swap arr[choto] and arr[pivot index]
        swap(arr,choto,end);
        return choto;
    }

    //swap function swaps the value at two index given i and j in an array
    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
