/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista04.exer2;

/**
 *
 * @author Luan Amor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CarbonFootPrint obj[] = new CarbonFootPrint[4];
        
       /* obj[0] = new Car();
        obj[1] = new Building();
        
        obj[1].getCarbonFootPrint();
        obj[0].getCarbonFootPrint();*/
       
       Building c[] = new Building[2];
       
       c[0] = new House();
       c[1] = new School();
       
    }
    
}
