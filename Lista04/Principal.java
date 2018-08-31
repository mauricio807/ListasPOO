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
            nome[0] = JOptionPane.showInputDialog("Qual o seu nome?", "Digite aqui");
            JOptionPane.showMessageDialog(null,c[0].retornaMensagem(nome[0]));
            nome[1] = JOptionPane.showInputDialog("Qual o seu nome?", "Digite aqui");
            JOptionPane.showMessageDialog(null,c[1].retornaMensagem(nome[1]));
            nome[2] = JOptionPane.showInputDialog("Qual o seu nome?", "Digite aqui");
            JOptionPane.showMessageDialog(null,c[2].retornaMensagem(nome[2]));
        }
    }
    
}
