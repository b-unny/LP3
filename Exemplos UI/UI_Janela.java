package Exemplo02_Janela;

import javax.swing.JFrame;

public class UI_Janela extends JFrame{
    
    public static void main(String[] args)
    {
        JFrame f = new ExemploUI();
        f.setTitle("Primeira Janela");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        f.setBounds(300, 300, 400, 200);        
        f.setVisible(true);                
    }
}
