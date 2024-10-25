import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UI_Controles extends JFrame{

    JLabel lblHello;
    
    ExemploUI()
    {
        lblHello = new JLabel();
        lblHello.setText("Olá, beleza?");
        add(lblHello);    
    }
    
    public static void main(String[] args)
    {
        JFrame f = new ExemploUI();
        f.setTitle("Primeira Janela");            
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        f.setBounds(300, 300, 400, 200);       
        f.setVisible(true);                 
    }
}

