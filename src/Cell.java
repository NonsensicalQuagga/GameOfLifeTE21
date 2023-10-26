public class Cell {

    private int type = 0;

    public Cell(){};

    public Cell(int type){
        this.type = type;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void statusChange(int neighbours){
        if (type == 1){
            if(neighbours < 2 || neighbours > 4) type = 0;



        }

        if (type == 0){
            if (neighbours == 3) type = 1;
        }
    }
}
