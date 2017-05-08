/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author PC
 */
public class Baitap extends Frame implements ActionListener {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
       // TODO code application logic here
     private Label lblA, lblB, lblKQ;
     private TextField txtA, txtB, txtKQ;
     private Button btnTong, btnHieu, btnTich, btnThuong;
    
    
    public Baitap()
    {
        setLayout(new FlowLayout());
        lblA=new Label("a=");
         add(lblA);
        
        txtA=new TextField("0",10);
        add(txtA);
        
        lblB=new Label("b=");
         add(lblB);
         
        txtB=new TextField("0",10);
        add(txtB);
        
        btnTong = new Button("Tong");   
        add(btnTong);                    
 
        btnTong.addActionListener(this);
        
        btnHieu = new Button("Hieu");   
        add(btnHieu);                    

        btnHieu.addActionListener(this);
        
        btnTich = new Button("Tich");   
        add(btnTich);                    
        btnTich.addActionListener(this);
        
        btnThuong = new Button("Thuong");   
        add(btnThuong);                    
 
        btnThuong.addActionListener(this);

        lblKQ=new Label("KQ");
        add(lblKQ);
        
        txtKQ=new TextField();
        add(txtKQ);
        txtKQ.setEditable(false);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnTong)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a+b;
            txtKQ.setText(c + ""); 
        }
         if(e.getSource()==btnHieu)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a-b;
            txtKQ.setText(c + ""); 
            

        }
          if(e.getSource()==btnTich)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a*b;
            txtKQ.setText(c + ""); 
            

        }
           if(e.getSource()==btnThuong)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            float c=(float)a/b;
            txtKQ.setText(c + ""); 
            

        }
    }
    public static void main(String[] args) {
        Baitap thtt=new Baitap();
        thtt.setTitle("tonghieutichthuong");
        thtt.setSize(300,200);
        
        thtt.setVisible(true);
    }
}
    
    

