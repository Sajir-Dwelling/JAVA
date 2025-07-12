
package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {15,16,6,8,5};
    int n = 5;
    int i,j,flag,temp;

    for(i=0 ; i<n-1 ; i++)
    {
        flag = 0;
        for(j=0 ; j<n-1-i ; j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag = 1;
            }
        }
            if(flag==0)
                break;
    }


        System.out.println("Sorted Array: ");
            for (i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
    }
    }
}
