
public class Model {

    private int[] options = new int[3];
    private boolean isSelected;


    public void setOptions(int optionNumber, int choice) {
        System.out.println("optionNumber: " + optionNumber + " choice: " + choice);
        if (optionNumber >= 1 && optionNumber <= 3) {
            options[optionNumber - 1] = choice;
        }
    }

    public int getOption(int optionNumber) {
        if (optionNumber >= 1 && optionNumber <= 3) {
            return options[optionNumber - 1];
        }
        return -1;
    }

    public void setSelected(boolean selected) {
        System.out.println("isSelected: " + selected);
        isSelected = selected;
    }
    public boolean isSelected() {
        return isSelected;
    }

    public IMemento createMemento() {
        return new Memento(options, isSelected);
    }

    public void restoreState(IMemento memento) {
        Memento m = (Memento) memento;
        options = m.getOptions();
        System.out.println("options: " + options[0] + " " + options[1] + " " + options[2]);
        isSelected = m.isSelected();
        System.out.println("isSelected: " + isSelected);
        System.out.println("State restored");

    }


}

