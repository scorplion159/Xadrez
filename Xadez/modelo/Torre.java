package modelo;

public class Torre extends Peca {
    public Torre(EnumCor cor, int linha, int coluna){
        super(cor, linha, coluna, ".pecas_xadrez\torre branca.png");
    }

    public Torre(EnumCor cor, int linha, int coluna, String imagem) {
        super(cor, linha, coluna, imagem);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean validaMovimento(int linhaDeDestino, int colunaDestino) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
