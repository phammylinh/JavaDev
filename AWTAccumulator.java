/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myframe;
import java.awt.*;        
import java.awt.event.*;  
/**
 *
 * @author PC
 */
public class AWTAccumulator extends Frame implements ActionListener {
    
   private Label lblInput;    
   private Label lblOutput;    
   private TextField tfInput; 
   private TextField tfOutput; 
   private int sum = 0;       
 
  
   public AWTAccumulator() {
      setLayout(new FlowLayout());
         
      lblInput = new Label("Enter an Integer: ");
      add(lblInput);            
 
      tfInput = new TextField(10);
      add(tfInput);                
 
      tfInput.addActionListener(this);
 
      lblOutput = new Label("The Accumulated Sum is: ");  
      add(lblOutput);             
 
      tfOutput = new TextField(10); 
      tfOutput.setEditable(false); 
      add(tfOutput);                
 
      setTitle("AWT Accumulator"); 
      setSize(350, 120); 
      setVisible(true);  
   }
 
  
   public static void main(String[] args) {
     
      new AWTAccumulator();
   }
 
   // ActionEvent handler - Called back upon hitting "enter" key on TextField
   @Override
   public void actionPerformed(ActionEvent evt) {
      // Get the String entered into the TextField tfInput, convert to int
      int numberIn = Integer.parseInt(tfInput.getText());
      sum += numberIn;      // Accumulate numbers entered into sum
      tfInput.setText("");  // Clear input TextField
      tfOutput.setText(sum + ""); // Display sum on the output TextField
                                  // convert int to String
   }
}
    