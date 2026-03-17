
public class DocumentProxy implements DocumentInterface {

    private final int identifier;  // no setter method rn
    private final long creationDate; // no setter method rn
    private Document document;
    private final AccessControlService accessControlService;
    private final AccessDeniedService accessDeniedService;
    private final boolean isProtected;

    public DocumentProxy(Document document, AccessControlService accessControlService,
                         AccessDeniedService accessDeniedService, boolean isProtected) {
        this.document = document;
        this.identifier = document.getIdentifier();
        this.creationDate = document.getCreationDate();
        this.accessControlService = accessControlService;
        this.accessDeniedService = accessDeniedService;
        this.isProtected = isProtected;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public int getIdentifier() {
        return identifier;
    }

    @Override
    public String getContent(User user) {
        if (!isProtected) {
            return document.getContent(user);
        }

        if (accessControlService.isAllowed(user.getUsername(), this.getIdentifier())) {
            return document.getContent(user);
        }
        return accessDeniedService.setMessage(user);
    }

    public Long getCreationDate() {
        return creationDate;
    }

    public Document getDocument() {
        return document;
    }  // IDK if I need this


}