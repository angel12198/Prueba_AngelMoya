package principal;

import controlador.ControladorVentanaEmpleado;
import modelo.Empleado;
import vista.VentanaEmpleado;

public class Principal {


    public static void main(String[] args) {
        Empleado []e = new Empleado[50];
        VentanaEmpleado v = new VentanaEmpleado();
        ControladorVentanaEmpleado c = new ControladorVentanaEmpleado(v,e);
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        
        System.out.println("Hola mundo")
    }
    
}
