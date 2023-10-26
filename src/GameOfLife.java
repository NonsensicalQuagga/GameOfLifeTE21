import java.util.ArrayList;

public class GameOfLife extends Engine {
    Engine e;
    Cell[][] cells;
    public GameOfLife(int w, int h, int scale)  {
        super(w,h,scale);
        cells = new Cell[w][h];
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                cells[j][i] = new Cell();
            }
        }
        for (int i = 0; i < w; i++){
            cells[i][50].setType(1);
        }
        System.out.println(cells[1][51].getType());
    }

    public void update() {
        for (int x = 10 ; x < 90 ; x++)
            drawPixel(x,50, 0xFF00FF);

    }

}
