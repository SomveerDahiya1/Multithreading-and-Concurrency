class BookTicket{
    BookTicket(){

    }
    static int totalTickets = 10 ;
     synchronized  void bookTicket(int tickets){
        if(totalTickets>=tickets){
            synchronized (this) {
                totalTickets -= tickets; // Synchronized block part
            }
            System.out.println("Booked Tickets...");
            return ;
        }
        System.out.println("Sorry ! Only "+totalTickets+" seats left !");
    }
}
public class SynchronizedMethod {
    public static void main(String[] args){
        BookTicket bookTicket = new BookTicket();

        Thread t1 = new Thread(()-> bookTicket.bookTicket(5));
        Thread t3 = new Thread(()-> bookTicket.bookTicket(9));

        //Only one thread enter the bookTicket() method at a time
        t1.start();
        t3.start();
        // We can put the wanted code in synchronized block OR
        // Define the method with Synchronized keyword
    }
}
