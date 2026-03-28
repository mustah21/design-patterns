
public class SizeCalculatorVisitor implements FileSystemVisitor {

    private double totalSize = 0;

    public double getTotalSize() {
        return totalSize;
    }

    @Override
    public void visitDirectory(Directory directory) {
        for (FileSystemElement directories: directory.getDirectory()) {
            directories.accept(this);
        }
    }

    @Override
    public void visitFile(File file) {
        totalSize += file.getFileSize();
    }

}
