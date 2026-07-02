package br.ufpb.dcx.joalheria;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SistemaJoalheria implements SistemaJoalheriaInterface {

    private Map<String, Joia> joias;
    private GravadorDeDados gravador;

    public SistemaJoalheria() {

        this.gravador = new GravadorDeDados();

        try {
            this.joias = gravador.recuperarDados();
        } catch (IOException e) {
            this.joias = new HashMap<>();
        }
    }

    @Override
    public void cadastrarJoia(Joia joia) throws Exception {

        if (joia.getPreco() < 0) {
            throw new Exception("Preço inválido");
        }

        joias.put(joia.getNome(), joia);
    }

    @Override
    public Joia pesquisarJoia(String nome) {
        return joias.get(nome);
    }

    @Override
    public boolean removerJoia(String nome) {
        return joias.remove(nome) != null;
    }

    @Override
    public void salvarDados() throws IOException {
        gravador.gravarDados(joias);
    }

    public Map<String, Joia> getJoias() {
        return joias;
    }
}