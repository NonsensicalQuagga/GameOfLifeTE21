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

    }
}
