/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Carrera;

/**
 *
 * @author erika
 */
public class CarreraServicio implements ICarreraServicio {

    public final List<Carrera> carreraList = new ArrayList<>();
    
    
    @Override
    public Carrera crear(Carrera c) {
        this.carreraList.add(c);
        return c;
    }

    @Override
    public Carrera modificar(int n, Carrera c) {
        this.carreraList.set(this.buscarPosicion(n),c);
        return c;
    }

    @Override
    public Carrera eliminar(int n) {
        var carrera = this.carreraList.get(this.buscarPosicion(n));
        this.carreraList.remove(this.buscarPosicion(n));
        System.out.println(carrera.toString()); 
        return carrera;
    }

    @Override
    public List<Carrera> listar() {
        return this.carreraList;
    }

    @Override
    public int buscarPosicion(int n) {
            var posicion=-1;
        var i=0;
        for(var auxCarrera:this.carreraList){
            if(auxCarrera.getCodigo()==n){
                posicion=i;
                break;
            }
            i++;
        }
        return posicion;
        
    }
    
}
