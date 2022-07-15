package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.util.Date;

public class Aplicacion {
    public static void main(String[] args) {
        Date fecha = new Date();
        fecha.setYear(2003);
        fecha.setMonth(9);
        fecha.setDate(9);
        
        Persona obj1 = new Persona("1750287748", "Andy", "Joel", "Vaca", "Paredes", fecha, "Paltas y Pedro Mon", "andy.vaca@intsuperior.edu.ec");
        
        System.out.println("Cedula: "+ obj1.getCedula()+"\n"
                + "Nombre: "+obj1.getNombre1()+"\n"
                        + "Segundo nombre: "+obj1.getNombre2()+"\n"
                                + "Apellido: "+obj1.getApellido1()+"\n"
                                        + "Segundo apellido: "+obj1.getApellido2()+"\n"
                                                + "Dirección: "+obj1.getDireccion()+"\n"
                                                        + "Fecha de Nacimiento: "+obj1.getFechaNacimiento().getYear()+"/"+obj1.getFechaNacimiento().getMonth()+"/"+obj1.getFechaNacimiento().getDate()+"\n"
                                                                + "Correo Electronico: "+obj1.getCorreo());
        
    }
}
