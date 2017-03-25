//////////////////////////////////changed
package Block;

public class AntiAirCraftGun extends Block {
    public AntiAirCraftGun(){
        
    }
    public AntiAirCraftGun(int x,int y){
        super(x,y);
    }

    @Override
    public String toString() {
        return "Anti aircraft at: ("+ super.getX() + " , "+ super.getY() + ")";
    }
   @Override
   public char getName(){
       return 'A';
   }
    
}
