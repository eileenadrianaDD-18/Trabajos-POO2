/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DELL
 */
public class RegistroEvidencia {
    private String descripcion;
    private String detalles;

    public RegistroEvidencia(String descripcion, String detalles) {
        this.descripcion = descripcion;
        this.detalles = detalles;
    }

    public void mostrarInformacion() {

        System.out.println("Descripcion: " + descripcion);
        System.out.println("Detalles: " + detalles);
    } 
}
