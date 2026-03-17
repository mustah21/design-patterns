import javax.swing.text.View;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private Model model;
    private Gui gui;
    private List<IMemento> undoList;
    private List<IMemento> redoList;
    private List<IMemento> historyList;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.undoList = new ArrayList<>();
        this.redoList = new ArrayList<>();
        this.historyList = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOptions(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.isSelected();
    }

    public void undo() {
        if (!undoList.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento prevState = undoList.remove(undoList.size() - 1);
            redoList.add(prevState);
            model.restoreState(prevState);
            gui.updateGui();
        } else {
            System.out.println("Nothing to undo");
        }
    }

    public void redo() {
        if (!redoList.isEmpty()) {
            System.out.println("Memento found in history redoing the last action.");
            IMemento currState = redoList.remove(redoList.size() - 1);
            undoList.add(currState);
            model.restoreState(currState);
            gui.updateGui();
        } else {
            System.out.println("Nothing to redo");
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        undoList.add(currentState);
        historyList.add(currentState);

        redoList.clear();
    }

    public List<IMemento> getHistory() {
        return historyList;
    }

    public void jumpToHistory(int index) {
        if (index >= 0 && index < historyList.size()) {
            IMemento currState = historyList.get(index);
            model.restoreState(currState);
            gui.updateGui();
        }
    }
}
