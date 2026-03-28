
public class SearchVisitor implements FileSystemVisitor {

    private String exe;
    private int count;
    private String targetExtension;

    public SearchVisitor(String targetExtension) {
        this.targetExtension = targetExtension;
    }

    @Override
    public void visitDirectory(Directory directory) {
        for (FileSystemElement directories : directory.getDirectory()) {
            directories.accept(this);
        }
    }

    @Override
    public void visitFile(File file) {
        String fileName = file.getFileName();
        int dotIndex = fileName.lastIndexOf('.');

        if (dotIndex != -1 && dotIndex < fileName.length() - 1) {
            String extension = fileName.substring(dotIndex + 1);

            if (extension.equals(targetExtension)) {
                count++;
            }
        }
    }

    public int getCount() {
        return count;
    }

}


