package br.ufpb.dcx.joalheria;

public class SistemaJoalheria {
    public static void main(String[] args) {

        SistemaJoalheria sistema = new SistemaJoalheria();

        Joia j1 = new Joia("Anel", "Ouro", 1500);
        Joia j2 = new Joia("Colar", "Prata", 800);
        Joia j3 = new Joia("Pulseira", "Diamante", -500);

        try {

            sistema.cadastrarJoia(j1);
            sistema.cadastrarJoia(j2);
            sistema.cadastrarJoia(j3);

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }

        for (Joia joia : sistema.getJoias().values()) {
            System.out.println(joia);
        }
    }
}