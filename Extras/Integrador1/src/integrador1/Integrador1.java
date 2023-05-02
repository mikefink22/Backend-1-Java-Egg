/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador1;

import entidad.Empleado;
import java.util.Scanner;
import servicios.ServiceEmpleados;


public class Integrador1 {

 
    public static void main(String[] args) {
      
      Scanner leer = new Scanner(System.in).useDelimiter("\n");  
      System.out.println("Ingrese la cantidad de empleados de la empresa");    
      int cantEmpleados = leer.nextInt();
      
      ServiceEmpleados emp = new ServiceEmpleados();
      Empleado [] empleados= emp.crearEmpleados(cantEmpleados);
      
      System.out.println("----------------------------------");
      System.out.println("Segundo método:");
      emp.nombreEmpleados(empleados);
    }
    
}
