/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista04;

/**
 *
 * @author aluno
 */
public class DiaDosNamorados extends CartaoWeb{
    
    public DiaDosNamorados(String dest){
        this.destinatario = dest; 
    }
    public void retornaMensagem(String Remete){
        System.out.println("Querido(a) "+Remete+
                "\n Espero que tenha sido o unico cartão do dia dos namorados"
                + "\n Beijos"+this.destinatario);
    }
}
