//////////////////////////////////////changed
public class Missile extends Weapon {

    private boolean fire=true;
    private Aircraft b;
    private char msl;
    private char inputW;
    
//    public Missile(Aircraft b){
//        super(b);
//    }
    
//    public boolean isFire(char inputW) {
//        this.inputW = inputW;
//        if (inputW == 'z') {
//            return fire;
//        }
//        return (!fire);
//
//    }
//
    public char getMsl() {
        return 'z';
    }

//    public void setMsl(char msl) {
//        this.msl = msl;
//    }
    
    
    public void setFire(boolean fire) {
        this.fire = fire;
    }
//
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
