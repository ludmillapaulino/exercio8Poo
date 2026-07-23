package br.ufpb.dcx.joalheria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaJoalheria implements SistemaJoalheriaInterface {

    private Map<String, Joia> joias;
    private final GravadorDeDados gravador;

    public SistemaJoalheria() {
        this.joias = new HashMap<>();
        this.gravador = new GravadorDeDados();
    }

    @Override
    public boolean cadastrarJoia(String nome, MATERIAL material, double preco) {

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

    public List<Joia> pesquisarJoiasComPrecoMaiorQue(double valor) {
        return this.joias.values().stream().filter(joia -> joia.getPreco() > valor).toList();
    }

    public List<Joia> pesquisarJoiasPeloMaterial(MATERIAL material) {
        return this.joias.values().stream().filter(joia -> joia.getMaterial() == material).toList();
    }

    public Joia pesquisarJoiaMaisCara() {
        Joia joiaMaisCara = this.joias.values().iterator().next();
        double maiorPreco = this.joias.values().iterator().next().getPreco();

        for(Joia j : this.joias.values()) {
            if(j.getPreco() >= maiorPreco) {
                maiorPreco = j.getPreco();
            }
        }
        return joiaMaisCara;
    }

    public Joia pesquisarJoiaMaisBarata() {
        Joia joiaMaisBarata = this.joias.values().iterator().next();
        double menorPreco = this.joias.values().iterator().next().getPreco();

        for(Joia j : this.joias.values()) {
            if(j.getPreco() <= menorPreco) {
                menorPreco = j.getPreco();
            }
        }
        return joiaMaisBarata;
    }

    public int contarJoiasDoTipo(MATERIAL material) {
        int contador = 0;
        for(Joia j : this.joias.values()) {
            if(j.getMaterial().equals(material)) {
                contador++;
            }
        }
        return contador;
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