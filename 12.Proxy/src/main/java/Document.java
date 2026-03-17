
public class Document implements DocumentInterface {

    private String content;
    private int identifier;
    private Long creationDate;

    public Document(int identifier, long creationDate, String content) {
        this.content = content;
        this.identifier = identifier;
        this.creationDate = creationDate;
    }
    public int getIdentifier() {
        return identifier;
    }
    public Long getCreationDate() {
        return creationDate;
    }
    @Override
    public String getContent(User user) {
        return content;
    }

}
