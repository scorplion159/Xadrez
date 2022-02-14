package modelo;

import java.util.Set;
import modelo.*;

public class Praca {
    private String cidade;
    public Praca(){}
    public Praca(String cidade, Double faturamentoPraca, Set<Guarita> guarita, Set<Tarifa> tarifas,
            Consessionaria consessionaria) {
        this.cidade = cidade;
        this.faturamentoPraca = faturamentoPraca;
        this.guarita = guarita;
        this.tarifas = tarifas;
        this.consessionaria = consessionaria;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public Double getFaturamentoPraca() {
        return faturamentoPraca;
    }
    public void setFaturamentoPraca(Double faturamentoPraca) {
        this.faturamentoPraca = faturamentoPraca;
    }
    public Set<Guarita> getGuarita() {
        return guarita;
    }
    public void setGuarita(Set<Guarita> guarita) {
        this.guarita = guarita;
    }
    public Set<Tarifa> getTarifas() {
        return tarifas;
    }
    public void setTarifas(Set<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }
    public Consessionaria getConsessionaria() {
        return consessionaria;
    }
    public void setConsessionaria(Consessionaria consessionaria) {
        this.consessionaria = consessionaria;
    }
    private Double faturamentoPraca;
    private Set<Guarita> guarita;
    private Set<Tarifa> tarifas;
    private Consessionaria consessionaria;
}
