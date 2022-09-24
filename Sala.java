
package dpo1_u4_ea_lumg;

import java.util.Scanner;


public class Sala {
    
    //Atributos
    int [][] asientos = new int [4][11];
    
    //metodos
    public void inicio_asientos(){
        int numero = 1;
        for(int i=0;i<4;i++){
            for(int c=0; c<11; c++){
                asientos[i][c] = numero;
                numero++;
            }
        }
    }
  
    
    public void mostrarasientos(){
        
      for(int i=0;i<4;i++){
           for(int c=0; c<11; c++){

          if ( i % 2 == 0){
             asientos[i][0]=0;
             asientos[i][3]=0;
             asientos[i][4]=0;
             asientos[i][7]=0;
             asientos[i][8]=0;
            
             
          } 
          else {
             asientos[i][1]=0;
             asientos[i][2]=0;
             asientos[i][5]=0;
             asientos[i][6]=0;
             asientos[i][9]=0;
             asientos[i][10]=0;
          
          }
               System.out.println("\t ["+asientos[i][c]+"]" );
          
          
       }
           System.out.println(" ");
           
    }
   
      
}
    
    public void reservar_asientos(){
       Scanner teclado = new Scanner(System.in);
       mostrarasientos();
       
            System.out.println("Asiento escogido:  ");
            int res = teclado.nextInt();
            
              for(int i=0;i<4;i++){
            for(int c=0; c<11; c++){
              if  (res == asientos[i][c]){
                  asientos [i][c] = 99;
                  
              }
            }
        }
   mostrarasientos();
   }   
}
