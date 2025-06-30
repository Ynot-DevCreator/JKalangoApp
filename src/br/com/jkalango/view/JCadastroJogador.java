package br.com.jkalango.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

// extends é herança
public class JCadastroJogador extends JFrame {
    //Construtor inicializa os componentes do formulário
    public JCadastroJogador() {
        // Titulo da janela
        setTitle("Faça parte do JKalango ");
        // Garante que a aplicação não seja finalizada
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // tamanho da janela
        setSize(400, 400);
        // posição ao centro
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        JLabel lblNome = new JLabel("Nome");
        JTextField txtNome = new JTextField(30);
        add(lblNome);
        add(txtNome);
        JLabel lblNickname = new JLabel("Nickname");
        JTextField txtNickname = new JTextField(30);
        add(lblNickname);
        add(txtNickname);
        JLabel lblEmail = new JLabel("Email");
        JTextField txtEmail = new JTextField(30);
        add(lblEmail);
        add(txtEmail);
        JLabel lblTelefone = new JLabel("Telefone");
        JTextField txtTelefone = new JTextField(30);
        add(lblTelefone);
        add(txtTelefone);
        JLabel lblSenha = new JLabel("Senha");
        JTextField txtSenha = new JTextField(30);
        add(lblSenha);
        add(txtSenha);
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                dispose();
                JOptionPane.showMessageDialog(null, "Jogador Cadastrado com Sucesso!");
            }
            
        });
        setVisible(true);
        add(btnCadastrar);
    }
}
