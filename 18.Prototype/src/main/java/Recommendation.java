import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {

    List<Book> books;
    private String targetAudience;

    public Recommendation(String targetAudience) {
        books = new ArrayList<>();
        this.targetAudience = targetAudience;
    }

    void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }
    public String getTargetAudience() {
        return targetAudience;
    }
    void addBook(Book book) {
        books.add(book);
    }
    List<Book> getBooks() {
        return books;
    }
    void removeBook(Book book) {
        books.remove(book);
    }

    public Recommendation clone () {
        try {
            Recommendation clonedRecommendation = (Recommendation) super.clone();
            clonedRecommendation.books = new ArrayList<>(); // I think this should make a deep copy
            for (Book book : books) {
                clonedRecommendation.addBook(book.clone());
            }
            return clonedRecommendation;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

}
