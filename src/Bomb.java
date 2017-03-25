////////////////////////////////////////////changed
public class Bomb extends Weapon {
    private boolean fire=true;
//    private Aircraft b;
    private char inputW;
    
//    
//    public Bomb(Aircraft b){
//        super(b);
//    }

//    public boolean isFire(char inputW) {
//        this.inputW=inputW;
//        if(inputW=='x')
//            return fire;
//        return (!fire);
//        
//    }

    public char getBmb() {
        return 'x';
    }

    public void setFire(boolean fire) {
        this.fire = fire;
    }

//    public boolean position() {
//        if (isFire(inputW)) {
//            if (super.getDir() == 'u') {
//                return b.goUp();
//            } else if (super.getDir() == 'd') {
//                return b.goDown();
//            } else if (super.getDir() == 'r') {
//                return b.goLeft();
//            } else if (super.getDir() == 'l') {
//                return b.goRight();
//            }
//        }
//        return false;
//    }

    @Override
    public String toString() {
        return "";
    }
}
