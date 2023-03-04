import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {21,10,41,20,30,11,40,31};


        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(int[] arr)
    {
        if(arr.length == 1) return;

        int[] left = new int[arr.length/2];
        int[] right = new int[arr.length - left.length];

        //copy left array elements
        for(int i = 0; i< left.length;i++)
            left[i] = arr[i];
        //copy right array elements
        for(int i = 0; i< left.length;i++)
            right[i] = arr[left.length+i];

        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);
    }

    public static void merge(int[] a,int[] b, int[] c)
    {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length)
        {
            if(a[i] <= b[j])
            {
                c[k] = a[i];
                i++;
            } else if (a[i] > b[j]) {
                c[k] = b[j];
                j++;
            }
            k++;

        }
        while(i < a.length)
        {
            c[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length)
        {
            c[k] = b[j];
            j++;
            k++;
        }

    }
}
