package extra1_2;

import java.util.*;
public class Extra1_2 {

    
    public static void main(String[] args) {
        // calcular area circulo pidendo por teclado datos y usando la libreria Math
   
        Scanner sc=new Scanner(System.in);
        
        float radio;
        System.out.println("Dame el valor del radio: ");
        radio=sc.nextInt();
        
     float area;
   
      area= (float)(Math.PI*Math.pow(radio, 2));
   System.out.append("El área del círculo es: " +area);
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
