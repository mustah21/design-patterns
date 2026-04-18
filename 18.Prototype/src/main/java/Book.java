public class Book implements Cloneable {

    private String title;
    private String author;
    private String publicationYear;
    private String genre;

    public Book(String title, String author, String publicationYear, String genre) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException();
        }
    }


}
