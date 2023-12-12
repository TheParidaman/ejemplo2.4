
package ejercicio2.pkg4;

import java.util.Scanner;

public class EJERCICIO24 {

    public static void main(String[] args) {
        System.out.println ("Ingrese sueldo");
    
         Scanner sc = new Scanner(System.in);
          double sueldo = sc.nextInt();
        
          if (sueldo >= 1000) {
              double sueldo2;
              sueldo2 = sueldo * 1.17;
              System.out.println ("Sueldo total: " + sueldo2);
          } else {
              double sueldo3;
              sueldo3 = sueldo * 1.12;
              System.out.println ("Sueldo total: " + sueldo3);
        }
        
    }
    
}
