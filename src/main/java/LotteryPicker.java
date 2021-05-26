import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LotteryPicker {
  private ArrayList<String> prizes = new ArrayList<String>(Arrays.asList("Car", "Teddy Bear", "Cinema Tickets", "Bag of Sweets", "PS5"));

  private ArrayList<TicketHolders> allEntries;


  public LotteryPicker(ArrayList<TicketHolders> allEntries) {
    this.allEntries = allEntries;
  }



  public void lotteryMachine() {

    if (prizes.size() == 0) {
      System.out.println("There are no more prizes");
      return;
    }

    if (allEntries.size() == 0) {
      System.out.println("All entries have prizes");
      return;
    }
    //Randomly pick a prize
    //Assign prize to a variable
    //delete prize from machine list, so other people done cant get it
    Random random = new Random();
    int pickFromPrizeList = random.nextInt(prizes.size() - 0) + 0;

    String prizePicked = prizes.get(pickFromPrizeList);
    prizes.remove(pickFromPrizeList);



    //Randomly pick a winner from ticket holders
    //Save that to a variable
    //Delete from list
    Random random2 = new Random();
    int pickFromTicketList = random.nextInt(allEntries.size() - 0) + 0;
    TicketHolders luckyWinner = allEntries.get(pickFromTicketList);
    allEntries.remove(pickFromTicketList);






    //Persons name, persons ticket and the prize they Won.

    System.out.println("Congratulations "+ luckyWinner.getName() + "! Your ticket number:"
        + luckyWinner.getTicketNumber()+ ", has won you this prize: "+ prizePicked);








  }






}
