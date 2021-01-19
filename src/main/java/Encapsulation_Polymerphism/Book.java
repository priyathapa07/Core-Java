package Encapsulation_Polymerphism;

/**
 * POJO class
 * Making variable private won't let other class to access it directly
 * Encapsulating the variable using getter and setter to set and get the required value
 * Using constructor
 */
public class Book {

    //making variables private
    private String name,Author,Publisher;
    private Integer Edition;
    private Double Price;

    //Constructor
    public Book(String name, String author, Integer edition, String publisher, double price) {
        this.name = name;
        Author = author;
        Edition = edition;
        Publisher = publisher;
        Price = price;
    }

    //Getter
    public String getName() {
        return name;
    }

    //setter
    private void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public Integer getEdition() {
        return Edition;
    }

    public void setEdition(Integer edition) {
        Edition = edition;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
