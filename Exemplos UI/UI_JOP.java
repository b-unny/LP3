
import javax.swing.JOptionPane;

public class UI_JOP {
    
public static void main(String[] args)
{
String strn1 = JOptionPane.showInputDialog("Primeiro inteiro"); 
String strn2 = JOptionPane.showInputDialog("Segundo inteiro"); 

int n1 = Integer.parseInt(strn1);
int n2 = Integer.parseInt(strn2);

int s = n1 + n2;

// exibe o resultado em um diálogo de mensagem JOptionPaneÿ
JOptionPane.showMessageDialog(null, "A soma é " + s, 
"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE); 
}
}
