package Constructor;
/** POJO class for Book
which shows the information of the book.
 */

public class try1 {
//instance variables
    private String name;
    private Double price;
    private Integer quantity;


    //Empty/default Constructor
    public try1(){

    }

    public try1(String name, Double price) {
        this.name = name;
        this.price = price;
        System.out.println(name+"............."+price);
    }

    public try1(String name, Double price,Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        System.out.println("The name is:" + name + "    The price is" + price +  "     The quantity is " + quantity);
    }

    /**
     * Two methods;
     */

    public void displayInfo(String name){
        System.out.println(name);
    }

    public void displayInfo(String name, Double price){
        System.out.println(name + "......."+ price );

    }

}
