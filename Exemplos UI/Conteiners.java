import javax.swing.*;
import java.awt.*;

public class SmartHomeUI extends JFrame {
    public SmartHomeUI() {
        setTitle("Controle de Cômodos");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 3)); // Layout com três colunas para "Sala", "Q1" e "Q2"
        
        // Painel da Sala
        JPanel salaPanel = new JPanel(new GridLayout(3, 2));
        salaPanel.setBorder(BorderFactory.createTitledBorder("Sala"));
        salaPanel.add(new JLabel("Lâmpada:"));
        salaPanel.add(new JLabel("Ligada"));
        salaPanel.add(new JButton("Ligar"));
        salaPanel.add(new JButton("Desligar"));
        
        // Painel do Quarto 1 (Q1)
        JPanel q1Panel = new JPanel(new GridLayout(3, 2));
        q1Panel.setBorder(BorderFactory.createTitledBorder("Q1"));
        q1Panel.add(new JLabel("Lâmpada 2:"));
        q1Panel.add(new JLabel("Desligada"));
        q1Panel.add(new JButton("Ligar"));
        q1Panel.add(new JButton("Desligar"));
        
        // Painel do Quarto 2 (Q2)
        JPanel q2Panel = new JPanel(new GridLayout(3, 2));
        q2Panel.setBorder(BorderFactory.createTitledBorder("Q2"));
        q2Panel.add(new JLabel("Lâmpada 3:"));
        q2Panel.add(new JLabel("Desligada"));
        q2Panel.add(new JButton("Ligar"));
        q2Panel.add(new JButton("Desligar"));
        
        // Adicionando os painéis principais à janela
        add(salaPanel);
        add(q1Panel);
        add(q2Panel);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SmartHomeUI frame = new SmartHomeUI();
            frame.setVisible(true);
        });
    }
}

// made by chatGPT

