package Array;

import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {
        int[] a = {21,10,41,20,30,11,40,31};



        mergeSort(a,0,a.length-1);
//        merge(a,0,2,5);
        System.out.println(Arrays.toString(a));
    }
    public static void mergeSort(int[] arr,int start,int end)
    {
        if(start == end) return ;
        int mid = (start + end) /2;

        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);

    }
    public static void merge(int[] arr,int start,int mid,int end)
    {
        int[] mix = new int[end - start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i <=mid && j <= end)
        {
            if(arr[i] < arr[j])
            {
                mix[k] = arr[i];
                i++;
                k++;
            }
            else
            {
                mix[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i <= mid)
        {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j <=end)
        {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int m = 0 ; m <mix.length; m++)
        {
            arr[start+m] = mix[m];
        }
    }
}
