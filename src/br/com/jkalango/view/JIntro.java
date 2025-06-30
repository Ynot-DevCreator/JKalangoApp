package br.com.jkalango.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JIntro extends JFrame {
    public JIntro(){
        setTitle("JKalango Splash Screen");
        setSize(900, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String textoIntro = "<html><body style='color:white; font-family:Segoe UI, sans-serif; width:600px; margin-bottom:20px; font-size:16px;'>"
                + "Em um mundo esquecido pelo tempo, onde as sombras dominam o cerrado encantado, "
                + "Jkalango — um calango ancestral marcado por cicatrizes mágicas — vaga solitário em busca de preservar os últimos resquícios de sua espécie. "
                + "Seus únicos aliados são as enigmáticas JFormigas e as silenciosas JAbelhinhas, criaturas tão frágeis quanto valentes. "
                + "Mas o que os espera não são simples desafios: são provações sombrias, maldições antigas e horrores enterrados na poeira do tempo. "
                + "Para salvar o que resta de sua terra, Jkalango terá que encarar missões onde a luz quase nunca chega... e onde nem todos voltarão."
                + "</body></html>";


        JLabel janela = new JLabel(textoIntro);
        janela.setOpaque(false);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.add(janela);

        JButton startButton = new JButton("Iniciar Missão");
        panel.add(startButton);
        
        startButton.addActionListener(new ActionListener() {
        @Override
        
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(JIntro.this, "Primeira Missão Iniciada");
            dispose();
            new JCadastroJogador();
        }
        });
        setContentPane(panel);
        setVisible(true);
    }
   public static void main(String[] args) {
    new JIntro();
   }
}

