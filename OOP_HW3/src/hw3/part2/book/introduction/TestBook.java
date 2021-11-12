package hw3.part2.book.introduction;

public class TestBook {
    public static void main(String[] args) {
        Author ahTek = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTek);

        Book dummyBook = new Book("Java for dummy", ahTek, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("author is: " + dummyBook.getAuthor());

        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
        System.out.println("Author's name is: " + anotherBook.getAuthorName());
        System.out.println("Author's mail is: " + anotherBook.getAuthorEmail());
        System.out.println("Author's gender is: " + anotherBook.getAuthorGender());
    }
}
