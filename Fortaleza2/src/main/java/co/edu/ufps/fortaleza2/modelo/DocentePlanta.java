/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.fortaleza2.modelo;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class DocentePlanta extends Docente{
    
    private double salBasico;
    private int puntosSalario;
    private double valPunto;
    private String categoria;
    private int nResolucion;
    private LocalDate fecha;

    public DocentePlanta() {
    }

    public DocentePlanta(double salBasico, int puntosSalario, double valPunto, String categoria, int nResolucion, LocalDate fecha, int codigo, String nombre, String titulo, String departamento) {
        super(codigo, nombre, titulo, departamento);
        this.salBasico = salBasico;
        this.puntosSalario = puntosSalario;
        this.valPunto = valPunto;
        this.categoria = categoria;
        this.nResolucion = nResolucion;
        this.fecha = fecha;
    }
    
    @Override
    public double calcularSalario(){
        double salMensual=0;
        
        salMensual= salBasico+(puntosSalario*valPunto);
        return salMensual;
    }
    
    //get

    public double getSalBasico() {
        return salBasico;
    }

    public int getPuntosSalario() {
        return puntosSalario;
    }

    public double getValPunto() {
        return valPunto;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getnResolucion() {
        return nResolucion;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    //set

    public void setSalBasico(double salBasico) {
        this.salBasico = salBasico;
    }

    public void setPuntosSalario(int puntosSalario) {
        this.puntosSalario = puntosSalario;
    }

    public void setValPunto(double valPunto) {
        this.valPunto = valPunto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setnResolucion(int nResolucion) {
        this.nResolucion = nResolucion;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    
}
