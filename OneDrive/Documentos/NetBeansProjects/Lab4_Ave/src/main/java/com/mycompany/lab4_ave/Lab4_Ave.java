/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4_ave;

/**
 *
 * @author lucas
 */
public class Lab4_Ave {
    
    
    public static void main(String ... args) {
        
        Pato pt = new PatoDomestico();
        Ave ptAve = new PatoAveAdapter(pt);
        
        
        Pavao pv = new PavaoAzul();
        Ave pvAve = new PavaoAveAdaptor(pv);
        
        Lab4_Ave main = new Lab4_Ave();
        
        main.habilidadesDaAve(ptAve);
        main.habilidadesDaAve(pvAve);
        
        
    }
    
    public void habilidadesDaAve(Ave ave) {
        ave.emitirSom();
        ave.voar();
    } 
}
