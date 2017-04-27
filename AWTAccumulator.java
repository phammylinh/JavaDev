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
   private TextField txtInput; 
   private TextField txtOutput; 
   private int sum = 0;       
 
  
   public AWTAccumulator() {
      setLayout(new FlowLayout());
         
      lblInput = new Label("Nhập một số: ");
      add(lblInput);            
 
      txtInput = new TextField(10);
      add(txtInput);                
 
      txtInput.addActionListener(this);
 
      lblOutput = new Label("\n Tổng tích lũy là: ");  
      add(lblOutput);             
 
      txtOutput = new TextField(10); 
      txtOutput.setEditable(false); 
      add(txtOutput);                
 
      setTitle("AWT Accumulator"); 
      setSize(350, 120); 
      setVisible(true);  
   }
 
  
   public static void main(String[] args) {
     
      new AWTAccumulator();
   }

   @Override
   public void actionPerformed(ActionEvent evt) {
      int numberIn = Integer.parseInt(txtInput.getText());
      sum += numberIn;     
      txtInput.setText("");  
      txtOutput.setText(sum + "");
   }
}
    