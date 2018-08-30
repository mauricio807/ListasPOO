/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista04;

/**
 *
 * @author aluno
 */
public abstract class CartaoWeb {
    protected String destinatario;
    
    public String getNome(){
        return this.destinatario;
    }
    
    public abstract void retornaMensagem(String Remete);
}
