/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista04;
import javax.swing.JOptionPane;
/**
 *
 * @authoimport Luan Amor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CartaoWeb c[] = new CartaoWeb[3];
        
        c[0] = new Natal("Nathalia");
        c[1] = new Aniversario("Julia");
        c[2] = new DiaDosNamorados("Andressa");
        
        String nome[] = new String[3];

        for(int i = 0; i < c.length; i++){
            nome[i] = JOptionPane.showInputDialog("Qual o seu nome?", "Digite aqui");
            JOptionPane.showMessageDialog(null,c[i].retornaMensagem(nome[i]));
        }
    }
    
}
