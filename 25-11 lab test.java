/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sawerabukhari;

/**
 *
 * @author sawera bukhari
 */
public class Sawerabukhari {
static int find(int decimal_number) 
    { 
        if (decimal_number == 0)  
            return 0;  
              
        else
          
        return (decimal_number % 2 + 10 *  
                find(decimal_number / 2)); 
    } 
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int decimal_number = 10; 
    System.out.println(find(decimal_number)); 
    }
    
}
