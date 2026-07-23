package br.ufpb.dcx.joalheria.controller;

import br.ufpb.dcx.joalheria.SistemaJoalheria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerPesquisarPorPreco implements ActionListener {

    private SistemaJoalheria sistema;
    private JFrame janelaPrincipal;

    public ControllerPesquisarPorPreco(SistemaJoalheria sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
