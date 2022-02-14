package modelo;

public class Guarita {
    private int numero;
    public Guarita(int numero, int contagem_veiculos, Double valorRecebido, Praca praca) {
        this.numero = numero;
        this.contagem_veiculos = contagem_veiculos;
        this.valorRecebido = valorRecebido;
        this.praca = praca;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getContagem_veiculos() {
        return contagem_veiculos;
    }
    public void setContagem_veiculos(int contagem_veiculos) {
        this.contagem_veiculos = contagem_veiculos;
    }
    public Double getValorRecebido() {
        return valorRecebido;
    }
    public void setValorRecebido(Double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }
    public Praca getPraca() {
        return praca;
    }
    public void setPraca(Praca praca) {
        this.praca = praca;
    }
    private int contagem_veiculos;
    private Double valorRecebido;
    private Praca praca;
}
