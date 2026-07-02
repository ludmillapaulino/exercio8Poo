package br.ufpb.dcx.joalheria;

import java.util.ArrayList;
import java.util.List;

public class SistemaJoalheria {

    private List<Joia> joias;

    public SistemaJoalheria() {
        this.joias = new ArrayList<>();
    }

    public void cadastrarJoia(Joia joia) throws Exception {

        if (joia.getPreco() < 0) {
            throw new Exception("Preço inválido");
        }

        joias.add(joia);
    }

    public List<Joia> getJoias() {
        return joias;
    }
}