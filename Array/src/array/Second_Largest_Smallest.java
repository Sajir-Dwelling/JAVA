
package array;

public class Second_Largest_Smallest {
    public static void main(String[] args) {
        int[] arr = {7,4,9,6};
        int size,temp;
        size = arr.length;
        System.out.println("Size of array: "+size);
        
        //Sorting in ascending order
        for(int i = 0; i<size ; i++)
            {
                for(int j = i+1 ; j<size ; j++)
                {
                    if(arr[i]>arr[j]){
                        temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }                    
                }            
            }
        
        System.out.print("Array in ascending order: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" "); //4,6,7,9 
        }
        
        //Taking Second Largest number
        System.out.println();
        System.out.println("Second Largest number in the array is: "+arr[size-2]);
    }
    
    
}
