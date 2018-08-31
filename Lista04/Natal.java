/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista04;

/**
 *
 * @author Luan Amor
 */
public class Natal extends CartaoWeb{
    
    public Natal(String dest){
        this.destinatario = dest; 
    }
    
    public String retornaMensagem(String Remete){
        return "Querido(a) "+this.destinatario+
               "\n Feliz Natal" + 
               "\n Atenciosamente "+Remete;
    }
}
