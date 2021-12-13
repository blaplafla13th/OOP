package hw3.part2.book.advanced;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        StringBuilder out= new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            if (i == authors.length - 1)
                out.append(authors[i].getName());
            else
                out.append(authors[i].getName()).append(", ");
        }
        return out.toString();
    }
    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("Book[" + "name=" + name + ", authors{");
        for (int i = 0; i < authors.length; i++) {
            if (i == authors.length - 1)
                out.append(authors[i]).append("}");
            else
                out.append(authors[i]).append(", ");
        }
        out.append(", price=").append(price).append(", qty=").append(qty).append(']');
        return out.toString();
    }
}
