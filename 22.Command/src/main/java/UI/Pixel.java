package UI;

import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Pixel {

    private Rectangle[][] pixelVisuals = new Rectangle[8][8];
    private int[][] pixelData  = new int[8][8];
    private int cursorX = 0;
    private int cursorY = 0;

    public GridPane makePixels() {
        GridPane root = new GridPane();
        for  (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rect = new Rectangle(50, 50);
                rect.setFill(Color.WHITE);
                rect.setStroke(Color.GRAY);
                root.add(rect, i, j);
                pixelVisuals[i][j] = rect;
                pixelData[i][j] = 0;
            }
        }
        return root;

    }
    public int getCursorX() {
        return cursorX;
    }
    public int getCursorY() {
        return cursorY;
    }

    public void highlightCursor(boolean active) {
        pixelVisuals[cursorX][cursorY].setStroke(active ? Color.RED : Color.GRAY);
        pixelVisuals[cursorX][cursorY].setStrokeWidth(active ? 3 : 1);
    }

    public int[][] getPixelData() {
        return pixelData;
    }

    public String printRawData() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Current Pixel Map ---\n");
        for (int j = 0; j < 8; j++) {
            sb.append("{ ");
            for (int i = 0; i < 8; i++) {
                sb.append(pixelData[i][j]);
                if (i < 7) sb.append(", ");
            }
            sb.append(" },\n");
        }
        sb.append("-------------------------");
        return sb.toString();
    }

    public void moveCursor(int x, int y) {
        highlightCursor(false);
        int newCursorX = getCursorX() + x;
        int newCursorY = getCursorY() + y;

        if (newCursorX >= 0 && newCursorX < 8 && newCursorY >= 0 && newCursorY < 8) {
            cursorX = newCursorX;
            cursorY = newCursorY;
        }
        highlightCursor(true);

    }

    public void toggleCurrentPixel() {
        if (pixelData[cursorX][cursorY] == 0) {
            pixelData[cursorX][cursorY] = 1;
            pixelVisuals[cursorX][cursorY].setFill(Color.BLACK);
        }
        else {
            pixelData[cursorX][cursorY] = 0;
            pixelVisuals[cursorX][cursorY].setFill(Color.WHITE);
        }
    }







}
