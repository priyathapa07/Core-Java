package Encapsulation_Polymerphism;

public class Encapsulation {

    public static void main(String[]args){

      //constructor overloading
      Book b1 = new Book("Java", "XYZ", 1, "ABC", 200.0);

      //using setter to update the value
      b1.setPrice(400);
      b1.setPrice(900);
      System.out.println ( b1.getAuthor());
      System.out.println(b1.getPrice());



       Movie M1 = new Movie(10, 10,20);
       M1.increaseTicketPrice(5);
       M1.releaseMoreTickets(5);
       M1.sellTicket(12);
       M1.sellTicket(8);

        //Polymorphism
       DrPepper DP = new DrPepper();
       if(DP instanceof Bottle){
           System.out.println("");
       }
       if (DP instanceof  LabelMaker){
           System.out.println("");
       }
       if (DP instanceof  Soda){
           System.out.println("");
       }

    }
}
