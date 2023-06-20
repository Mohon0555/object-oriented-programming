
package labreportjava;
import java.util.Scanner;


public class LabReportJava {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int i,n;
    
    String make;
    String model;
    String colour;
    int price;
    
    System.out.print("Enter Car Count:");
    n=sc.nextInt();
    sc.nextLine();
            
    car c[]= new car[n];
    
    for(i=0;i<c.length;i++){
    
    System.out.print("Enter Car Make:");
    make=sc.nextLine();
    System.out.print("Enter Car Model:");
    model=sc.nextLine();
    System.out.print("Enter Car Colour:");
    colour=sc.nextLine();
    System.out.print("Enter Car Price:");
    price=sc.nextInt();
    colour=sc.nextLine();
    
    c[i]= new car(make,model,colour,price);   
    }
    
    
    for(int j=0;j<n;j++){
    
   c[j].display();
   
    } 
    
    
    int index;
    index=sc.nextInt();
    c[index-1]= null;
    for(i=0;i<n;i++){
        if(c[i]!=null){
          c[i].display();
          sc.nextLine();
          
        }
        
    }
    
    } 
    
  
    
}
