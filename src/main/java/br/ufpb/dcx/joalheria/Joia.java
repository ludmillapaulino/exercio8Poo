package br.ufpb.dcx.joalheria;

import java.io.Serializable;
import java.util.Objects;

public class Joia implements Serializable {

    private String nome;
    private String material;
    private double preco;

    public Joia() {
    }

    public Joia(String nome, String material, double preco) {
        this.nome = nome;
        this.material = material;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Joia{" +
                "nome='" + nome + '\'' +
                ", material='" + material + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, material, preco);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Joia joia = (Joia) obj;

        return Objects.equals(nome, joia.nome);
    }
}