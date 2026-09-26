/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;


public class Ganador {

    private String pais;
    private int conteoOro;
    private int conteoPlata;
    private int conteoBronce;
    private List<Medalla> medallas;

    public Ganador() {
        
    }
    
    public Ganador(String pais) {
        this.pais = pais;
        this.medallas = new ArrayList<>();
    }

    public String getPais() {
        return pais;
    }

    public int getConteoOro() {
        return conteoOro;
    }

    public int getConteoPlata() {
        return conteoPlata;
    }

    public int getConteoBronce() {
        return conteoBronce;
    }

    
    public void ganar(Medalla medalla) {
        this.medallas.add(medalla);
        switch (medalla.getTipoMaterial()) {
            case ORO -> conteoOro++;
            case PLATA -> conteoPlata++;
            case BRONCE -> conteoBronce++;
        }
    }

    
    public void actualizarTablaPosiciones() {
        System.out.println("Ganador " + pais + " -> Oro: " + conteoOro + " | Plata: " + conteoPlata + " | Bronce: " + conteoBronce);
    }
}
