package library;

public abstract class Publication {
    private String title;
    private String author;
    private int publicationYear;

    public Publication(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String gettitle() {
        return title;
    }

    public String getauthor() {
        return author;
    }

    public int getpublicationYear() {
        return publicationYear;
    }

    public abstract String getresume();
}
