/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyento;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author PC
 */
public class BTTonghop extends Frame implements ActionListener{
  
    private Button btnTong, btnUoc, btnSNT, btnPT, btnTH, btnTT, btnOut;
    private Label lblNew, lblKQ;
    private TextField txtNew, txtKQ;
    public BTTonghop()
    {
        setLayout(new FlowLayout());
        
        lblNew = new Label("N=");
        add(lblNew);
        
        txtNew = new TextField(10);
        add(txtNew);
        
        lblKQ = new Label("Ket qua:");
        add(lblKQ);
        
        txtKQ = new TextField(10);
        add(txtKQ);
        
        txtKQ.setEditable(false);
        
        btnTong = new Button("Tong day");
        add(btnTong);
        
        btnTong.addActionListener(this);

        btnUoc = new Button("Cac uoc so");
        add(btnUoc);
        
        btnUoc.addActionListener(this);
        
        btnSNT = new Button("So nguyen to");
        add(btnSNT);
        
        btnSNT.addActionListener(this);
        
        btnPT = new Button("Phan tich");
        add(btnPT);
        
        btnPT.addActionListener(this);
        
        btnTH = new Button("Thuc hien");
        add(btnTH);
        
        btnTT = new Button("Tiep tuc");
        add(btnTT);
    
        btnOut = new Button("Thoat");
        add(btnOut);

    }
      
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnTong)
        {
            int n=Integer.parseInt(txtNew.getText());
            int s=0;
            for(int i=1;i<=n;i++)
            s=s+i;
            txtKQ.setText(s + ""); 
        }
        if(e.getSource()==btnUoc)
        {
            int n=Integer.parseInt(txtNew.getText());
            String s = "";
            for(int i=1;i<=n;i++)
            if (n%i==0) s=s+"-"+i;
            txtKQ.setText(s + ""); 
        }
        if(e.getSource()==btnSNT)
        {
         int n=Integer.parseInt(txtNew.getText());
         int dem=0;
         for(int i=2;i<n;i++)
             if(n%i==0) dem++;
         if(dem==1)
         txtKQ.setText(n+"không phải la so nguyen to" + ""); 
         else txtKQ.setText(n+"la so nguyen to" + ""); 
        }
        if(e.getSource()==btnPT)
        { String s = "";
        
          int n=Integer.parseInt(txtNew.getText());
          int i=2;
          while (n != 1)
    {
        if ((n%i) == 0)
        {
            s=s+"*"+i;
            n /= i;
        }

        else
            i++;
    }
          txtKQ.setText(s+"");  
        }
           
    }
    
    public static void main(String[] args) {
      BTTonghop p=new BTTonghop();
      p.setTitle("Bai tap tong hop");
      p.setSize(400,200);
      p.setVisible(true);
    }

  
}

