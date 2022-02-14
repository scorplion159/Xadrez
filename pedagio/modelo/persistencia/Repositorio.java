package modelo.persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Repositorio {
    public void grava(List consessionaria) throws IOException
    {
    FileOutputStream saidaArquivo = new FileOutputStream("pedagio.dat");
    ObjectOutputStream objetoSaida = new ObjectOutputStream(saidaArquivo);
    objetoSaida.writeObject(consessionaria);
}
    public List ler() throws ClassNotFoundException, IOException{
        FileInputStream entrada = new FileInputStream("pedagio.dat");
        ObjectInputStream objEntrada = new ObjectInputStream(entrada);
       Object consessionaria = objEntrada.readObject();
       return (List) consessionaria;
    }
}
