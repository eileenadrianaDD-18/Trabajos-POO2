/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.fortaleza2.modelo;
/*
El sistema debe permitir mostrar la informacion de cada docente
El salario calculado para cada docente
El tipo de vinculacion de cada docente (deoende de qu tipo 
de docente es)
*/

/**
 *
 * @author DELL
 */
public class Docente {
    
    private int codigo;
    private String nombre;
    private String titulo;
    private String departamento;

    public Docente() {
    }

    public Docente(int codigo, String nombre, String titulo, String departamento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.titulo = titulo;
        this.departamento = departamento;
    }
    
    public double calcularSalario(){
        return 0;
    }
    
    //get

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    //set

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
