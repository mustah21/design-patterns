
public interface FileSystemVisitor {

    void visitDirectory(Directory directory);
    void visitFile(File file);
}
