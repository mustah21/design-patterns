import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Directory dir = new Directory("Visitor pattern");

        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.txt", 20);
        File file3 = new File("file3.txt", 30);

        Directory subDir = new Directory("java");

        subDir.getDirectory().add(file1);
        subDir.getDirectory().add(file2);
        subDir.getDirectory().add(file3);

        dir.getDirectory().add(subDir);
        SizeCalculatorVisitor visitor = new SizeCalculatorVisitor();
        dir.accept(visitor);

        System.out.println("Total size: " + visitor.getTotalSize());

        SearchVisitor searchVisitor = new SearchVisitor("txt");
        dir.accept(searchVisitor);
        System.out.println("Same file extension found " + searchVisitor.getCount() + " times");


    }
}
