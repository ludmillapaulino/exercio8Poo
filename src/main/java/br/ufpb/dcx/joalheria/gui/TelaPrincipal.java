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


    private ImageIcon cadastrarImg = new ImageIcon(
            new ImageIcon("./icons/cadastrar.png")
                    .getImage()
                    .getScaledInstance(24, 24, Image.SCALE_SMOOTH));

    private ImageIcon pesquisarImg = new ImageIcon(
            new ImageIcon("./icons/pesquisar.png")
                    .getImage()
                    .getScaledInstance(24, 24, Image.SCALE_SMOOTH));

    private ImageIcon removerImg = new ImageIcon(
            new ImageIcon("./icons/remover.png")
                    .getImage()
                    .getScaledInstance(24, 24, Image.SCALE_SMOOTH));

    private ImageIcon salvarImg = new ImageIcon(
            new ImageIcon("./icons/salvar.png")
                    .getImage()
                    .getScaledInstance(24, 24, Image.SCALE_SMOOTH));


    private JButton botaoCadastrar;
    private JButton botaoPesquisar;
    private JButton botaoRemover;
    private JButton botaoSalvar;


    private JMenuBar barraDeMenu = new JMenuBar();

    public TelaPrincipal() {

        setTitle("Sistema de Joalheria");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(255,253,230));

        titulo = new JLabel("Sistema de Joalheria", JLabel.CENTER);
        titulo.setFont(new Font("Serif", Font.BOLD, 28));
        titulo.setForeground(new Color(160,120,20));

        ImageIcon joias = new ImageIcon("./imgs/joias.png");
        Image img = joias.getImage().getScaledInstance(500,300,Image.SCALE_SMOOTH);
        imagem = new JLabel(new ImageIcon(img), JLabel.CENTER);

        botaoCadastrar = new JButton("Cadastrar", cadastrarImg);
        botaoPesquisar = new JButton("Pesquisar", pesquisarImg);
        botaoRemover = new JButton("Remover", removerImg);
        botaoSalvar = new JButton("Salvar", salvarImg);

        botaoCadastrar.addActionListener(new ControllerCadastrar(sistema,this));
        botaoPesquisar.addActionListener(new ControllerPesquisar(sistema,this));
        botaoRemover.addActionListener(new ControllerRemover(sistema,this));
        botaoSalvar.addActionListener(new ControllerSalvar(sistema,this));

        JPanel painelBotoes = new JPanel(new GridLayout(2,2,15,15));
        painelBotoes.setBackground(new Color(255,253,230));
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(20,80,20,80));

        painelBotoes.add(botaoCadastrar);
        painelBotoes.add(botaoPesquisar);
        painelBotoes.add(botaoRemover);
        painelBotoes.add(botaoSalvar);

        JPanel painelCentro = new JPanel(new BorderLayout());
        painelCentro.setBackground(new Color(255,253,230));

        painelCentro.add(titulo, BorderLayout.NORTH);
        painelCentro.add(imagem, BorderLayout.CENTER);
        painelCentro.add(painelBotoes, BorderLayout.SOUTH);

        add(painelCentro);

        // MENU
        JMenu menuCadastrar = new JMenu("Cadastrar");
        JMenuItem itemCadastrar = new JMenuItem("Cadastrar Joia");

        JMenu menuPesquisar = new JMenu("Pesquisar");
        JMenuItem itemPesquisar = new JMenuItem("Pesquisar Joia");

        JMenu menuRemover = new JMenu("Remover");
        JMenuItem itemRemover = new JMenuItem("Remover Joia");

        JMenu menuSalvar = new JMenu("Salvar");
        JMenuItem itemSalvar = new JMenuItem("Salvar Dados");

        itemCadastrar.addActionListener(new ControllerCadastrar(sistema,this));
        itemPesquisar.addActionListener(new ControllerPesquisar(sistema,this));
        itemRemover.addActionListener(new ControllerRemover(sistema,this));
        itemSalvar.addActionListener(new ControllerSalvar(sistema,this));

        menuCadastrar.add(itemCadastrar);
        menuPesquisar.add(itemPesquisar);
        menuRemover.add(itemRemover);
        menuSalvar.add(itemSalvar);

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