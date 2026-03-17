public class Main {

    public static void main(String[] args) {

        AccessControlService accessControlService = AccessControlService.getInstance();
        AccessDeniedService accessDeniedService = new AccessDeniedService();
        Library library = new Library();

        Document doc1 = new Document(1, System.currentTimeMillis(), "Top secret content");
        Document doc2 = new Document(2, System.currentTimeMillis(), "Public report content");
        Document doc3 = new Document(3, System.currentTimeMillis(), "Confidential memo");
        Document doc4 = new Document(3, System.currentTimeMillis(), "This document is not protected");
        Document doc5 = new Document(3, System.currentTimeMillis(), "This document is also not protected");


        // documents in proxies
        DocumentProxy proxy1 = new DocumentProxy(doc1, accessControlService, accessDeniedService, true);
        DocumentProxy proxy2 = new DocumentProxy(doc2, accessControlService, accessDeniedService, true);
        DocumentProxy proxy3 = new DocumentProxy(doc3, accessControlService, accessDeniedService, true);
        DocumentProxy proxy4 = new DocumentProxy(doc4, accessControlService, accessDeniedService, false);
        DocumentProxy proxy5 = new DocumentProxy(doc5, accessControlService, accessDeniedService, false);

        proxy1.setDocument(doc1);
        proxy2.setDocument(doc2);
        proxy3.setDocument(doc3);
        proxy4.setDocument(doc4);
        proxy5.setDocument(doc5);

        library.addDocument(1, proxy1);
        library.addDocument(2, proxy2);
        library.addDocument(3, proxy3);
        library.addDocument(4, proxy4);
        library.addDocument(5, proxy5);


        User alice = new User("alice");
        User bob = new User("bob");
        User carol = new User("carol");

        accessControlService.grantAccess("alice", 1);
        accessControlService.grantAccess("alice", 2);
        accessControlService.grantAccess("bob", 2);
        accessControlService.grantAccess("carol", 3);


        System.out.println("--- Alice ---");
        System.out.println(library.getDocument(1).getContent(alice)); // allowed
        System.out.println(library.getDocument(2).getContent(alice)); // allowed
        System.out.println(library.getDocument(3).getContent(alice)); // denied

        System.out.println("--- Bob ---");
        System.out.println(library.getDocument(2).getContent(bob));   // allowed
        System.out.println(library.getDocument(1).getContent(bob));   // denied

        System.out.println("--- Carol ---");
        System.out.println(library.getDocument(3).getContent(carol)); // allowed


        // unprotected documents
        System.out.println("\n--- Unprotected documents ---");
        System.out.println(library.getDocument(4).getContent(alice));
        System.out.println(library.getDocument(5).getContent(alice));

        System.out.println(library.getDocument(4).getContent(bob));
        System.out.println(library.getDocument(5).getContent(bob));

    }
}