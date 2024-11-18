package library;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Publication> {
    private List<T> publications;

    public Library() {
        this.publications = new ArrayList<>();
    }

    public void addPublication(T publication) {
        publications.add(publication);
    }

    public void removePublication(T publication) {
        publications.remove(publication);
    }

    public void listPublication() {
        System.out.println("Publicações na biblioteca:");
        for (T publication : publications) {
            System.out.println(publication.getresume());
        }
    }
}
