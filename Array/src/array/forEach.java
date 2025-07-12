
package array;
public class forEach {
    public static void main(String[] args) {
        int [] arr = {25,12,65,76,43,47,21};
        int sum = 0;
    for(int x : arr){
        System.out.print(x+" ");
        sum+=x;
    }
        System.out.println("\nSum: "+sum);
  }
}
