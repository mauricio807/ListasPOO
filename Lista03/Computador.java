/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03;

/**
 *
 * @author Luan Amor
 */
public class Computador extends DispositivoEletronico {
    private float polegadas;
    private String processador;
    private String modelo;
    private String marca;

    @Override
    public String toString() {
        return "Computador{" + "polegadas=" + polegadas + ", processador=" + processador + ", modelo=" + modelo + ", marca=" + marca + '}';
    }
    
    
}
