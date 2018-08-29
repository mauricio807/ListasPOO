/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Livro n1 = new Livro();
        Tese t1 = new Tese();
        Revista r1 = new Revista();
        
        n1.disponivel();
        n1.emAtraso();
        n1.emprestado();
        n1.reservado();
        
        t1.disponivel();
        t1.emAtraso();
        t1.emprestado();
        t1.reservado();
        
        r1.disponivel();
        r1.emAtraso();
        r1.emprestado();
        r1.reservado();
        
        //Exer 2
        
        
    }
}
    
    

