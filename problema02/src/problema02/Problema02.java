/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
    int numero;
    int contador = 0;
    
    System.out.println("Ingrese un numero para su verificacion(sea par o positivo)");
    numero=entrada.nextInt();
    if (numero >= 1 && numero %2 == 0){
       while (contador < numero){
           contador = contador +1;
           System.out.println(contador);
       }
    }   else{
            System.out.println("Eror al verificar el numero(el numero no es par o es negativo))");

    }   
       
       
    
    
    
    
    
    
    }
    

}
