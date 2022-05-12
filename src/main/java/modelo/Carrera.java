/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author erika
 */
public class Carrera {
    
    private int codigo;
    private String nombre;
    private int numEstudiantes;
    private int duracion;
    private int costo;
    private Asignatura unaMateria;

    public Carrera(int codigo, String nombre, int numEstudiantes, int duracion, int costo, Asignatura unaMateria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numEstudiantes = numEstudiantes;
        this.duracion = duracion;
        this.costo = costo;
        this.unaMateria = unaMateria;
    }

    
    public boolean esCostoso(int valorMax)
    {
        var retorno = false;
        if (this.getCosto()> valorMax){
            retorno= true;
        }
        return retorno;
        
    }
    
    public boolean esNuevaMalla(){
        var retorno = false;
        if(this.getDuracion()==4){
            retorno = true;
        }
        return retorno;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Asignatura getUnaMateria() {
        return unaMateria;
    }

    public void setUnaMateria(Asignatura unaMateria) {
        this.unaMateria = unaMateria;
    }   

    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre 
                + ", numEstudiantes=" + numEstudiantes + ", duracion=" 
                + duracion + ", costo=" + costo + ", unaMateria=" + unaMateria + '}';
    }
    
}
