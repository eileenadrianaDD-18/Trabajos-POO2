/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class Individuo {
     private String imagen;
    private String identificacion;
    private String apellidos;
    private String nombres;
    private String nacionalidad;
    private double altura;
    private Sexo sexo;
    private LocalDate nacimiento;
    private TipoSangre sangre;
    private String lugarNacimiento;
    private LocalDate expedicionDocumento;
    private String lugarExpedicion;
    private EstadoIndividuo estado;

    public Individuo(String identificacion,
            String apellidos,
            String nombres,
            String nacionalidad,
            double altura,
            Sexo sexo,
            LocalDate nacimiento,
            TipoSangre sangre,
            String lugarNacimiento,
            LocalDate expedicionDocumento,
            String lugarExpedicion,
            EstadoIndividuo estado) {

        this.identificacion = identificacion;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.nacionalidad = nacionalidad;
        this.altura = altura;
        this.sexo = sexo;
        this.nacimiento = nacimiento;
        this.sangre = sangre;
        this.lugarNacimiento = lugarNacimiento;
        this.expedicionDocumento = expedicionDocumento;
        this.lugarExpedicion = lugarExpedicion;
        this.estado = estado;
    }

    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombres + " " + apellidos);
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("Fecha de nacimiento: " + nacimiento);
        System.out.println("Tipo de sangre: " + sangre);
        System.out.println("Lugar de nacimiento: " + lugarNacimiento);
        System.out.println("Estado: " + estado);
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }
}
