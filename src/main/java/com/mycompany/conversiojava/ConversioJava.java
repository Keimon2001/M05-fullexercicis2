

package com.mycompany.conversiojava;

import java.util.Scanner;


public class ConversioJava {

         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcio;
        
        do{
            System.out.println("OPCIONS A TRIAR");
            System.out.println("1. De EURO a LLIURA");
            System.out.println("2. De LLIURA a EURO");
            opcio=sc.nextInt();
            
        }while(opcio != 3);
        
        System.out.println("Introdueix en €");
        int valor_euros = sc.nextInt();
                
        double tipus_de_canvi = 0.87d;
        System.out.println(valor_euros + " euros (€) acatualment equivalen a" + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
    }
}

