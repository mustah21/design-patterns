import java.util.*;

public class UI {

    public static Scanner scan = new Scanner(System.in);
    private List<Recommendation> saved = new ArrayList<>();


    private int readUserChoice(String[] options) {
        while (true) {
            System.out.print("Enter your choice: \n");
            for (int i = 0; i < options.length; i++) {
                System.out.print((i + 1) + ": " + options[i]);
            }
            int choice = Integer.parseInt(scan.nextLine());
            if (choice >= 1 && choice <= options.length) {
                return choice;
            }
            System.out.println("Please enter a number between 1 and " + options.length);
        }
    }

    private String[] bookAdding() {
        System.out.print("Title: ");
        String title = scan.nextLine();
        System.out.print("Author: ");
        String author = scan.nextLine();
        System.out.print("Year: ");
        String year = scan.nextLine();
        System.out.print("Genre: ");
        String genre = scan.nextLine();
        return new String[]{title, author, year, genre};
    }

    private void createRecommendation() {
        System.out.println("Your target audience? ");
        Recommendation r = new Recommendation(scan.nextLine());

        System.out.println("How many books would you like to add? ");
        int count = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= count; i++) {
            String[] data = bookAdding();
            r.addBook(new Book(data[0], data[1], data[2], data[3]));
        }
        saved.add(r);
        System.out.println("saved.\n");
    }

    private void viewRecommendations() {
        if (saved.isEmpty()) {
            System.out.println("No recommendations saved.");
            return;
        }
        for (int i = 0; i < saved.size(); i++) {
            Recommendation r = saved.get(i);
            System.out.println(i + ". [" + r.getTargetAudience() + "]");;
            for (Book b : r.getBooks()) {
                System.out.println(" - " + b.getIndex() + ": "+ b.getTitle() + " by " + b.getAuthor());;;
            }
        }
    }


    private void modifyRecommendation() {
        viewRecommendations();
        int recIndex = -1;
        while (true) {
            System.out.print("Please enter the index you would like to modify: ");
            recIndex = Integer.parseInt(scan.nextLine());
            if (recIndex >= 0 && recIndex < saved.size()) {
                break;
            }
            System.out.println("Invalid index, try again.");
        }

        Recommendation clone = saved.get(recIndex).clone();
        scan.nextLine();
        System.out.println("Would you like to modify the target audience?(y/n)");
        String userR = scan.nextLine();

        if (userR.equalsIgnoreCase("y")) {
            System.out.println("Enter the new target audience: ");
            clone.setTargetAudience(scan.nextLine());
        }

        label:
        while (true) {
            System.out.println("Add a book (press a)? Remove a book (press r): (Press e to exit)");
            String action = scan.nextLine();

            switch (action) {
                case "a":
                    String[] data = bookAdding();
                    clone.addBook(new Book(data[0], data[1], data[2], data[3]));
                    break;
                case "r":
                    System.out.print("Enter book index to remove: ");
                    int removeIndex = Integer.parseInt(scan.nextLine());
                    if (removeIndex >= 0 && removeIndex < clone.getBooks().size()) {
                        clone.removeBook(removeIndex);
                    }  else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case "e":
                    break label;

            }
        }

        saved.add(clone);
        System.out.println("Clone saved.\n");
    }


    public void selection() {
        String[] options = {
                "Create recommendations\n", "View existing recommendations\n", "Clone and modify recommendation\n", "Exit\n"
        };

        while (true) {
            switch (readUserChoice(options)) {
                case 1 -> createRecommendation();
                case 2 -> viewRecommendations();
                case 3 -> modifyRecommendation();
                case 4 -> {
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }

    }

}





