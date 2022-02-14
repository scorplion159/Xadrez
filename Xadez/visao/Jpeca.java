package visao;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import modelo.Peca;

public class Jpeca extends JLabel {

    private Peca peca;
    public  Jpeca(Peca peca){
        this.setText("Peca");
        this.peca = peca;
        this.setIcon(new ImageIcon(peca.getImagem()));
        
        
    }
    public Peca getPeca(){
        return this.peca;
    }
    
}
