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
public class OrganizacionArmada {
    private String nombre;
    private String zonaPresencia;
    private ArrayList<String> departamentos;

    public OrganizacionArmada(String nombre, String zonaPresencia) {

        this.nombre = nombre;
        this.zonaPresencia = zonaPresencia;
        departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(String departamento) {
        departamentos.add(departamento);
    }

    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Zona de presencia: " + zonaPresencia);

        System.out.println("Departamentos:");

        for (String departamento : departamentos) {
            System.out.println("- " + departamento);
        }
    }

    public String getNombre() {
        return nombre;
    }
}
