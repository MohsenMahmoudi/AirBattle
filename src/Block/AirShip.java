//////////////////////////////////changed
package Block;

public class AirShip extends Block {
    public AirShip(){
        
    }
    public AirShip(int x,int y){
        super(x,y);
    }

    @Override
    public String toString() {
        return "AirShip at: ("+ super.getX() + " , "+ super.getY() + ")";
    
        
    }
    
    @Override
    public char getName(){
        return 'S';
    }
    
}
