package sweets;

public class Sweet implements Comparable<Sweet>{

    private String sweetName;
    private int price;
    private int weight;

    public Sweet(String sweetName,int price,int weight)
    {
        this.sweetName=sweetName;
        this.price=price;
        this.weight=weight;
    }

    public String getName()
    {
        return sweetName;
    }

    public int getPrice()
    {
        return price;
    }

    public int getSweetWeight()
    {
        return weight;
    }

    public void setSweetName(String sweetName) {
        this.sweetName = sweetName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString(){
        return "Sweet name : "+sweetName+" weight : "+weight+" price : "+price;
    }

    public int compareTo(Sweet s){
        int result= getPrice()-s.getPrice();
        return result;
    }
}