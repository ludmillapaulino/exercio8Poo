package br.ufpb.dcx.joalheria;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

public class GravadorDeDados {

    private String arquivo = "joias.dat";

    public void gravarDados(Map<String, Joia> joias) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
        out.writeObject(joias);
        out.close();
    }

    @SuppressWarnings("unchecked")
    public Map<String, Joia> recuperarDados() throws IOException {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
            Map<String, Joia> joias = (Map<String, Joia>) in.readObject();
            in.close();
            return joias;
        } catch (ClassNotFoundException e) {
            throw new IOException(e);
        }
    }
}