import java.util.Scanner;

class Library {
    private String title;
    private String author;
    private double price;

    Library(String title , String author , double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price. Price not changed. Current price: %.1f".formatted(this.price));
        }
    } 

    public double getPrice() {
        return price;
    }
  
}

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library book = new Library("Java Basics", "James Gosling", 50.0);
        book.setPrice(-10);
        sc.close();
    }
}