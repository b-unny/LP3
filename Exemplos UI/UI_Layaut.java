
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UI_Layout extends JFrame{
    JLabel lblHello;
    
    ExemploUI()
    {
        lblHello = new JLabel();
        lblHello.setText("Olá, beleza?");
                        
        //setLayout(new FlowLayout());
        //add(lblHello);

        setLayout(new GridLayout(3, 2));         
        add(lblHello);
        add(new JLabel("Label 2"));
        add(new JLabel("Label 3"));
        add(new JLabel("Label 4"));
        add(new JLabel("Label 5"));        
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
