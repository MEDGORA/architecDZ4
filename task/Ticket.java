public class Ticket  {

    public Long rootNumber;
    public double price;
    public int place;
    public DateTime date;
    public Boolean isValid;

    public Ticket (Long rootNumber, double price, int place, DateTime date, Boolean isValid) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.place = place;
        this.date = date;
        this.isValid = isValid;
    }

}