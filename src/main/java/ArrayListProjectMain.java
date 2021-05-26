import java.util.ArrayList;

public class ArrayListProjectMain {


  public static void main(String[] args) throws InterruptedException {
    //1:create a list of all our ticket holders
    ArrayList<TicketHolders> everybodyWhoHasATicket = new ArrayList<TicketHolders>();

    TicketHolders person1 = new TicketHolders("Luke");
    TicketHolders person2 = new TicketHolders("Ana");
    TicketHolders person3 = new TicketHolders("Bob");
    TicketHolders person4 = new TicketHolders("JHAKEET");
    TicketHolders person5 = new TicketHolders("Roger");
    TicketHolders person6 = new TicketHolders("Sally");


    everybodyWhoHasATicket.add(person1);
    everybodyWhoHasATicket.add(person2);
    everybodyWhoHasATicket.add(person3);
    everybodyWhoHasATicket.add(person4);
    everybodyWhoHasATicket.add(person5);
    everybodyWhoHasATicket.add(person6);

    //Can also do it like this -->  everybodyWhoHasATicket.add(person1, person2 etc);




    //2:pass list into lottery picker's constructor

    LotteryPicker lotteryPicker = new LotteryPicker(everybodyWhoHasATicket);

    //everyonewhohasaticket is the poopface, saved to a variable so you can use it again


    //lottery picker is going to have a method that randomly picks a prize, and randomly picks a winner

    //4: We have to delete the prize from the arrayList and delete the ticket holder from their list

  ///CALLING LOTTERY:


    lotteryPicker.lotteryMachine();
    Thread.sleep(1000);
    lotteryPicker.lotteryMachine();
    Thread.sleep(1000);
    lotteryPicker.lotteryMachine();
    Thread.sleep(1000);
    lotteryPicker.lotteryMachine();
    Thread.sleep(1000);     //Adding a delay, how you'd make a timer
    lotteryPicker.lotteryMachine();
    lotteryPicker.lotteryMachine();


    //Computer has one core that has so many different threads, ie core7, core 3. currently were running on one thread, and different classes
    //can run on different threads.



  }

}
