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
public class PerfilCriminal extends Individuo{
    
    private String alias;
    private String investigaciones;
    private String formaOperar;
    private String identificadorCriminal;
    private String zonaInfluencia;

    private ArrayList<RegistroEvidencia> evidencias;
    private ArrayList<OrganizacionArmada> organizaciones;

    private EspecialistaExplosivos especialista;

    public PerfilCriminal(
            String identificacion,
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
            EstadoIndividuo estado,
            String alias,
            String investigaciones,
            String formaOperar,
            String identificadorCriminal,
            String zonaInfluencia) {

        super(
                identificacion,
                apellidos,
                nombres,
                nacionalidad,
                altura,
                sexo,
                nacimiento,
                sangre,
                lugarNacimiento,
                expedicionDocumento,
                lugarExpedicion,
                estado
        );

        this.alias = alias;
        this.investigaciones = investigaciones;
        this.formaOperar = formaOperar;
        this.identificadorCriminal = identificadorCriminal;
        this.zonaInfluencia = zonaInfluencia;

        evidencias = new ArrayList<>();
        organizaciones = new ArrayList<>();
    }

    public void agregarEvidencia(RegistroEvidencia evidencia) {
        evidencias.add(evidencia);
    }

    public void agregarOrganizacion(OrganizacionArmada organizacion) {
        organizaciones.add(organizacion);
    }

    public void asignarEspecialista(EspecialistaExplosivos especialista) {
        this.especialista = especialista;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("");
        System.out.println("========== PERFIL CRIMINAL ==========");

        super.mostrarInformacion();

        System.out.println("Alias: " + alias);
        System.out.println("Investigaciones: " + investigaciones);
        System.out.println("Forma de operar: " + formaOperar);
        System.out.println("Identificador criminal: " + identificadorCriminal);
        System.out.println("Zona de influencia: " + zonaInfluencia);
        System.out.println("");
        System.out.println("Evidencias:");

        for (RegistroEvidencia evidencia : evidencias) {
            evidencia.mostrarInformacion();
        }
        System.out.println("");
        System.out.println("Organizaciones relacionadas:");

        for (OrganizacionArmada organizacion : organizaciones) {
            System.out.println("- " + organizacion.getNombre());
        }

        if (especialista != null) {
            System.out.println("");
            System.out.println("Especialista en explosivos:");
            especialista.mostrarInformacion();
        }
    }

    
}
