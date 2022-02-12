package visao;

import javax.swing.JPanel;

public class Jcelula extends JPanel {

    private int linha,coluna;
    private Jpeca jpeca;

    public Jcelula(int linha,int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }
    public Jcelula(Jpeca jpeca){
        this.jpeca=jpeca;
    }

    
}
