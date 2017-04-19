/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh2;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Thuchanh2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner ban_phim = new Scanner(System.in);
        System.out.println("Nh?p m?t s?:");
        a = ban_phim.nextInt();
        String kq="";
        if (a % 2 == 0)
            kq="S? ch?n.";
        else
            kq=" S? l?";
        System.out.println("S? v?a nh?p là "+kq);
    }
    
}
