/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import java.util.List;
import modelo.Carrera;

/**
 *
 * @author erika
 */
public interface ICarreraServicio {
    public Carrera crear(Carrera c);
    public Carrera modificar (int n, Carrera c);
    public Carrera eliminar (int n);
    public List<Carrera> listar ();
    public int buscarPosicion(int n);
    
    
}
