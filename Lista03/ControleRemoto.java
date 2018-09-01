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
public class ControleRemoto extends DispositivoEletronico {
    private int volumeAtual;
    private int volMax;
    
    public int aumentar(int mais){ 
        return mais;
    };
    
    public int diminuir(int menos){ return menos;}
}
