
package lab2;

public class car {
    String Make;
    String Model;
    String Color;
    int Price;
    String Review;
    
    car(String Make, String Model,String Color, int Price, String Review){
        this(Make,Model,Price);
        this.Color=Color;
        this.Price=Price;
        this.Review=Review;
    } 
   
  car(String Make, String Model,int Price){
        this.Make=Make;
        this.Model=Model;
        this.Price=Price;
    }
    
     car(String Make, String Model,String Color,String Review,int Price){
        this.Make=Make;
        this.Model=Model;
        this.Color=Color;
        this.Price=Price;
        this.Review=Review;
    }
     
    void display(String s){
        System.out.println("Make:"+Make);

    }
   /*  void display(){
        this.display("Make:"+Make);
        this.display("Model:"+Model);
       this.display("Color:"+Color);
        System.out.println("Price:"+Price);
        this.display("Review:"+Review);
        
    }*/
    
    void display(){
        System.out.println("Make:"+Make);
        System.out.println("Model:"+Model);
        System.out.println("Color:"+Color);
        System.out.println("Price:"+Price);
        System.out.println("Review:"+Review);
        
    }
}
