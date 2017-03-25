//////////////////////////////////changed
package Block;

public class Fog extends Block {
    
    public Fog(){
        
    }

    public Fog(int x, int y) {
        super(x, y);
    }
//    public void PosAirCr(){
//        
//        
//    }

    @Override
    public String toString() {
        return "Fog at: ("+ super.getX() + " , "+ super.getY() + ")";
    }
    @Override
    public char getName(){
        return 'F';
    }
}
