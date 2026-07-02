package br.ufpb.dcx.joalheria;

public interface SistemaJoalheriaInterface {

    void cadastrarJoia(Joia joia) throws Exception;
    Joia pesquisarJoia(String nome);
    boolean removerJoia(String nome);
    void salvarDados() throws java.io.IOException;
}