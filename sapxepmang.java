/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxepmang;

/**
 *
 * @author PC
 */
public class Sapxepmang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array_a ={5,6,3,4,2,8};
        for(int i=0;i<array_a.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(array_a[i]<=array_a[j])
                {
                    int temp = array_a[i];
                    array_a[i]= array_a[j];
                    array_a[j]= temp;
                }
            }
        }
        System.out.println("Mang da duoc sap xep la:");
        for(int i=0; i<array_a.length; i++)
        {
            System.out.print(array_a[i]);
        }
        // TODO code application logic here
    }
    
}
