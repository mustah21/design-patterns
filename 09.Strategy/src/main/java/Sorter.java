
public class Sorter {

    private SortingInterface sortingInterface;

    public Sorter(SortingInterface sortingInterface) {
        this.sortingInterface = sortingInterface;
    }

    public void setStrategy(SortingInterface sortingInterface) {
        this.sortingInterface = sortingInterface;
    }

    public void sort(int[] array) {
        sortingInterface.sort(array);
    }
}