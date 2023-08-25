public class CashProvider extends TickerProvider {

    public long card;
    public long hashCard;
    public boolean isAuthorization;

    CashProvider (long card, long hashCard, boolean isAuthorization) {
        this.card = card;
        this.hashCard = hashCard;
        this.isAuthorization = isAuthorization;
    }

    public void buy(double price){

    }

    public void authorization(Customer Customer){

    }
}
