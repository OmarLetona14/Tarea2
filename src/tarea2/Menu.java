/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Menu {
    
    double n1, n2, n3;
    int option;
    Scanner reader = new Scanner(System.in);
    double[] numeros = new double[3];
    
    void errorMenu(String messagge){
        reader.next();
        System.out.println(messagge);
        optionMenu();
    }
    void optionMenu(){
        System.out.println("Desea ingresar más numeros?");
        System.out.println("1. Si");
        System.out.println("2. No");
        try{option = reader.nextInt();}catch(Exception e){errorMenu("No se puede ingresar letras");}
        switch(option){
            case 1:
                mainMenu();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                errorMenu("Ingrese una opcion válida");
        }
    }
    
    void mainMenu(){
        System.out.println("Por favor ingrese el primer numero");
        try{n1 = reader.nextDouble();}catch(Exception e){errorMenu("No se puede ingresar letras");}
        System.out.println("Por favor ingrese el segundo numero");
        try{n2 = reader.nextDouble();}catch(Exception e){errorMenu("No se puede ingresar letras");}
        System.out.println("Por favor ingrese el tercer numero");
        try{n3 = reader.nextDouble();}catch(Exception e){errorMenu("No se puede ingresar letras");}
        numeros[0] = n1;numeros[1] = n2;numeros[2] = n3;
        System.out.println("----- PROMEDIO DE LOS NUMEROS -----");
        System.out.println(promedio());
        System.out.println("----- MAYOR NUMERO -----");
        System.out.println(numeroMayor());
        System.out.println("----- SUMA -----");
        System.out.println(suma());
        optionMenu();
    }
    double promedio(){
        double promedio=suma()/numeros.length;
        return promedio;
    }
    double numeroMayor(){ 
        double mayor = numeros[0];       
        for(int i = 1; i<3; i++){
            if(numeros[i]>mayor){
                mayor = numeros[i];
            }
        }
        return mayor;
    }
    double suma(){
    double suma = 0;
        for(double n: numeros){
            suma += n;
        }
        return suma;
    }
}