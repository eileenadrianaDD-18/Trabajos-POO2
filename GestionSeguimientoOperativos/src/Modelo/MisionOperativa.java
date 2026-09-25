/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class MisionOperativa {
     private String nombreMision;
    private LocalDate inicio;
    private LocalDate finalizacion;
    private String lugar;
    private String objetivo;
    private String acciones;
    private ArrayList<String> recursos;

    private EstadoMision estado;
    private boolean tieneAutorizacion;
    private boolean amenazaConfirmada;
    private TipoMision tipo;

    private ArrayList<IntegranteMilitar> integrantes;
    private ArrayList<PerfilCriminal> objetivosCriminales;
    private ArrayList<OrganizacionArmada> organizaciones;

    public MisionOperativa(
            String nombreMision,
            LocalDate inicio,
            LocalDate finalizacion,
            String lugar,
            String objetivo,
            String acciones,
            EstadoMision estado,
            boolean tieneAutorizacion,
            boolean amenazaConfirmada,
            TipoMision tipo) {

        this.nombreMision = nombreMision;
        this.inicio = inicio;
        this.finalizacion = finalizacion;
        this.lugar = lugar;
        this.objetivo = objetivo;
        this.acciones = acciones;
        this.estado = estado;
        this.tieneAutorizacion = tieneAutorizacion;
        this.amenazaConfirmada = amenazaConfirmada;
        this.tipo = tipo;

        recursos = new ArrayList<>();
        integrantes = new ArrayList<>();
        objetivosCriminales = new ArrayList<>();
        organizaciones = new ArrayList<>();
    }

    public void agregarRecurso(String recurso) {
        recursos.add(recurso);
    }

    public void agregarIntegrante(IntegranteMilitar militar) {
        integrantes.add(militar);
    }

    public void agregarObjetivo(PerfilCriminal criminal) {
        objetivosCriminales.add(criminal);
    }

    public void agregarOrganizacion(OrganizacionArmada organizacion) {
        organizaciones.add(organizacion);
    }

    public void mostrarInformacion() {

        System.out.println("");
        System.out.println("======================================");
        System.out.println("          MISION OPERATIVA");
        System.out.println("======================================");

        System.out.println("Nombre: " + nombreMision);
        System.out.println("Inicio: " + inicio);
        System.out.println("Finalizacion: " + finalizacion);
        System.out.println("Lugar: " + lugar);
        System.out.println("Objetivo: " + objetivo);
        System.out.println("Acciones: " + acciones);
        System.out.println("Estado: " + estado);
        System.out.println("Autorizada: " + tieneAutorizacion);
        System.out.println("Amenaza confirmada: " + amenazaConfirmada);
        System.out.println("Tipo: " + tipo);
        System.out.println("");
        System.out.println("--- RECURSOS ---");

        for (String recurso : recursos) {
            System.out.println("- " + recurso);
        }
        System.out.println("");
        System.out.println("--- PERSONAL MILITAR ---");

        for (IntegranteMilitar militar : integrantes) {
            System.out.println("- " + militar.getNombreCompleto());
        }
        System.out.println("");
        System.out.println("--- OBJETIVOS ---");

        for (PerfilCriminal criminal : objetivosCriminales) {
            System.out.println("- " + criminal.getNombres()
                    + " " + criminal.getApellidos());
        }
        System.out.println("");
        System.out.println("--- ORGANIZACIONES ---");

        for (OrganizacionArmada organizacion : organizaciones) {
            System.out.println("- " + organizacion.getNombre());
        }
    }
}
