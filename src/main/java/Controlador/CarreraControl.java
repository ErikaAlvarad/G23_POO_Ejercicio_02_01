/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Servicio.CarreraServicio;
import java.util.List;
import modelo.Asignatura;
import modelo.Carrera;

/**
 *
 * @author erika
 */
public class CarreraControl {
    
    public CarreraServicio carreraServicio = new CarreraServicio();
    
    public Carrera crear (int n, String nD,int nEst, int d, int cT, String nAs, 
            String nPro, int nHo, int cHo, int nAu){
        var asignatura = new Asignatura(nAs,nPro,nHo,cHo,nAu);
        var carrera = new Carrera(n,nD,nEst,d,cT,asignatura);
        this.carreraServicio.crear(carrera);
        return carrera;
        
    }
    
    public Carrera eliminar (int n){
        return this.carreraServicio.eliminar(n);
    }
    
    public Carrera modificar (int n, Carrera c){
        return this.carreraServicio.modificar(n, c);
    }
    
    public List<Carrera> listar(){
        return this.carreraServicio.listar();
    }
}



