
package June_15;
import java.util.Scanner;
import java.util.Random;
public class June_15 {

    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
        int n,i,j;          
        System.out.println("Enter Number:");
        
        n=sc.nextInt();
        
         Random ran= new Random();
           int arr[]= new int[n];
        
       for(i=0;i<n;i++){
        //   arr[i]=sc.nextInt();
        arr[i]= ran.nextInt(100);
       }
       
       System.out.println("Befor sort");
       for(i=0;i<n;i++){
       
       System.out.println(arr[i]+" ");
       }
          System.out.println("After sort");
        for(i=0;i<n;i++){    
            
            for(j=i+1;j<n;j++){
                
                int temp=0;
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;                   
                }                
            }
            System.out.println(arr[i]+" ");
        }                
    }
}
