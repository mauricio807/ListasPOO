/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista04;

/**
 *
 * @author aluno
 */
public class Aniversario extends CartaoWeb{
    
    public Aniversario(String dest){
        this.destinatario = dest; 
    }
    public void retornaMensagem(String Remete){
        System.out.println("Querido(a) "+Remete+
                "\n Espero que tenha um feliz aniversário, muita paz e saúde"
                + "\n Atenciosamente"+this.destinatario);
    }
}
