package visao;

import javax.swing.JPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.Peca;
import modelo.Tabuleiro;

import java.awt.Color;
import java.awt.GridLayout;

public class Jtabuleiro extends JPanel implements MouseListener {

    private Tabuleiro tabuleiro;

    public Jtabuleiro(Tabuleiro tabuleiro){
        this.tabuleiro=tabuleiro;
        this.desenhaTabuleiro();
    }
    public void desenhaTabuleiro(){
        this.removeAll();
        this.setLayout(new GridLayout(8,8));
        for(int i=0; i<8; i++){
            for(int j=0;j<8;j++){
                Jcelula jcelula;
                Peca peca = this.tabuleiro.getPeca(i, j);
                if(peca == null){
                    jcelula= new Jcelula(i, j);
                }else{
                    jcelula = new Jcelula(new Jpeca(peca));
                }
                if((i+j)%2==0){
                    jcelula.setBackground(Color.WHITE);
                }
                this.add(jcelula);
                jcelula.addMouseListener(this);


            }
        }
        this.revalidate();
    }
    private Jpeca newJpeca(Peca peca) {
        return null;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
       Jcelula jcelula = (Jcelula) e.getSource();
       this.tabuleiro.realizaJogada(jcelula.getLInha(),jcelula.getColuna());
       this.desenhaTabuleiro();; 
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    
    
}
