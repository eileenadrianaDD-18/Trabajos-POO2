/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DELL
 */
public class IntegranteMilitar {
      private String nombreCompleto;
    private String numeroServicio;
    private FuncionMilitar funcion;
    private CategoriaMilitar categoria;

    public IntegranteMilitar(
            String nombreCompleto,
            String numeroServicio,
            FuncionMilitar funcion,
            CategoriaMilitar categoria) {

        this.nombreCompleto = nombreCompleto;
        this.numeroServicio = numeroServicio;
        this.funcion = funcion;
        this.categoria = categoria;
    }

    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Numero de servicio: " + numeroServicio);
        System.out.println("Funcion: " + funcion);
        System.out.println("Categoria: " + categoria);
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
}
