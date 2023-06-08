package lab2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

  Scanner sc=new Scanner(System.in);
  
   String a;
    String b;
    String c;
    int d;
    String e;
    
    a=sc.nextLine();
    b=sc.nextLine();
    c=sc.nextLine();
    d=sc.nextInt();
    sc.nextLine();
  
    if(d>4){
     e="expensive";   
    }
    else{
        e="lowPrice";
    };
    
    car c1=new car(a,b,c,d,e);
    c1.display();
    
    a=sc.nextLine();
    b=sc.nextLine();
    c=sc.nextLine();
    d=sc.nextInt();
    sc.nextLine();
    
    if(d>4){
     e="expensive";   
    }
    else{
        e="lowPrice";
    };
    car c2=new car(a,b,d);
    c2.display();
    
    }
    
}
