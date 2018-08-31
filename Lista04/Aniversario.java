/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista04;

/**
 *
 * @author Luan Amor
 */
public class Aniversario extends CartaoWeb{
    
    public Aniversario(String dest){
        this.destinatario = dest; 
    }
    public String retornaMensagem(String Remete){
        return "Querido(a) "+this.destinatario+","+
               "\n Espero que tenha um feliz aniversário, muita paz e saúde"
               + "\n Atenciosamente "+Remete;
    }
}
