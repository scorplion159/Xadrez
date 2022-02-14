package modelo;

public class Tarifa {
    private EnumCategoria categoria;
    private Double valor;
    public Tarifa(EnumCategoria categoria, Double valor) {
        this.categoria = categoria;
        this.valor = valor;
    }
    public EnumCategoria getCategoria() {
        return categoria;
    }
    public void setCategoria(EnumCategoria categoria) {
        this.categoria = categoria;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
