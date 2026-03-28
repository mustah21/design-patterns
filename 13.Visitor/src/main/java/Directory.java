import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {

    private List<FileSystemElement> directory;
    private String name;

    public Directory(String name) {
        this.name = name;
        this.directory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FileSystemElement> getDirectory() {
        return directory;
    }

//    public void setDirectory(List<FileSystemElement> directory) {
//        this.directory = directory;
//    }


    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visitDirectory(this);
    }

}
