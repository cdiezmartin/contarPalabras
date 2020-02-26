
package ejercicioconarrays;

import java.util.Scanner;

public class EjercicioConArrays {
static Scanner sc=new Scanner(System.in);

    
  
     public static void main(String[] args) {
        // TODO code application logic here
       
        inicioApp ini = new inicioApp();
        
        System.out.println("Escriba una frase");
        String frase1=sc.nextLine();
        String remplazo=frase1.replace(" ", "");
        System.out.println("La frase tiene " +ini.contadorPalabras(remplazo)+" caracteres sin espacios");
        System.out.println("La frase tiene un total de "+ frase1.split("\\s+|n").length+" palabras");
        
        ini.mostrarResultado(frase1);
    }          
      
    
    }

