package br.ufpb.dcx.joalheria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaJoalheriaTest {

    @Test
    public void testaCadastroPesquisa() {

        SistemaJoalheria sistema = new SistemaJoalheria();

        assertNull(sistema.pesquisarJoia("Anel"));

        boolean cadastrou = sistema.cadastrarJoia("Anel", "Ouro", 1500);

        assertTrue(cadastrou);

        Joia joia = sistema.pesquisarJoia("Anel");

        assertNotNull(joia);
        assertEquals("Anel", joia.getNome());
        assertEquals("Ouro", joia.getMaterial());
        assertEquals(1500, joia.getPreco());
    }

    @Test
    public void testaRemocao() {

        SistemaJoalheria sistema = new SistemaJoalheria();

        sistema.cadastrarJoia("Colar", "Prata", 800);

        assertNotNull(sistema.pesquisarJoia("Colar"));

        boolean removeu = sistema.removerJoia("Colar");

        assertTrue(removeu);

        assertNull(sistema.pesquisarJoia("Colar"));
    }
}