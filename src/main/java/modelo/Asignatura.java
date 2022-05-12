/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author erika
 */
public class Asignatura {
    private String nombreAsignatura;
    private String nombreProfesor;
    private int numHoras;
    private int costoHora;
    private int numAula;

    public Asignatura(String nombreAsignatura, String nombreProfesor, int numHoras, int costoHora, int numAula) {
        this.nombreAsignatura = nombreAsignatura;
        this.nombreProfesor = nombreProfesor;
        this.numHoras = numHoras;
        this.costoHora = costoHora;
        this.numAula = numAula;
    }
    
    public int obtenerCostoTotal(){
        var retorno = this.getCostoHora()*this.getNumHoras();
        return retorno;
    }
    
    public boolean esAulaCorrecta(int aulaCorrecta){
        var retorno = false;
        if(this.getNumAula()== aulaCorrecta){
            retorno = true;
        }
        return retorno;
    }
    

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public int getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(int costoHora) {
        this.costoHora = costoHora;
    }

    public int getNumAula() {
        return numAula;
    }

    public void setNumAula(int numAula) {
        this.numAula = numAula;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombreAsignatura=" + nombreAsignatura 
                + ", nombreProfesor=" + nombreProfesor + ", numHoras=" 
                + numHoras + ", costoHora=" + costoHora + ", numAula=" 
                + numAula + '}';
    }
    
    
    
    
}
