/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.fortaleza2.modelo;

/**
 *
 * @author DELL
 */
public class DocenteOcasional extends Docente{
    private double salBasico;

    public DocenteOcasional() {
    }

    public DocenteOcasional(double salBasico, int codigo, String nombre, String titulo, String departamento) {
        super(codigo, nombre, titulo, departamento);
        this.salBasico = salBasico;
    }
    
    @Override
    public double calcularSalario(){
        return salBasico;
    }
    
    //get

    public double getSalBasico() {
        return salBasico;
    }
    
    //set

    public void setSalBasico(double salBasico) {
        this.salBasico = salBasico;
    }
    
    
}
