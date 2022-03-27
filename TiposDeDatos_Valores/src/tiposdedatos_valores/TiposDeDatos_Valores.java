/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdedatos_valores;

import java.util.Scanner;

/**
 *
 * @author juanj
 * PRACTICA PARA TIPOS DE DATOS NUMERICOS Y SU RANGO DE VALORES
 */
public class TiposDeDatos_Valores {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("RANGO DE VALORES PARA LOS NUMERICOS ENTEROS");
        System.out.println("Tipo byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("Tipo short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("Tipo int: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("Tipo long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
        
        System.out.println("\nRANGO DE VALORES PARA LOS NUMERICOS REALES");
        System.out.println("Tipo float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("Tipo double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
        
        //REALIZAR LAS OPERACIONES ARITMETICAS (CON DOS VALORES LEIDOS POR TECLADO)
        int a,b;
        
        System.out.println("Ingresa un valor entero: ");
        a = entrada.nextInt();
        System.out.println("Ingresa otro valor entero: ");
        b = entrada.nextInt();
        
        System.out.println("Suma: "+ (a+b)+
                "\nResta: "+ (a-b) + 
                "\nMultiplicacion: "+ (a*b)+ 
                "\nDivision: "+ (a/b)+ 
                "\nModulo: "+ (a%b));
    }
    
}
