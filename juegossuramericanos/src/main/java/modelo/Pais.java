/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



public class Pais {
    
    private String codigo;
    private String nombre;
    private String ciudadCapital;
    private ComiteOlimpico comite;

    public Pais() {
    }

    public Pais(String codigo, String nombre, String ciudadCapital, ComiteOlimpico comite) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudadCapital = ciudadCapital;
        this.comite = comite;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadCapital() {
        return ciudadCapital;
    }

    public void setCiudadCapital(String ciudadCapital) {
        this.ciudadCapital = ciudadCapital;
    }

    public ComiteOlimpico getComite() {
        return comite;
    }

    public void setComite(ComiteOlimpico comite) {
        this.comite = comite;
    }
    
    // metodos operacionales
}
