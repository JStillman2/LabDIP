/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3.student.solution1;

import java.util.*;

/**
 *
 * @author jstillman2
 */
public class KeyboardInput implements InputMessage {
    
    
   @Override
   public String getInput(){
       Scanner keyboard = new Scanner(System.in);
       System.out.println("What is your message?");
       String message = keyboard.nextLine();
       return message;
       
   }
//       public static void main(String[] args) {
//        KeyboardInput a = new KeyboardInput();
//           System.out.println(a.getInput());
//    }
//       
       
   }

