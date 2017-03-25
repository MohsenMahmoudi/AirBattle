//complete
package Block;



public abstract class  Block {
//    private Fog fog1=new Fog();
    protected int x;
    protected int y;
    protected char name;
   //------------------------------------------------------------constructors
    public Block(){
    }
    public Block(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Block(int x,int y,char name){
        this.name=name;
        this.x=x;
        this.y=y;
    } 
    //----------------------------------------------------------getters & setters
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public abstract char getName();
    
    public void setName(char name) {
        this.name = name;
    }
    //----------------------------------------------------------@over & other
    @Override
    public  abstract String  toString();    
}
