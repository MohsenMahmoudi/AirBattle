//////////////////////////////////changed
package Block;

public class Mountain extends Block {
    public Mountain(){
        
    }
    public Mountain(int x,int y){
        super(x,y);
    }

    @Override
    public String toString() {
        return "Mountain at: ("+ super.getX() +" , "+ super.getY()+")";
    }
    @Override
    public char getName(){
        return 'M';
    }
}
