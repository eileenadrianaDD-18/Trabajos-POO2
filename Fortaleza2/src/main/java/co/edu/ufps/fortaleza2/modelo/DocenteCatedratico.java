/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.fortaleza2.modelo;

/**
 *
 * @author DELL
 */
public class DocenteCatedratico extends Docente{
    private int nContrato;
    private int nHoras;
    private double valorHora;

    public DocenteCatedratico() {
    }
    
    public DocenteCatedratico(int nContrato, int nHoras, double valorHora, int codigo, String nombre, String titulo, String departamento) {
        super(codigo, nombre, titulo, departamento);
        this.nContrato = nContrato;
        this.nHoras = nHoras;
        this.valorHora = valorHora;
    }
    
    
    
    //calculamos el salario para el docente catedratico
    @Override
    public double calcularSalario(){
        double salMensual=0;
        
        salMensual=nHoras*valorHora*4;
        return salMensual;
    }
    public int getnContrato() {
        return nContrato;
    }

    public int getnHoras() {
        return nHoras;
    }

    public double getValorHora() {
        return valorHora;
    }
    
    //set

    public void setnContrato(int nContrato) {
        this.nContrato = nContrato;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    
    
    
}
