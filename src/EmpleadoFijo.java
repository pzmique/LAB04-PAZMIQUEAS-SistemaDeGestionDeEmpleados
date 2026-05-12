public class EmpleadoFijo extends Empleado {
    
    private double sueldoBase;
    private int antiguedad;
    private int puntaje;

    public EmpleadoFijo(int id, String nombre, TipoContrato tipoContrato, Departamento departamento, double sueldoBase, int antiguedad, int puntaje) {
        super(id, nombre, tipoContrato, departamento);
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
        this.puntaje = puntaje;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (antiguedad * 1000); // Ejemplo de lógica simple
    }

    @Override
    public String generarRecibo() {
        return "Recibo Empleado Fijo: " + nombre + " - Total: $" + calcularSueldo();
    }

    @Override
    public int evaluar() {
        return puntaje; 
    }

    @Override
    public String getNivelDesempeno() {
        return puntaje >= 8 ? "Excelente" : "A mejorar"; // Lógica simple
    }
}