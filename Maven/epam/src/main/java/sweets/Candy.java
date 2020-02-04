package sweets;

public class Candy extends Sweet{
    String candyBrand;

    public Candy(String name,int price,int weight,String candyBrand){
        super(name,price,weight);
        this.candyBrand=candyBrand;
    }

}