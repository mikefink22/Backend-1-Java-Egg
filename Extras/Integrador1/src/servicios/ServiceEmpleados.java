/*
La empresa cuenta con solamente 6 empleados, por lo que deberás crear los 6
objetos Empleado con sus respectivos salarios.
Una vez creados los empleados, deberás guardarlos en un arreglo de objetos
tipo Empleado. Utilizando ese arreglo, tendrás que realizar las dos tareas que
te piden:
1. Calcular y mostrar el salario promedio de todos los empleados.
2. Retornar otro arreglo con los nombres de los empleados que tienen un
salario mayor al promedio.
Finalmente, debes mostrar todos los empleados con un salario superior al
promedio.
 */
package servicios;

import entidad.Empleado;
import java.util.Scanner;

public class ServiceEmpleados {

     public Empleado[] crearEmpleados(int cantidadEmpleados) {
        
        Empleado[] empleados = new Empleado[cantidadEmpleados];
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Ingrese el nombre del empleado nº " + (i)+1);
            String nombre = (leer.next());
            System.out.println("Ingrese el salario del empleado nº" + (i)+1);
            double salario = leer.nextDouble();
            empleados[i] = new Empleado(nombre, salario);
        }                  
        return empleados;
    }

    public void nombreEmpleados(Empleado[]empleados){
     System.out.println("Lista de empleados:");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado " + (i + 1) + " :");
            System.out.println("Nombre: " +empleados[i].getNombre());
            System.out.println("Salario: "+empleados[i].getSalario());
        }
    }
}
