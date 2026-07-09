package br.ufpb.dcx.joalheria;

import java.io.IOException;

public interface SistemaJoalheriaInterface {

    /**
     * Cadastra uma nova joia no sistema.
     *
     * @param nome Nome da joia.
     * @param material Material da joia.
     * @param preco Preço da joia.
     * @return true se a joia foi cadastrada com sucesso; false caso seja o contrário.
     */
    boolean cadastrarJoia(String nome, String material, double preco);

    /**
     * Pesquisa uma joia pelo nome.
     *
     * @param nome Nome da joia.
     * @return A joia encontrada ou null se não existir.
     */
    Joia pesquisarJoia(String nome);

    /**
     * Remove uma joia do sistema.
     *
     * @param nome Nome da joia.
     * @return true se a joia foi removida; false caso contrário.
     */
    boolean removerJoia(String nome);

    /**
     * Salva os dados das joias em arquivo.
     *
     * @throws IOException Caso ocorra erro durante a gravação.
     */
    void salvarDados() throws IOException;

    /**
     * Recupera os dados das joias salvos em arquivo.
     *
     * @throws IOException Caso ocorra erro durante a leitura.
     */
    void recuperarDados() throws IOException;
}