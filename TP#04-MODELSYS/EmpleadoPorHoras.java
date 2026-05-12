public class EmpleadoPorHoras extends Empleado {
    private double valorHora;
    private int horasTrabajadas;
    private int puntaje;

    public EmpleadoPorHoras(int id, String nombre, TipoContrato tipoContrato, Departamento departamento, double valorHora, int horasTrabajadas, int puntaje) {
        super(id, nombre, tipoContrato, departamento);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.puntaje = puntaje;
    }

    @Override
    public double calcularSueldo() {
        return valorHora * horasTrabajadas;
    }

    @Override
    public String generarRecibo() {
        return "Recibo Empleado por Horas: " + nombre + " - Total: $" + calcularSueldo();
    }

    @Override
    public int evaluar() {
        return puntaje;
    }

    @Override
    public String getNivelDesempeno() {
        return puntaje >= 8 ? "Excelente" : "A mejorar";
    }
}