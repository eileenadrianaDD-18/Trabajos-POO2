/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Resultado {

    private Atleta atleta;
    private Evento evento;
    private String posicionFinal;
    private double puntaje;

    public Resultado(Atleta atleta, Evento evento, String posicionFinal, double puntaje) {
        this.atleta = atleta;
        this.evento = evento;
        this.posicionFinal = posicionFinal;
        this.puntaje = puntaje;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public Evento getEvento() {
        return evento;
    }

    public String getPosicionFinal() {
        return posicionFinal;
    }

    public void setPosicionFinal(String posicionFinal) {
        this.posicionFinal = posicionFinal;
    }

    public double getpuntaje() {
        return puntaje;
    }

    public void setpuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    
    public String calcularPosicionRanking() {
        System.out.println(atleta.getNombre() + " ocupó la posición " + posicionFinal + " con un puntaje de " + puntaje);
        return posicionFinal;
    }


    public void imprimirDiploma() {
        if ("1".equals(posicionFinal) || "2".equals(posicionFinal) || "3".equals(posicionFinal)) {
        
            System.out.println("Diploma entregado a " + atleta.getNombre()+ " - Puesto " + posicionFinal);
        } else {
            System.out.println(atleta.getNombre() + " no entró en el podio, por lo que no obtiene diploma");
        
        }
    }
}
