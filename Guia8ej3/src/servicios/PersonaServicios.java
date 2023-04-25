/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Clinica
 */
public class PersonaServicios {
   public Persona crearPersona(){
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        String nombre = leer.nextLine();

        System.out.println("Ingrese la edad:");
        int edad = leer.nextInt();
        
        System.out.println("Ingrese el sexo(H - hombre, M - mujer, O - otro):");
        String sexo = leer.nextLine();
        
        System.out.println("Ingrese el peso en kg");
        int peso = leer.nextInt();
        
        System.out.println("Ingrese la altura en cm");
        int altura = leer.nextInt();        

    return new Persona(nombre,edad,sexo,peso,altura);
}
   public boolean esMayorDeEdad(Persona Persona){
        return Persona.getEdad()>=18;
   }
   
   //Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
   //Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal 
   //y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
   //significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado 
   //de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
   public int calcularIMC(Persona Persona){
   int IMC = (int) (Persona.getPeso()/(Math.pow(Persona.getAltura()/100, 2)));
       if (IMC<20) {
           System.out.println(Persona.getNombre()+" está por debajo del peso ideal");
           return -1;}
           else if (IMC>=20 && IMC<=25){
           System.out.println(Persona.getNombre()+" está en su peso ideal");
           return 0;
       }else{
           System.out.println(Persona.getNombre()+" tiene sobrepeso");
           return 1;
           } 
       }
   public void mostrarPersona(Persona Persona){
       System.out.println(Persona.getNombre());
       System.out.println("Edad: "+Persona.getEdad());
       System.out.println("Sexo: "+Persona.getSexo());
       System.out.println("Peso "+Persona.getEdad());
       System.out.println("Altura "+Persona.getAltura());       
   }
   }
    

