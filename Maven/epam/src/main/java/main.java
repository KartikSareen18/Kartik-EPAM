import gifts.*;
import sweets.*;

public class main{
    public static void main(String args[]){
        Sweet x=new Chocolate("X",80,50,"Snicker");

        Sweet y=new Chocolate("Y",150,20,"Dairy Milk");

        Sweet z=new Candy("Z",10,80,"Alpenliebe");

        Gift gifts=new Gift();
        gifts.addSweet(x);
        gifts.addSweet(y);
        gifts.addSweet(z);

        System.out.println(gifts.getWeight());
        System.out.println(gifts.toString());
    }
}