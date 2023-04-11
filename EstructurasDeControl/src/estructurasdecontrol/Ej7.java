/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package estructurasdecontrol;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String cadena = leer.nextLine();
        int FDE = 0;
        int INC = 0;
        while (!cadena.equals("&&&&&")) {
            if (cadena.length() <= 5 && cadena.substring(0, 1).equalsIgnoreCase("X") && cadena.substring(cadena.length() - 1, cadena.length()).equalsIgnoreCase("O")) {
                System.out.println("Secuencia Correcta");
                FDE++;
            } else {
                INC++;
                System.out.println("Secuencia Incorrecta");
            }
            System.out.println("Ingrese una palabra o &&&&& para finalizar");
            cadena = leer.nextLine();
        }
        System.out.println("El programa ha finalizado");
        System.out.println("El número de secuencias incorrectas es " + FDE);
        System.out.println("El número de secuencias incorrectas es " + INC);
    }
}
