import java.util.List;

public class Customer extends TickerProvider {

    public int id;
    public List<Ticket> tickets;
    public CashProvider cash;

    Customer (int id, List<Ticket> tickets, CashProvider cash) {
        this.id = id;
        this.tickets = tickets;
        this.cash = cash;
    }

    public boolean buyTicket(Ticket Ticket){
        return Ticket.isValid = true;
    }

    public Ticket search(DateTime date, long rootNumber){
        if (Ticket.DateTime.equals(date) = true) and (rootNumber == Ticket.rootNumber){
            return Ticket Ticket;
        }
        else {
            System.out.println("нет такого билета на данную дату");
        }
    }
}
