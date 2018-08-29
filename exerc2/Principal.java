/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc2;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CDPlayer cd = new CDPlayer();
        Radio r = new Radio();
        
        cd.aumentaVolume(2);
        cd.desliga();
        cd.diminuiVolume(2);
        cd.liga();
        
        r.aumentaVolume(2);
        r.desliga();
        r.diminuiVolume(2);
        r.liga();
    }
}
