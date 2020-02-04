package sweets;

public class Chocolate extends Sweet{
    String chocolateBrand;

    public Chocolate(String name,int price,int weight,String chocolateBrand){
        super(name,price,weight);
        this.chocolateBrand=chocolateBrand;
    }

}