/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista04;

/**
 *
 * @author Luan Amor
 */
public abstract class CartaoWeb {
    protected String destinatario;
    
    public String getNome(){
        return this.destinatario;
    }
    
    public abstract String retornaMensagem(String Remete);
}
