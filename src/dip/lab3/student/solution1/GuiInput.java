
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;
/**
 *
 * @author jstillman2
 */
public class GuiInput implements InputMessage{
    
    
    @Override
    public String getInput(){
       String message =  JOptionPane.showInputDialog("What is your message?");
       return message;
       
    }
//        public static void main(String[] args) {
//        
//           GuiInput a = new GuiInput();
//            System.out.println(a.getInput());
//    }
    
       
}
