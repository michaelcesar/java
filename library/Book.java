package library;

public class Book extends Publication {
    public Book(String title, String author, int publicationYear) {
        super(title, author, publicationYear);
    }

    @Override
    public String getresume() {
        return "Livro: " + gettitle() + " | Autor: " + getauthor();
    }
}
