package visao;

import javax.swing.JLabel;

import modelo.Peca;

public class Jpeca extends JLabel {

    private Peca peca;
    public Jpeca(Peca peca){
        this.peca = peca;
    }
    public Peca getPeca(){
        return this.peca;
    }
    
}
