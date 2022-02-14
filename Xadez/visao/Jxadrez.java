package visao;

import javax.swing.JFrame;

import modelo.Tabuleiro;

public class Jxadrez extends JFrame {
    public Jxadrez(){
        
        this.add(new Jtabuleiro(new Tabuleiro()));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);

    }
    public static void main(String args[]) {
        new Jxadrez();
        
    }
}
