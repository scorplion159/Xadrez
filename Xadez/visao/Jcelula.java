package visao;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import modelo.Peca;

public class Jcelula extends JPanel {

    private int linha,coluna;
    private Jpeca jpeca;
    

    public Jcelula(int linha,int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }
    public Jcelula(Jpeca jpeca){
        this.jpeca=jpeca;
        this.linha = jpeca.getPeca().getLinha();
        this.coluna = jpeca.getPeca().getColuna();
        this.add(jpeca);
        if(jpeca.getPeca() != null && jpeca.getPeca().isSelecionada()){
            this.setBorder(BorderFactory.createLineBorder(Color.RED,5));
        }
    }
    public int getLInha(){
        return this.linha;
    }
    public int getColuna(){
        return this.coluna;
    }
    
}
