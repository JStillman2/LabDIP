/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2.student.solution1;

/**
 *
 * @author jstillman2
 */
public class TipService {
    private TipCalculator tipCalculator;
    
    public TipService(TipCalculator calc){
        tipCalculator = calc;
        
    }
    
    public double getTip(){
        return tipCalculator.getTip();
        
    }
}
