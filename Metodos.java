/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen1ev;

import java.util.Scanner;
/**
 *
 * @author Iria
 */
public class Metodos {
    public static void metodoMasa() {

        char repetir;
        System.out.println("¡Hola!");
        System.out.println("\nEscribe 'S' si desea calcular el peso de un astronauta. Teclea 'N' si prefieres no continuar.");
        Scanner teclado = new Scanner(System.in);
        repetir = teclado.next().charAt(0);
        
        int planeta;
        double masa;
        
        while(repetir == 'S' || repetir == 's'){
            
            System.out.println("\nIntroduce la masa en kg:");  
            Scanner teclado2 = new Scanner(System.in);
            masa = teclado2.nextDouble();
            
            System.out.println("\n1 - Mercurio\n2 - Venus\n3 - Tierra\n4 - Marte\n5 - Júpiter\n6 - Saturno\n7 - Urano\n8 - Neptuno\n9 - Plutón\n10 - Luna");
            System.out.println("\nIntroduce el número del planeta correspondiente para calcular el peso:");
            Scanner teclado3 = new Scanner(System.in);
            planeta = teclado3.nextInt();
            
                        
            switch(planeta){
            case 1:
                final double MER = 3.7;
                double masamercurio = masa*MER;
                System.out.println("El peso del astronauta en Mercurio es: "+masamercurio+" Newtons");
                break;
            case 2:
                final double VEN = 8.87;
                double masavenus = masa*VEN;
                System.out.println("El peso del astronauta en Venus es: "+masavenus+" Newtons");
                break;
            case 3:
                final double TIE = 9.81;
                double masatierra = masa*TIE;
                System.out.println("El peso del astronauta en la Tierra es: "+masatierra+" Newtons");
                break;
            case 4:
                final double MAR = 3.72;
                double masamarte = masa*MAR;
                System.out.println("El peso del astronauta en Marte es: "+masamarte+" Newtons");
                break;
            case 5:
                final double JUP = 24.79;
                double masajupiter = masa*JUP;
                System.out.println("El peso del astronauta en Júpiter es: "+masajupiter+" Newtons");
                break;
            case 6:
                final double SAT = 10.44;
                double masasaturno = masa*SAT;
                System.out.println("El peso del astronauta en Saturno es: "+masasaturno+" Newtons");
                break;    
            case 7:
                final double URA = 8.87;
                double masaurano = masa*URA;
                System.out.println("El peso del astronauta en Urano es: "+ masaurano +" Newtons");
                break;
            case 8:
                final double NEP = 11.15;
                double masaneptuno = masa*NEP;
                System.out.println("El peso del astronauta en Neptuno es: "+ masaneptuno +" Newtons");
                break;
            case 9:
                final double PLU = 0.62;
                double masapluton = masa*PLU;
                System.out.println("El peso del astronauta en Plutón es: "+ masapluton +" Newtons");
                break;
            case 10:
                final double LUN = 1.62;
                double masaluna = masa*LUN;
                System.out.println("El peso del astronauta en la Luna no es: "+ masaluna +" Newtons");
                break;
            default:
                System.out.println("Error: El número no se encuentra dentro del rango especificado.");
                break;  
            }

            System.out.println("\nEscribe 'S' si desea continuar. Teclea 'N' quiere acabar.");
            Scanner tecladofinal = new Scanner(System.in);
            repetir = tecladofinal.next().charAt(0);  
        }  
        System.out.println("\n¡Adiós!");
        teclado.close(); 
    }           
}
