
package Block;

public class Random extends Block {
    private int random;
    Block blockNo;
    int row, col;
    //----------------------------
    public Random(int row, int col){
        this.row=row;
        this.col=col;
        randomBlock();
    }
    public void randomBlock(){
    java.util.Random r = new java.util.Random();
    random=r.nextInt(10);
        if(random>=0 && random<=5)
            blockNo=new Clear(super.getX(),super.getY());
        else if(random==6)
            blockNo=new Fog(super.getX(),super.getY());
        else if(random==7)
            blockNo=new AirShip(super.getX(),super.getY());
        else if(random==8)
            blockNo=new AntiAirCraftGun(super.getX(),super.getY());
        else if(random==9)
            blockNo=new Mountain(super.getX(),super.getY());
    }
    
    
    @Override
    public String toString() {
        return blockNo.toString();
    }
    @Override
     public char getName(){
         return blockNo.getName();
     }
     
}


