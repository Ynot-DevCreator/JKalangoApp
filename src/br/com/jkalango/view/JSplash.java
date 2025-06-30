package br.com.jkalango.view;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSplash extends JFrame{

    //1º O formulário (JFrame)
    
    //2º Mostrar o formulário
    
    //3º Adicionar o JButton com o título Start

    //4º Adicionar evento ao botão que ao clicar mostre "JKalango"

    //5º Colocar a imagem do Kalango (sem animação)
    public JSplash(){
        setTitle("JKalango Splash Screen");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JButton startButton = new JButton("Start Game");
        add(startButton);
        
        startButton.addActionListener(new ActionListener() {
        @Override
        
        public void actionPerformed(ActionEvent e) {
            dispose();
            JOptionPane.showMessageDialog(JSplash.this, "JKalango");
            dispose();
            new JIntro();
        }

        });
        setVisible(true);
    }
}
