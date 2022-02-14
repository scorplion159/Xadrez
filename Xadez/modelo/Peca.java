package modelo;

public abstract class Peca {

    private EnumCor cor;
    public EnumCor getCor() {
        return cor;
    }
    public void setCor(EnumCor cor) {
        this.cor = cor;
    }
    public int getLinha() {
        return linha;
    }
    public void setLinha(int linha) {
        this.linha = linha;
    }
    public int getColuna() {
        return coluna;
    }
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
    public String getImagem() {
        return this.imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    public boolean isEliminada() {
        return eliminada;
    }
    public void setEliminada(boolean eliminada) {
        this.eliminada = eliminada;
    }
    public boolean isSelecionada() {
        return selecionada;
    }
    public void setSelecionada(boolean selecionada) {
        this.selecionada = selecionada;
    }
    private int linha,coluna;
    public Peca(EnumCor cor, int linha, int coluna, String imagem) {
        this.cor = cor;
        this.linha = linha;
        this.coluna = coluna;
        this.imagem = imagem;
    }
    private String imagem;
    private boolean eliminada = false;
    private boolean selecionada = false;
    private Tabuleiro tabuleiro;
    

    public abstract boolean validaMovimento(int linhaDeDestino, int colunaDestino);

    public void setTabuleiro(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;
    }
    public Tabuleiro getTabuleiro(){
        return this.tabuleiro;
    }
    
    
    

}