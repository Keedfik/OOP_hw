package Domen;

public class HotDrink extends Product {
    private int tempreture;
    public HotDrink(String name, int price, int tempreture){
        super(name, price);
        this.tempreture = tempreture;
    }
   
    public int getTempreture() {
        return tempreture;
    }

    public void setTempreture(int tempreture) {
        this.tempreture = tempreture;
    }
    @Override
    public String toString(){
        return "Product: price= "+super.getPrice()+"; name= "+super.getName()+"; tempreture= "+ this.tempreture;
    }

}
