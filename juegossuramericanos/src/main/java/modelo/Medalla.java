/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Medalla {

    private TipoMaterial tipoMaterial;
    private double pesoGramos;
    private Atleta atleta;

    public Medalla(TipoMaterial tipoMaterial, double pesoGramos) {
        this.tipoMaterial = tipoMaterial;
        this.pesoGramos = pesoGramos;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }

    public double getPesoGramos() {
        return pesoGramos;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    
    public void otorgarAtleta(Atleta atleta) {
        this.atleta = atleta;
        System.out.println("Medalla de " + tipoMaterial + " otorgada a " + atleta.getNombre());
    }
}
