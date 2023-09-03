package Classes;

public class PromoClient extends Actor {
    /**
     * Класс, описывающий акционного клиента
     */
    private String promoName;
    private int promoClientID = 0;
    private static int promoCount = 5;

    /**
     * конструктор класса PromoClient
     * @param name имя клиента
     * @param promoName название акции
     * @param promoClientID id клиента
     */
    public PromoClient(String name, String promoName, int promoClientID) {
        super(name);
        this.promoName = promoName;
        this.promoClientID = promoClientID;
        if(promoClientID>promoCount){
            System.out.printf("Too many clients in this action");
        }
    }

    /**
     * @return имя акции
     */
    public String getPromoName() {
        return promoName;
    }

    /**
     * @return id клиента
     */
    public int getPromoClientID() {
        return promoClientID;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public Actor getActor()
    {
        return this;
    }

    @Override
    public String getName() {
        return super.name;        
    }
    public void setName(String name) {
       super.name = name;        
    }
       public String toString(){
        return "Promo Client{ clientId = "+ promoClientID+ "action = "+promoName+"name = "+ name+"isTakeOrder = "+isTakeOrder+"isMaleOrder = "+ isMakeOrder+"}";
    }
}
