package modelo;

public class Rei extends Peca {

    public Rei(EnumCor cor, int linha, int coluna, String imagem) {
        super(cor, linha, coluna, imagem);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean validaMovimento(int linhaDeDestino, int colunaDestino) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
