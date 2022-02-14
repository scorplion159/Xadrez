package modelo;

public class Tabuleiro {
    private Peca[][] pecas;//Array bidimiensional para guardar as informações do tabuleiro
    private Peca pecaSelecionada = null;
    private EnumCor vez = EnumCor.BRANCO;//jogo começa a vez com as brancas

    public static final int TEMPO_JOGADA = 10000;
    public Tabuleiro(){// constroi o tabuleiro
        this.pecas = new Peca[8][8];
        Torre torreBranca1 = new Torre(EnumCor.BRANCO, 0, 0,"modelo/torre_branca.png");
        Torre torrePreta1 = new Torre(EnumCor.PRETO, 0, 7);
        this.adicionaPeca(torreBranca1);
        //this.adicionaPeca(torrePreta1);


        Torre torreBranca2 = new Torre(EnumCor.BRANCO, 7, 0);
        Torre torrePreta2 = new Torre(EnumCor.PRETO, 7, 7);
        //this.adicionaPeca(torreBranca2);
        ///this.adicionaPeca(torrePreta2);
    
    }
    public Peca getPeca(int linha, int coluna){// retorna qual peça está em determinada posição da matriz
        return this.pecas[linha][coluna];
    }
    public void setPeca(Peca peca){
        this.pecas[peca.getLinha()][peca.getColuna()]=peca;
        peca.setTabuleiro(this);
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
        if(peca.validaMovimento(linhaDestino, colunaDestino)){
            this.pecas[peca.getLinha()][peca.getColuna()]= null;
            peca.setLinha(linhaDestino);
            peca.setColuna(colunaDestino);
            this.setPeca(peca);
            this.selecionaPeca(peca);
            this.inverteVez();
        }

    }
    public void inverteVez(){
        if(this.vez.equals((EnumCor.BRANCO))){
            this.vez = EnumCor.PRETO;
        }else{
            this.vez = EnumCor.BRANCO;
        }
    }
    public void realizaJogada(int lInha, int coluna) {

        Peca peca = this.getPeca(lInha, coluna);
        if(this.pecaSelecionada==null){
            if(peca != null && peca.getCor().equals(this.vez)){
                this.selecionaPeca(peca);
            }else{
              if(this.pecaSelecionada==peca){
                  this.selecionaPeca(peca);
              }else{
                  if(peca==null || peca.getCor().equals((this.pecaSelecionada.getCor())))
                  {this.movePeca(this.pecaSelecionada, lInha, coluna);}
              }
            }
        }
    }
    
}
