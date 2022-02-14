package modelo;

import java.util.HashSet;
import java.util.Set;

public class Consessionaria {
    private String nome;
    
    public Consessionaria(String nome, Set<Praca> pracas, Double faturamento, Consessionaria conssessionaria) {
        this.nome = nome;
        this.pracas = new HashSet<>();
        this.faturamento = 0.0;
        //this.conssessionaria = conssessionaria;
    }
    public Consessionaria(String string) {
    }
    private Set<Praca> pracas;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Praca> getPracas() {
        return pracas;
    }
   // public void setPracas(Set<Praca> pracas) {
   //     this.pracas = pracas;
    //}
    public Double getFaturamento() {
        return faturamento;
    }
    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }
    public Consessionaria getConssessionaria() {
        return conssessionaria;
    }
    public void setConssessionaria(Consessionaria conssessionaria) {
        this.conssessionaria = conssessionaria;
    }
    private Double faturamento;
    private Consessionaria conssessionaria;
    public void addPraca(Praca praca){
        this.pracas.add(praca);
        for (Praca x : pracas) {
            
                this.faturamento= this.faturamento+x.getFaturamentoPraca();
            }
            
        
    }
    
}
