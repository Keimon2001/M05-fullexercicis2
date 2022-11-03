

package com.mycompany.conversiojava;

import java.util.Scanner;


public class ConversioJava {

         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix en €");
        int valor_euros = sc.nextInt();
                
        double tipus_de_canvi = 0.87d;
        System.out.println(valor_euros + " euros (€) acatualment equivalen a" + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
    }
}

