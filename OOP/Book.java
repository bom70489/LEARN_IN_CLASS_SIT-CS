class Book {
    public String title;
    public String author;
    public double price;
    private boolean available;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if(available == true) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println("Book returned successfully.");
    }

    public boolean isAvailable() {
        return available;
    }

}