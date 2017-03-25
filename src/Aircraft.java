//good***2nd constructor*** getNum &setNum *** fire
public class Aircraft {

    private String name;
    private int x;
    private int y;
    private int num;//----**********************
    private boolean Alive;
    private char dir;
    private char weapon;//------------------------------------------------***********************
    private Weapon BM, bomb, missile;
    private GameM gm;
    //--------------------------------------------------------------------constructors
    public Aircraft(int row,int col, String name, int num){
        x=row;
        y=col;
        this.name=name;
        this.num = num;
        Alive=true;
        
    }

    //-------------------------------------------------------------------setters & getters

    public String getName() {    
        return name;
    }

    public void setName(String name) {
        if(Alive)
        this.name = name;
    }

    public int getX() {
        if(Alive)
        return x;
        return 0;
    }

    public void setX(int x) {
        if(Alive)
        this.x = x;
    }

    public int getY() {
        if(Alive)
        return y;
        return 0;
    }

    public void setY(int y) {
        if(Alive)
        this.y = y;
    }

    public char getDir() {
        if(Alive)
        return dir;
        return ' ';
    }

    public void setDir(char dir) {
        if(Alive)
        this.dir = dir;
    }

    public int getNum() {
        if (Alive) 
            return this.num;
        return -1;
    }

    public void setNum(int num) {
        if (Alive) 
            this.num = num;
    }
    //-----------------------------------**************************************added????????????????????????????????
    public char getWeapon() {
        if(this.weapon=='z'){
        return 'z';
        }
        else if(this.weapon=='x'){
            return 'x';
        }
        else
            return ' ';
    }

    public void setWeapon(char weapon) {
        this.weapon = weapon;
    }

    //----------------------------------------------------------------------@over & other
    public boolean goUp() {
        setY(getY() - 1);
        if (getY() < 0) {
            return false;
        } else {
            this.setDir('u');
            return true;
        }
        
    }//********

    public boolean goDown() {
        setY(getY() + 1);
        if (getY() > 500) {
            return false;
        } else {
            this.setDir('d');
            return true;
        }
        
    }//*********

    public boolean goRight() {
        setX(getX() + 1);
        if (getX() > 500) {
            return false;
        } else {
            this.setDir('r');
            return true;
        }
        
    }//**********

    public boolean goLeft() {
        setX(getX() - 1);
        if (getX() < 0) {
            return false;
        } else {
            this.setDir('l');
            return true;
        }
        
    }//**********

//   public void fire(Weapon Weapon_type) {
//        BM = Weapon_type;
//        if(BM == bomb)
//            gm.fire(bomb);
//        else if(BM == missile)
//            gm.fire(missile);
//            
//   }

    public void kill() {
        if (Alive) {
              setAlive(false);
            System.out.println("The pilot \"" + getName() + "\" killed.");
          
        }
    }

    //    public boolean isIsAlive() {
    //        return this.isAlive;
    //    }
    public boolean isAlive() {
        return Alive;
    }

    public void setAlive(boolean Alive) {
        this.Alive = Alive;
    }
    

    @Override
    public String toString() {
        return "Pilot: " + getName() +" (" + getX() + " , " + getY() + ")" + "Direction: " + getDir() + " isAlive:" + this.Alive;
    }
}


