/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Equipamento {

    private String serie;
    private Estado estadoConsevacion;

    public Equipamento() {
        this.estadoConsevacion = Estado.OPTIMO;
    }

    public Equipamento(String serie, Estado estadoConsevacion) {
        this.serie = serie;
        this.estadoConsevacion = estadoConsevacion;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Estado getEstadoConsevacion() {
        return estadoConsevacion;
    }

    public void setEstadoConsevacion(Estado estadoConsevacion) {
        this.estadoConsevacion = estadoConsevacion;
    }

    
    public boolean revisarMantenimiento() {
        if (estadoConsevacion == Estado.DAÑADO) {
            System.out.println("Equipo " + serie + " dañado, no se puede usar mientras está en mantenimiento");
            return false;
        }
        System.out.println("Equipo " + serie + " revisado, apto para uso (" + estadoConsevacion + ")");
        return true;
    }
}
