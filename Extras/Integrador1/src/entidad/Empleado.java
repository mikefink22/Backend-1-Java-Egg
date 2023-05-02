/*
Para hacer esto, debes crear un objeto de tipo Empleado, cuyos atributos serán
el nombre y el salario (que representa el salario mensual del empleado).
 */
package entidad;

public class Empleado {
    private String nombre;
    private double salario;
    
    public Empleado() {
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    }
