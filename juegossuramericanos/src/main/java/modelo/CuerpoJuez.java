/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class CuerpoJuez {

    private String nombreJuez;
    private int auxiliares;
    private boolean veredicto;

    public CuerpoJuez() {
    }

    public CuerpoJuez(String nombreJuez, int auxiliares) {
        this.nombreJuez = nombreJuez;
        this.auxiliares = auxiliares;
    }

    public String getNombreJuez() {
        return nombreJuez;
    }

    public void setNombreJuez(String nombreJuez) {
        this.nombreJuez = nombreJuez;
    }

    public int getAuxiliares() {
        return auxiliares;
    }

    public void setAuxiliares(int auxiliares) {
        this.auxiliares = auxiliares;
    }
    
     public boolean getveredicto() {
        
        return veredicto;
        
    }

    // MÉTODOS OPERACIONALES

    public void penalizarFalta(Atleta atleta) {
        System.out.println("El juez " + nombreJuez + " penaliza a" + atleta.getNombre());
    }

    
    public Resultado emitirVeredicto(Atleta atleta, Evento evento, String posicionFinal, double puntaje) {
       
        Resultado resul = new Resultado(atleta, evento, posicionFinal, puntaje);
        evento.agregarResultado(resul);
        this.veredicto = true;
        
        System.out.println("El juez " + nombreJuez + " emite el resultado de " + atleta.getNombre() + " (posicion " + posicionFinal +")");
        return resul;
        
    }

   
}
