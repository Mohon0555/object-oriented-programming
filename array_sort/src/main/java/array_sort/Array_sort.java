
package array_sort;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Array_sort {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    int n;
    
    System.out.print("Enter Number:");
    n=sc.nextInt();
    sc.nextLine();
    
    int ara[]= new int[n];
    
    Random ran = new Random();
    
    for(int i=0; i<n;i++){
        ara[i]=ran.nextInt(100);
    }
    for(int i=0; i<n;i++){
        System.out.println(ara[i]);
    }
    Arrays.sort(ara);
    System.out.println(Arrays.toString(ara));
    
    }
}
