/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;

import Controlador.CarreraControl;
import modelo.Asignatura;
import modelo.Carrera;

/**
 *
 * @author erika
 */
public class G23_POO_Ejercicio_02_01_1 {

    public static void main(String[] args) {
        var carreraControl = new CarreraControl();
        
        carreraControl.crear(45, "Electronica", 100, 4, 2000, "Circuitos", " Pedro Gomez", 8, 3, 21);
        carreraControl.crear(35, "Computacion", 200, 5, 2500, "Programacion", " Mauricio Ortiz", 6, 2, 14);
        carreraControl.crear(42, "Biomedicina", 100, 4, 1500, "Quimica", "Juan Perez", 12, 1, 5);
        carreraControl.crear(40, "Telecomunicaciones", 130, 5, 2100, "Redes", " Pedro Gomez", 8, 3, 17);
        carreraControl.crear(36, "Ingenieria Electrica", 160, 4, 2000, "Teoria", " David Idrovo", 4, 2, 6);
        carreraControl.crear(24, "Ingenieria Industrial", 135, 5, 1600, "Seguridad Industrial", " Diego Urgilez", 12, 4, 12);
    
        System.out.println("Listado Inicial");
        
        for (Carrera c: carreraControl.listar())
            System.out.println(c.toString());
        
    carreraControl.eliminar(24);
    System.out.println("Listado Eliminando el código 24");
    for (Carrera c: carreraControl.listar())
        System.out.println(c.toString());
    
    var nuevaAsignatura = new Asignatura("Matematica","Juan Perez",8,3,29);
    var nuevaCarrera = new Carrera(78,"Derecho",150,5,2030,nuevaAsignatura);    
    carreraControl.modificar(45, nuevaCarrera);
    
     System.out.println("Listado modificado el código 45");
    for (Carrera c: carreraControl.listar())
            System.out.println(c.toString());
    
    
    
    }
    
}
