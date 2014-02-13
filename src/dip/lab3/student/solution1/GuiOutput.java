/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author jstillman2
 */
public class GuiOutput implements OutputMessage {
    
    
     public void getOutput(InputMessage message) {
       Message mg = message.getInput();
       JOptionPane.showMessageDialog(null, mg.getStringMessage());
    }
    
}
