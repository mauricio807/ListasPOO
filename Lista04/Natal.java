/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista04;

/**
 *
 * @author aluno
 */
public class Natal extends CartaoWeb{
    
    public Natal(String dest){
        this.destinatario = dest; 
    }
    public void retornaMensagem(String Remete){
        System.out.println("Querido(a) "+Remete+
                "\n Feliz Natal"
                + "\n Atenciosamente"+this.destinatario);
    }
}
