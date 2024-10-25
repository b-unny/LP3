
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Controles1 extends JFrame{
    JLabel      lblCodigo, lblNome;
    JTextField  txtCodigo, txtNome; 
    JButton     btnSalvar, btnCancelar;   
    ExemploUI()
    {
        lblCodigo = new JLabel("Código");
        txtCodigo = new JTextField();
        lblNome = new JLabel("Nome");
        txtNome = new JTextField();
        btnSalvar = new JButton("Salvar");
        btnCancelar = new JButton("Cancelar");        

        setLayout(new GridLayout(3, 2));         
        add(lblCodigo);    add(txtCodigo);
        add(lblNome);      add(txtNome);
        add(btnSalvar);    add(btnCancelar);        
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
