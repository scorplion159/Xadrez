package modelo;

public class Tabuleiro {
    private Peca[][] pecas;//Array bidimiensional para guardar as informações do tabuleiro
    private Peca pecaSelecionada = null;
    private EnumCor vez = EnumCor.BRANCO;//jogo começa a vez com as brancas

    public static final int TEMPO_JOGADA = 10000;
    public Tabuleiro(int linhas, int colunas){// constroi o tabuleiro
        this.pecas = new Peca[linhas][colunas];
    }
    public Peca getPeca(int linha, int coluna){// retorna qual peça está em determinada posição da matriz
        return this.pecas[linha][coluna];
    }
    public void adicionaPeca(Peca peca){
        this.pecas[peca.getLinha()][peca.getColuna()] = peca;
        peca.setTabuleiro(this);
    }
    public void selecionaPeca(Peca peca){
        if(peca.isSelecionada()){//Caso o método seja executado e uma peça ja esteja selecionada
            peca.setSelecionada(false);
            this.pecaSelecionada=null;
        }
        else{// caso o método seja selecionado e nenhuma peça esteja selecionada
            peca.setSelecionada(true);
            this.pecaSelecionada=peca;
        }
    }
    public void movePeca(Peca peca, int linhaDestino, int colunaDestino){

    }
    public void inverteVez(){
        if(this.vez.equals((EnumCor.BRANCO))){
            this.vez = EnumCor.PRETO;
        }else{
            this.vez = EnumCor.BRANCO;
        }
    }
    
}
