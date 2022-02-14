import modelo.Consessionaria;
import modelo.Praca;

public class App{
    public static void main(String[] args) {
        Consessionaria a =new Consessionaria("Consessionária A");
        Consessionaria b =new Consessionaria("Consessionaria B");
        Consessionaria c =new Consessionaria("Consessionaria C");


        Praca praca1 = new Praca();
        praca1.setCidade("São paulo");

        Praca praca2 = new Praca();
        praca2.setCidade("São José dos campos.");

        a.addPraca(praca1);
        a.addPraca(praca2);

        
    }
}