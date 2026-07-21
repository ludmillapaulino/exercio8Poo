package br.ufpb.dcx.joalheria;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SistemaJoalheria implements SistemaJoalheriaInterface {

    private Map<String, Joia> joias;
    private GravadorDeDados gravador;

    public SistemaJoalheria() {
        this.joias = new HashMap<>();
        this.gravador = new GravadorDeDados();
    }

    @Override
    public boolean cadastrarJoia(String nome, String material, double preco) {

        if (joias.containsKey(nome) || preco < 0) {
            return false;
        }

        Joia joia = new Joia(nome, material, preco);
        joias.put(nome, joia);

        return true;
    }

    @Override
    public Joia pesquisarJoia(String nome) {
        return joias.get(nome);
    }

    @Override
    public boolean removerJoia(String nome) {

        if (joias.containsKey(nome)) {
            joias.remove(nome);
            return true;
        }

        return false;
    }

    @Override
    public void salvarDados() throws IOException {
        gravador.salvarJoias(joias);
    }

    @Override
    public void recuperarDados() throws IOException {
        joias = gravador.recuperarJoias();
    }
}