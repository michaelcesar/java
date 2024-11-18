package library;

public class LibrarySystem {
    public static void main(String[] args) {
        Library<Publication> library = new Library<>();

        Book book1 = new Book("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 1997);
        Book book2 = new Book("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        Magazine magazine1 = new Magazine("Forbes", "Vários autores", 2023);
        Magazine magazine2 = new Magazine("The Economist", "Vários autores", 2022);

        library.addPublication(book1);
        library.addPublication(book2);
        library.addPublication(magazine1);
        library.addPublication(magazine2);

        library.listPublication();

        library.removePublication(book1);
        System.out.println("\nApós remover:");
        library.listPublication();
    }
}
