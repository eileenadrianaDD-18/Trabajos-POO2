/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class EspecialistaExplosivos {
    private boolean manejo;
    private boolean diseno;
    private boolean colocacion;
    private boolean desactivacion;

    private AreaExplosivos especialidad;

    private ArrayList<DispositivoExplosivo> dispositivos;

    public EspecialistaExplosivos(
            boolean manejo,
            boolean diseno,
            boolean colocacion,
            boolean desactivacion,
            AreaExplosivos especialidad) {

        this.manejo = manejo;
        this.diseno = diseno;
        this.colocacion = colocacion;
        this.desactivacion = desactivacion;
        this.especialidad = especialidad;

        dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(DispositivoExplosivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void mostrarInformacion() {

        System.out.println("Experto en manejo: " + manejo);
        System.out.println("Experto en diseño: " + diseno);
        System.out.println("Experto en colocacion: " + colocacion);
        System.out.println("Experto en desactivacion: " + desactivacion);
        System.out.println("Especialidad: " + especialidad);

        System.out.println("Dispositivos relacionados:");

        for (DispositivoExplosivo dispositivo : dispositivos) {
            dispositivo.mostrarInformacion();
        }
    }
}
