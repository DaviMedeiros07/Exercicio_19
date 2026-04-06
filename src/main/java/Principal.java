import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){

        int n;
        String frase;

        frase = JOptionPane.showInputDialog("Digite uma frase:");
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
            
        int i = 0;
        while(i < n){
            JOptionPane.showMessageDialog(null, frase);
            i++;
        }
    }
}