/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

/**
 *
 * @author jstillman2
 */
public class ConsoleOutput implements OutputMessage{
    
    public void getOutput(InputMessage message){
        System.out.println(message);
    }
    
}
