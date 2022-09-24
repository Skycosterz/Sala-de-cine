
package dpo1_u4_ea_lumg;

import java.util.Scanner;


public class DPO1_U4_EA_LUMG {


    public static void main(String[] args) {
      
        Scanner teclado = new Scanner (System.in);
        
       Sala Sala1 = new Sala();
        
       Sala2 Sala_2 = new Sala2();
       
       Sala3 Sala_3 = new Sala3();
       
         int opcion;
        
        
        
        //Menú
        do{
            System.out.println("opciones");
            System.out.println("1.-Sala Conjuro 3");
            System.out.println("2.-Sala Kombat Mortal");
            System.out.println("3.-Sala Raya y el Último Dragon");
            System.out.println("4.-salir");
            opcion = teclado.nextInt();
            
            
            switch(opcion){   
                case 1: 
                    Sala1.inicio_asientos();
                    Sala1.reservar_asientos();
                    break;
                case 2:
                    Sala_2.inicio_asientos2();
                    Sala_2.reservar_asientos2();
                case 3: 
                    Sala_3.inicio_asientos3();
                    Sala_3.reservar_asientos3();
                    
               
            }
            
        }while (opcion!=4);
    }
    
    
    
    
}
