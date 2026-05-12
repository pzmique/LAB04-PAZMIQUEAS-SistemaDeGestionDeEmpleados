import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
    }

    public void listarEmpleados() {
        System.out.println("--- Lista de Empleados de " + nombre + " ---");
        for (Empleado emp : empleados) {
            System.out.println(emp.toString());
        }
    }

    public double calcularNomina() {
        double total = 0;
        for (Empleado emp : empleados) {
            total += emp.calcularSueldo();
        }
        return total;
    }

    public void reportePorDepto(Departamento depto) {
        System.out.println("--- Reporte del Departamento: " + depto + " ---");
        for (Empleado emp : empleados) {
            if (emp.departamento == depto) {
                System.out.println(emp.getInfo() + " | Sueldo: $" + emp.calcularSueldo());
            }
        }
    }
}