/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.ArrayList;


public class Atleta extends Miembro {

    private double peso;
    private double estatura;
    private String acto;
    private ArrayList<Clasificacion> registros;

    public Atleta() {     
        this.registros = new ArrayList<>();
    }

    public Atleta(String nombre, Date fechaNacimiento, String pasaporte, double peso, double estatura, String acto) {
        super(nombre, fechaNacimiento, pasaporte);
        this.peso = peso;
        this.estatura = estatura;
        this.acto = acto;  
         this.registros = new ArrayList<>();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getActo() {
        return acto;
    }

    public void setActo(String acto) {
        this.acto = acto;
    }

    public ArrayList<Clasificacion> getRegistros() {
        return registros;
    }

   
    public void agregarRegistroClasificacion(Clasificacion registro) {
        this.registros.add(registro);
    }

    
    public void entrenar() {
        
        System.out.println(getNombre() + " está entrenando " + acto);
        
    }

}
