//weapon 

public class Weapon{

    protected Aircraft Luncher;
    private char dir;
//    protected int row;
//    protected int col;
//    protected char inputW;
    private Bomb bomb;
    private Missile missile;
    private GameM game1;
//    private Missile missile;

    //----------------------------
    public Weapon(){////????
        
    }
//    public Weapon(Aircraft Luncher) {
//        this.Luncher = Luncher;
//        this.dir = Luncher.getDir();
//        if(Luncher.getWeapon()=='x')
//        game1.fire(bomb);
//        else if(Luncher.getWeapon()=='z')
//        game1.fire(missile);
//    }

    
    
    public char getDir() {
        return this.dir;
    }
    
    @Override
    public String toString(){
        return "Luncher: "+ this.Luncher;
    }
}
