public class Main {
    public static void main(String[] args) {

        Empresa miEmpresa = new Empresa("LEDTECH S.T");

        Empleado e1 = new EmpleadoFijo(101, "Vicente", TipoContrato.FULLTIME, Departamento.SISTEMAS, 500000, 2, 9);
        Empleado e2 = new EmpleadoPorHoras(102, "Miqueas", TipoContrato.PARTTIME, Departamento.SISTEMAS, 3500, 120, 8);
        Empleado e3 = new EmpleadoFijo(103, "Damian", TipoContrato.CONTRATADO, Departamento.VENTAS, 400000, 5, 7);

        miEmpresa.agregarEmpleado(e1);
        miEmpresa.agregarEmpleado(e2);
        miEmpresa.agregarEmpleado(e3);

        miEmpresa.listarEmpleados();
        
        System.out.println("\nTotal a pagar en Nomina: $" + miEmpresa.calcularNomina());
        
        System.out.println("\n--- Recibos de Sueldo ---");
        System.out.println(e1.generarRecibo());
        System.out.println(e2.generarRecibo());
        System.out.println(e3.generarRecibo());
    }
}