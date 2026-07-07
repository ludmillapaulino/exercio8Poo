package br.ufpb.dcx.joalheria.gui;

import br.ufpb.dcx.joalheria.SistemaJoalheria;
import br.ufpb.dcx.joalheria.controller.ControllerCadastrar;
import br.ufpb.dcx.joalheria.controller.ControllerPesquisar;
import br.ufpb.dcx.joalheria.controller.ControllerRemover;
import br.ufpb.dcx.joalheria.controller.ControllerSalvar;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    private JLabel titulo;
    private JLabel imagem;

    private SistemaJoalheria sistema = new SistemaJoalheria();

    private JMenuBar barraDeMenu = new JMenuBar();

    public TelaPrincipal() {

        setTitle("Sistema de Joalheria");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        getContentPane().setBackground(new Color(255, 253, 230));

        titulo = new JLabel("Sistema de Joalheria", JLabel.CENTER);
        titulo.setFont(new Font("Serif", Font.BOLD, 26));
        titulo.setForeground(new Color(160, 120, 20));

        ImageIcon joias = new ImageIcon("./imgs/joias.png");
        Image img = joias.getImage().getScaledInstance(500, 320, Image.SCALE_SMOOTH);
        imagem = new JLabel(new ImageIcon(img), JLabel.CENTER);

        setLayout(new GridLayout(3, 1));

        add(titulo);
        add(imagem);
        add(new JLabel());

        JMenu menuCadastrar = new JMenu("Cadastrar");
        JMenuItem itemCadastrar = new JMenuItem("Cadastrar Joia");

        JMenu menuPesquisar = new JMenu("Pesquisar");
        JMenuItem itemPesquisar = new JMenuItem("Pesquisar Joia");

        JMenu menuRemover = new JMenu("Remover");
        JMenuItem itemRemover = new JMenuItem("Remover Joia");

        JMenu menuSalvar = new JMenu("Salvar");
        JMenuItem itemSalvar = new JMenuItem("Salvar Dados");

        menuCadastrar.add(itemCadastrar);
        menuPesquisar.add(itemPesquisar);
        menuRemover.add(itemRemover);
        menuSalvar.add(itemSalvar);

        itemCadastrar.addActionListener(new ControllerCadastrar(sistema, this));
        itemPesquisar.addActionListener(new ControllerPesquisar(sistema, this));
        itemRemover.addActionListener(new ControllerRemover(sistema, this));
        itemSalvar.addActionListener(new ControllerSalvar(sistema, this));

        barraDeMenu.add(menuCadastrar);
        barraDeMenu.add(menuPesquisar);
        barraDeMenu.add(menuRemover);
        barraDeMenu.add(menuSalvar);

        setJMenuBar(barraDeMenu);
    }

    public static void main(String[] args) {
        JFrame janela = new TelaPrincipal();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}