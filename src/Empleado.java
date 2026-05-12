public abstract class Empleado implements Pagable, Evaluable {
    protected int id;
    protected String nombre;
    protected TipoContrato tipoContrato;
    protected Departamento departamento;

    public Empleado(int id, String nombre, TipoContrato tipoContrato, Departamento departamento) {
        this.id = id;
        this.nombre = nombre;
        this.tipoContrato = tipoContrato;
        this.departamento = departamento;
    }

    public String getInfo() {
        return "ID: " + id + " | Nombre: " + nombre + " | Depto: " + departamento;
    }

    @Override
    public String toString() {
        return getInfo() + " | Contrato: " + tipoContrato;
    }
    
    // Los métodos abstractos de las interfaces se heredan y 
    // deberán ser implementados en las clases hijas.
}