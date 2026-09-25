/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DELL
 */
public class DispositivoExplosivo {
    private TipoDispositivo tipo;
    private SustanciaExplosiva sustancia;
    private ActivacionExplosivo activacion;
    private double calor;
    private double presion;
    private double radiacion;

    public DispositivoExplosivo(
            TipoDispositivo tipo,
            SustanciaExplosiva sustancia,
            ActivacionExplosivo activacion,
            double calor,
            double presion,
            double radiacion) {

        this.tipo = tipo;
        this.sustancia = sustancia;
        this.activacion = activacion;
        this.calor = calor;
        this.presion = presion;
        this.radiacion = radiacion;
    }

    public void mostrarInformacion() {

        System.out.println("Tipo: " + tipo);
        System.out.println("Sustancia: " + sustancia);
        System.out.println("Activacion: " + activacion);
        System.out.println("Calor: " + calor);
        System.out.println("Presion: " + presion);
        System.out.println("Radiacion: " + radiacion);
    }
}
