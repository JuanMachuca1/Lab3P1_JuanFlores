/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_juanflores;
import java.util.Scanner;

public class Lab3P1_JuanFlores {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        
        
        boolean menu=true;
        while(menu){
            System.out.println("Menu");
            System.out.println("1 Serie Euclidiana");
            System.out.println("2 Pokebola ");
            System.out.println("3 Ok Bommer!");
            System.out.println("4. Salir");
            System.out.println("ingresar una opcion: ");
            int opcion=leer.nextInt();
            
            switch(opcion){
                case 1:
                {
                    double acum=0;
                    
                    System.out.println("ingresar la cantidad de puntos: ");
                    int cant=leer.nextInt();
                    
                    
                    for (int i = 1; i <= cant; i++) {
                        System.out.println("ingresar punto x: ");
                        double x=leer.nextInt();
                        System.out.println("Ingresar punto y: ");
                        double y=leer.nextInt();
                        
                        
                        double ecu=Math.pow(x-y,2);
                        
                        acum=acum+ecu;
                        
                        
                    }
                      
                      acum=Math.sqrt(acum);
                       System.out.println("La distancia euclidiana es: "+ acum);
                }
                    break;
                    
                case 2:
                {
                    System.out.println("ingresar el tamaño de la pokebola: ");
                    int tamaño=leer.nextInt();
                    
                    for (int i = 1; i <=tamaño; i++) {
                        for (int j = 1; j <=tamaño*2-1; j++) {
                            if (i==1||i==tamaño||j==1||j==tamaño*2-1){
                                System.out.print("*");
                            }else if(i==2||i<=tamaño/2-1){
                                System.out.print("*");
                            }else if (j<=(tamaño*2)/2-3 && i==tamaño/2){
                                    System.out.print("*");
                             
                            }else if(j<=(tamaño*2)/2+2 && i==tamaño/2 ){
                                System.out.print("#");
                             
                            }else if(j>=(tamaño*2)/2-2 && i==tamaño/2){
                                System.out.print("*");
                                
                            }else if(j<=(tamaño*2)/2-3 && i==tamaño/2+1) {
                                System.out.print("#");
                                
                            }else if(j<=(tamaño*2)/2+2 && i==tamaño/2+1 ){
                                System.out.print(" ");
                                
                            }else if(j>=(tamaño*2)/2-2 && i==tamaño/2+1){
                                System.out.print("#");
                                
                            }else if(j<=(tamaño*2)/2-3 && i==tamaño/2+2){
                                System.out.print(" ");
                            }else if (j<=(tamaño*2)/2+2 && i==tamaño/2+2){
                                System.out.print("#");
                            }else{
                                System.out.print(" ");
                            }
                        }
                      
                        System.out.println(" ");
                    }
                }
                    break;
                    
                case 3:
                {
                    System.out.println("ingrese su año de nacimiento: ");
                    int año=leer.nextInt();
                    while(año<=0){
                        System.out.println("ingrese una edad positiva: ");
                        año=leer.nextInt();
                    }
                    if (año>=1946 && año<1960){
                        System.out.println("Baby Bommer Gen");
                    }else if(año>=1960 && año<1975){
                        System.out.println("Generation X");
                    }else if(año>=1975 && año<1980){
                        System.out.println("Xennials");
                    }else if(año>=1980 && año<1990){
                        System.out.println("Millenials");
                    }else if(año>=1990 && año<2012){
                        System.out.println("Gen Z");
                    }else if(año>=2013 && año<=2025){
                        System.out.println("Gen Alpha");
                    }else{
                        System.out.println("Su edad esta fuera de rango");
                    }
                }
                    break;
                    
                case 4:
                {
                    menu=false;
                    System.out.println("ha salido del menu principal");
                    break;
                }
                
                default:
                    System.out.println("opcion invalida");
                       menu=false;
                    break;
                    
            
            }
        
        
        
        }

    }
}


    

