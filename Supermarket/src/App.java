import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Classes.PromoClient;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new SpecialClient("prezident", 1);
        iActorBehaviour client3 = new TaxInspector();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        iActorBehaviour client4 = new PromoClient("Ivan", "Action", 1);
        iActorBehaviour client5 = new PromoClient("Petr", "Action", 2);
        iActorBehaviour client6 = new PromoClient("Ilya", "Action", 10);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.update();
    }
}