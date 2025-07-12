
package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int i,j,temp;
        int[] arr = {5,4,10,3,2,1};
        int n = 6;

    for(i=1 ; i<n ; i++)
    {
            temp = arr[i];
            j = i-1;
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;
    }

        System.out.println("Sorted Array: ");
    for(i=0 ; i<n ;i++)
    {
        System.out.print(arr[i]+ " ");
    }
  }
}
