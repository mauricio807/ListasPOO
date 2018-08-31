/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista04;

/**
 *
 * @author Luan Amor
 */
public class DiaDosNamorados extends CartaoWeb{
    
    public DiaDosNamorados(String dest){
        this.destinatario = dest; 
    }
    public String retornaMensagem(String Remete){
        return "Querido(a) "+this.destinatario+","
               "\n Espero que tenha sido o unico cartão do dia dos namorados"+
               "\n Beijos "+Remete;
    }
}
