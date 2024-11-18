package library;

public class Magazine extends Publication {
    public Magazine(String title, String author, int publicationYear) {
        super(title, author, publicationYear);
    }

    @Override
    public String getresume() {
        return "Revista: " + gettitle() + " | Ano: " + getpublicationYear();
    }
}
