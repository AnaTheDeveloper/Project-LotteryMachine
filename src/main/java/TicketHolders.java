import java.util.ArrayList;
import java.util.Random;

public class TicketHolders {

  String name = "";
  int ticketNumber = -1;

  public TicketHolders(String name) {
    this.name = name;

    Random random = new Random();
    this.ticketNumber = random.nextInt(100 - 0) + 0;;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getTicketNumber() {
    return ticketNumber;
  }

  public void setTicketNumber(int ticketNumber) {
    this.ticketNumber = ticketNumber;
  }
}
