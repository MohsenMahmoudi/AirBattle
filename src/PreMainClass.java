
import com.sun.xml.internal.stream.Entity;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import com.sun.org.apache.xpath.internal.functions.Function;
import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Iran Rayan
 */
public class PreMainClass extends JFrame {

    private GameM game;
    private MapM map;
    int inputLevel;

    //----------------------------
    public PreMainClass() {

        Scanner in = new Scanner(System.in);
        //----------------LEVEL

        System.out.println("Select the difficulty: \n 1: Eazy \n 2: Medium \n 3: Hard");
        inputLevel = in.nextInt();

        if (inputLevel == 1) {
            map = new MapM(6, 6);
        } else if (inputLevel == 2) {
            map = new MapM(9, 9);
        } else if (inputLevel == 3) {
            map = new MapM(12, 12);
        }




        //--------------------PLAYERS
        System.out.println("Enter the number of players");
        int ArrayLength = in.nextInt();

        Aircraft aircraft[] = new Aircraft[ArrayLength];

        for (int i = 0; i < aircraft.length; i++) {
            System.out.println("Enter your name then press enter");
            String name = in.next();
            System.out.println("Now Enter your selection row & col(1 to " + map.getCol());
            int row = in.nextInt();
            int col = in.nextInt();
            row--;
            col--;
            if (row < 0) {
                row = (int) ((float) (Math.random() * 100)) % map.getCol();
            }
            if (col < 0) {
                col = (int) ((float) (Math.random() * 100)) % map.getCol();
            }
            aircraft[i] = new Aircraft(row, col, name, i);

        }


        map.FillMap();
        game = new GameM(aircraft, map);
        game.getAircraft();

        System.out.println(game.toString());

        int b;
        do {
            b = game.turn + 1;
            System.out.println("Turn: " + b);
            char a = in.next().charAt(0);

            if (a == 'x') {
                System.out.println(game.fire('x'));
            } else if (a == 'z') {
                System.out.println(game.fire('z'));
            } else if (a == 'w') {
                game.function('u');
            } else if (a == 's') {
                game.function('d');
            } else if (a == 'd') {
                game.function('r');
            } else if (a == 'a') {
                game.function('l');
            }
            System.out.println(game.toString());
        } while (game.nextTurn() == null);
        System.out.println(game.nextTurn().getName() + "wins.");
        javax.swing.JOptionPane.showMessageDialog(new JFrame("Aircraft"), game.nextTurn().getName() + " wins.");
    }

    private class Handler implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
//            int b;
//                 do{
//                   b=game.turn+1;  
//            System.out.println("Turn: " + b);
//            switch (e.getKeyCode()) {
//                case KeyEvent.VK_UP:
//                    game.function('u');
//                    System.out.println(game.function('u'));
//                    break;
//                case KeyEvent.VK_DOWN:
//                    game.function('d');
//                    System.out.println(game.function('d'));
//                    break;
//                case KeyEvent.VK_RIGHT:
//                    game.function('r');
//                    System.out.println(game.function('r'));
//                    break;
//                case KeyEvent.VK_LEFT:
//                    game.function('l');
//                    System.out.println(game.function('l'));
//                    break;
//                case KeyEvent.VK_X:
//                    game.fire(bomb);
//                    System.out.println(game.fire(bomb));
//                    break;
//                case KeyEvent.VK_Z:
//                    game.fire(missile);
//                    System.out.println(game.fire(missile));
//                    break;
//            }
//            }
//            while(game.nextTurn()== null);
//                                System.out.println(game.nextTurn().getName()+"wins.");
//				javax.swing.JOptionPane.showMessageDialog(new JFrame("Aircraft"), game.nextTurn().getName()+" wins.");
//            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
