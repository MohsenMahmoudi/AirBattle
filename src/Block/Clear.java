//////////////////////////////////changed
package Block;

public class Clear extends Block{
    public Clear(){
        
    }
    
    public Clear(int x,int y){
        super(x,y);
    }

    @Override
    public String toString() {
        return "Clear at: ("+ super.getX() + " , "+ super.getY() + ")";
    }
    @Override  
   public char getName(){
        return 'C';
   }
    
}
