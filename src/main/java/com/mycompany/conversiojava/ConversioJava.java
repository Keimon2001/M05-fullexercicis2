

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
            System.out.println("3. Sortir");
            opcio=sc.nextInt();
            
            switch(opcio){
                case 1:
                    System.out.println("Opcio 1");
                    System.out.println("De EURO a LLIURA");
                    System.out.println("Introdueix en €");
                    int valor_euros = sc.nextInt();
                    double tipus_de_canvi = 0.87d;
                    System.out.println(valor_euros + " euros (€) acatualment equivalen a" + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
                    break;
               
                case 2:
                    System.out.println("Opcio 2");
                    System.out.println("De LLIURA a EURO");
                    System.out.println("Introdueix en £");
                    int valor_lliures = sc.nextInt();
                    double tipus_d_canvi = 1.14d;
                    System.out.println(valor_lliures + " lliures (£) actualment equivalen a" + (valor_lliures * tipus_d_canvi) + " euros  (€)");
                    break;
            }
        }while(opcio != 3);
        
        
    }
}

