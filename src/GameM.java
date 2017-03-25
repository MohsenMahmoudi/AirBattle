//private killAircraft

import com.sun.org.apache.xpath.internal.functions.Function;
import java.util.ArrayList;
import javax.swing.JFrame;

public class GameM {

    private MapM gamemap;
    private Weapon bomb;
    private Weapon missile;
    private char weapon;
    private ArrayList<Aircraft> Aircrafts = new ArrayList<Aircraft>();
    public int turn;

    public GameM(Aircraft[] aircrafts, MapM map) {
        for (Aircraft a : aircrafts) {
            Aircrafts.add(a);
        }
        this.gamemap = map;
        turn = 0;

    }

    public ArrayList<Aircraft> getAircraftsList() {
        return Aircrafts;
    }

    public Aircraft getAircraft() throws ArrayIndexOutOfBoundsException {
        System.out.println(turn);
        return Aircrafts.get(turn);
    }

    public String fire(char wpn) {
        weapon = wpn;

        if (wpn == 'x' && Aircrafts.get(turn).getDir() == 'l') {
            int j = Aircrafts.get(turn).getY() - 1;


            if (this.gamemap.GetBlock(Aircrafts.get(turn).getX(), j).getName() == 'A') {
                this.gamemap.edit(Aircrafts.get(turn).getX(), j, new Block.Clear(Aircrafts.get(turn).getX(), j));
                return Aircrafts.get(turn).getName() + " Shooted a bomb to an Anti Aircraft.";
            }




        } else if (wpn == 'x' && Aircrafts.get(turn).getDir() == 'r') {
            int j = Aircrafts.get(turn).getY() + 1;

            if (this.gamemap.GetBlock(Aircrafts.get(turn).getX(), j).getName() == 'A') {
                this.gamemap.edit(Aircrafts.get(turn).getX(), j, new Block.Clear(Aircrafts.get(turn).getX(), j));
                return Aircrafts.get(turn).getName() + " Shooted a bomb to an Anti Aircraft.";
            }



        } else if (wpn == 'x' && Aircrafts.get(turn).getDir() == 'w') {
            int j = Aircrafts.get(turn).getX() - 1;

            if (this.gamemap.GetBlock(j, Aircrafts.get(turn).getY()).getName() == 'A') {
                this.gamemap.edit(j, Aircrafts.get(turn).getY(), new Block.Clear(j, Aircrafts.get(turn).getY()));
                return Aircrafts.get(turn).getName() + " Shooted a bomb to an Anti Aircraft.";
            }


        } else if (wpn == 'x' && Aircrafts.get(turn).getDir() == 'd') {
            int j = Aircrafts.get(turn).getX() + 1;

            if (this.gamemap.GetBlock(j, Aircrafts.get(turn).getY()).getName() == 'A') {
                this.gamemap.edit(j, Aircrafts.get(turn).getY(), new Block.Clear(j, Aircrafts.get(turn).getY()));
                return Aircrafts.get(turn).getName() + " Shooted a bomb to an Anti Aircraft.";
            }



        } //////////////////////////////////////////////////////////////
        else if (wpn == 'z' && Aircrafts.get(turn).getDir() == 'l') {
            for (int i = Aircrafts.get(turn).getY() - 1; i >= 0; i--) {
                for (int j = 0; j < Aircrafts.size(); j++) {
                    if (Aircrafts.get(j).getX() == Aircrafts.get(turn).getX() && Aircrafts.get(j).getY() == i && Aircrafts.get(j).isAlive()) {
                        Aircrafts.get(j).kill();
                        return Aircrafts.get(j).getName() + " Killed by " + Aircrafts.get(turn).getName();
                    }
                }
                if (this.gamemap.GetBlock(Aircrafts.get(turn).getX(), i).getName() == 'M') {
                    return Aircrafts.get(turn).getName() + " Shooted to a Mountain";
                } else if (this.gamemap.GetBlock(Aircrafts.get(turn).getX(), i).getName() == 'S') {
                    this.gamemap.edit(Aircrafts.get(turn).getX(), i, new Block.Clear(Aircrafts.get(turn).getX(), i));
                    return Aircrafts.get(turn).getName() + " Shooted to an Airship";
                } else {
                    continue;
                }
            }
        } else if (wpn == 'z' && Aircrafts.get(turn).getDir() == 'r') {
            for (int i = Aircrafts.get(turn).getY() + 1; i < this.gamemap.getCol(); i++) {
                for (int j = 0; j < Aircrafts.size(); j++) {
                    if (Aircrafts.get(j).getX() == Aircrafts.get(turn).getX() && Aircrafts.get(j).getY() == i && Aircrafts.get(j).isAlive()) {
                        Aircrafts.get(j).kill();
                        return Aircrafts.get(j).getName() + " Killed by " + Aircrafts.get(turn).getName();
                    }
                }

                if (this.gamemap.GetBlock(Aircrafts.get(turn).getX(), i).getName() == 'M') {
                    return Aircrafts.get(turn).getName() + " Shooted to a Mountain";
                } else if (this.gamemap.GetBlock(Aircrafts.get(turn).getX(), i).getName() == 'S') {
                    this.gamemap.edit(Aircrafts.get(turn).getX(), i, new Block.Clear(Aircrafts.get(turn).getX(), i));
                    return Aircrafts.get(turn).getName() + " Shooted to an Airship";
                } else {
                    continue;
                }

            }
        } else if (wpn == 'z' && Aircrafts.get(turn).getDir() == 'd') {

            for (int i = Aircrafts.get(turn).getX() + 1; i < this.gamemap.getRow(); i++) {
                for (int j = 0; j < Aircrafts.size(); j++) {
                    if (Aircrafts.get(j).getY() == Aircrafts.get(turn).getY() && Aircrafts.get(j).getX() == i && Aircrafts.get(j).isAlive()) {
                        Aircrafts.get(j).kill();
                        return Aircrafts.get(j).getName() + " Killed by " + Aircrafts.get(turn).getName();
                    }
                }
                if (this.gamemap.GetBlock(i, Aircrafts.get(turn).getY()).getName() == 'M') {
                    return Aircrafts.get(turn).getName() + " Shooted to a Mountain";
                } else if (this.gamemap.GetBlock(i, Aircrafts.get(turn).getY()).getName() == 'S') {
                    this.gamemap.edit(i, Aircrafts.get(turn).getY(), new Block.Clear(i, Aircrafts.get(turn).getY()));
                    return Aircrafts.get(turn).getName() + " Shooted to an Airship";
                } else {
                    continue;
                }
            }

        } else if (wpn == 'z' && Aircrafts.get(turn).getDir() == 'u') {
            for (int i = Aircrafts.get(turn).getX() - 1; i >= 0; i--) {
                for (int j = 0; j < Aircrafts.size(); j++) {
                    if (Aircrafts.get(j).getY() == Aircrafts.get(turn).getY() && Aircrafts.get(j).getX() == i && Aircrafts.get(j).isAlive()) {
                        Aircrafts.get(j).kill();
                        return Aircrafts.get(j).getName() + " Killed by " + Aircrafts.get(turn).getName();
                    }
                }

                if (this.gamemap.GetBlock(i, Aircrafts.get(turn).getY()).getName() == 'M') {
                    return Aircrafts.get(turn).getName() + " Shooted to a Mountain";
                } else if (this.gamemap.GetBlock(i, Aircrafts.get(turn).getY()).getName() == 'S') {
                    this.gamemap.edit(i, Aircrafts.get(turn).getY(), new Block.Clear(i, Aircrafts.get(turn).getY()));
                    return Aircrafts.get(turn).getName() + " Shooted to an Airship";
                } else {
                    continue;
                }
            }
        }

        return "Nothing Happened!";



    }

    private boolean checkMoveAbility(char dir) {

        int left = Aircrafts.get(turn).getY() - 1;
        int right = Aircrafts.get(turn).getY() + 1;
        int r_g = Aircrafts.get(turn).getX();
        int up = Aircrafts.get(turn).getX() - 1;
        int down = Aircrafts.get(turn).getX() + 1;
        int u_d = Aircrafts.get(turn).getY();
        if (dir == 'l' && left >= 0) {
            Aircrafts.get(turn).setDir('l');
            int j = Aircrafts.get(turn).getY() - 1;
            for (int i = 0; i < Aircrafts.size(); i++) {
                if (Aircrafts.get(i).getX() == Aircrafts.get(turn).getX() && Aircrafts.get(i).getY() == j && Aircrafts.get(i).isAlive()) {
                    Aircrafts.get(turn).kill();
                }
            }
            if (gamemap.GetBlock(r_g, left).getName() == 'S') {
                return false;
            } else if (gamemap.GetBlock(r_g, left).getName() == 'F') {
                Aircrafts.get(turn).setY(left);
                return function('l');
            } else if (gamemap.GetBlock(r_g, left).getName() == 'C') {
                Aircrafts.get(turn).setY(left);
            } else if (gamemap.GetBlock(r_g, left).getName() == 'M') {
                Aircrafts.get(turn).kill();
                gamemap.edit(r_g, left + 1, new Block.Clear(r_g, left + 1));
            } else {
                Aircrafts.get(turn).kill();
                gamemap.edit(r_g, left, new Block.Clear(r_g, left));
            }
        } //---------------------------------------
        else if (dir == 'r' && right < gamemap.getCol()) {
            Aircrafts.get(turn).setDir('r');
            int j = Aircrafts.get(turn).getY() + 1;
            for (int i = 0; i < Aircrafts.size(); i++) {
                if (Aircrafts.get(i).getX() == Aircrafts.get(turn).getX() && Aircrafts.get(i).getY() == j && Aircrafts.get(i).isAlive()) {
                    Aircrafts.get(turn).kill();
                }
            }
            if (gamemap.GetBlock(r_g, right).getName() == 'S') {
                return false;
            } else if (gamemap.GetBlock(r_g, right).getName() == 'F') {
                Aircrafts.get(turn).setY(right);
                return function('r');
            } else if (gamemap.GetBlock(r_g, right).getName() == 'C') {
                Aircrafts.get(turn).setY(right);
            } else if (gamemap.GetBlock(r_g, right).getName() == 'M') {
                Aircrafts.get(turn).kill();
                gamemap.edit(r_g, right - 1, new Block.Clear(r_g, right - 1));
            } else {
                Aircrafts.get(turn).kill();
                gamemap.edit(r_g, right, new Block.Clear(r_g, right));
            }
        } //-----------------------------------------
        else if (dir == 'u' && up >= 0) {
            Aircrafts.get(turn).setDir('u');
            int j = Aircrafts.get(turn).getX() - 1;
            for (int i = 0; i < Aircrafts.size(); i++) {
                if (Aircrafts.get(i).getY() == Aircrafts.get(turn).getY() && Aircrafts.get(i).getX() == j && Aircrafts.get(i).isAlive()) {
                    Aircrafts.get(turn).kill();
                }
            }

            if (gamemap.GetBlock(up, u_d).getName() == 'S') {
                return false;
            } else if (gamemap.GetBlock(up, u_d).getName() == 'F') {
                Aircrafts.get(turn).setX(up);
                return function('u');
            } else if (gamemap.GetBlock(up, u_d).getName() == 'C') {
                Aircrafts.get(turn).setX(up);
            } else if (gamemap.GetBlock(up, u_d).getName() == 'M') {
                Aircrafts.get(turn).kill();
                gamemap.edit(up + 1, u_d, new Block.Clear(up + 1, u_d));
            } else {
                Aircrafts.get(turn).kill();
                gamemap.edit(up, u_d, new Block.Clear(up, u_d));
            }
        } //----------------------------------------
        else if (dir == 'd' && down < gamemap.getCol()) {
            Aircrafts.get(turn).setDir('d');
            int j = Aircrafts.get(turn).getX() + 1;
            for (int i = 0; i < Aircrafts.size(); i++) {
                if (Aircrafts.get(i).getY() == Aircrafts.get(turn).getY() && Aircrafts.get(i).getX() == j && Aircrafts.get(i).isAlive()) {
                    Aircrafts.get(turn).kill();
                }
            }

            if (gamemap.GetBlock(down, u_d).getName() == 'S') {
                return false;
            } else if (gamemap.GetBlock(down, u_d).getName() == 'F') {
                Aircrafts.get(turn).setX(down);
                return function('d');
            } else if (gamemap.GetBlock(down, u_d).getName() == 'C') {
                Aircrafts.get(turn).setX(down);
            } else if (gamemap.GetBlock(down, u_d).getName() == 'M') {
                Aircrafts.get(turn).kill();
                gamemap.edit(down - 1, u_d, new Block.Clear(down - 1, u_d));
                return false;
            } else {
                Aircrafts.get(turn).kill();
                gamemap.edit(down, u_d, new Block.Clear(down, u_d));
                return false;
            }
        }
        return true;


    }

    public boolean function(char func) {
        try {
            if (func == 'l') {
                return checkMoveAbility('l');
            } else if (func == 'r') {
                return checkMoveAbility('r');
            } else if (func == 'u') {
                return checkMoveAbility('u');
            } else if (func == 'd') {
                return checkMoveAbility('d');
            }

            return true;

        } catch (Exception e) {
            System.out.println("Move Faild.Error!");
            e.getMessage();
            return false;
        }
    }

    public Aircraft nextTurn() {


        ArrayList<Aircraft> aliveACs = new ArrayList<>();
        for (Aircraft t : Aircrafts) {
            if (t.isAlive() == true) {
                aliveACs.add(t);
            }
        }
        if (aliveACs.size() < 2) {
            return aliveACs.get(0);
        }


        if (++turn > Aircrafts.size() - 1) {
            turn = 0;
        }

        if (Aircrafts.get(turn).isAlive() == false) {
            nextTurn();
        }


        return null;

    }

    public MapM getMap() {
        return gamemap;
    }

    @Override
    public String toString() {

        char printMap[][] = new char[gamemap.getCol()][gamemap.getCol()];
        for (int i = 0; i < Aircrafts.size(); i++) {
            if (Aircrafts.get(i).isAlive()) {
                printMap[Aircrafts.get(i).getX()][Aircrafts.get(i).getY()] = (char) (Aircrafts.get(i).getNum() + 49);
            }
        }


        for (int i = 0; i < gamemap.getCol(); i++) {
            for (int j = 0; j < gamemap.getCol(); j++) {
                if (printMap[i][j] == '\0') {
                    printMap[i][j] = gamemap.GetBlock(i, j).getName();
                }
            }
        }

        String output = "";
        for (int i = 0; i < gamemap.getCol(); i++) {
            for (int j = 0; j < gamemap.getCol(); j++) {

                output += printMap[i][j] + "\t";
            }
            output += "\n\n";
        }


        return output;
    }
}