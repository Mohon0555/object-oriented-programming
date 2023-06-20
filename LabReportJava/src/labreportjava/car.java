
package labreportjava;


public class car {
    String make;
    String model;
    String colour;
    int price;
    
    car (String make,String model, String colour, int price){
    this.make=make;
    this.model=model;
    this.colour=colour;
    this.price=price;
}
    void display(){
        System.out.println("Make:"+make);
        System.out.println("Model:"+model);
        System.out.println("Colour:"+colour);
        System.out.println("Price:"+price);
    }
    
}
