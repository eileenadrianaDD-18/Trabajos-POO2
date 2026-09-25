/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Modelo.ActivacionExplosivo;
import Modelo.AreaExplosivos;
import Modelo.CategoriaMilitar;
import Modelo.DispositivoExplosivo;
import Modelo.EspecialistaExplosivos;
import Modelo.EstadoIndividuo;
import Modelo.EstadoMision;
import Modelo.FuncionMilitar;
import Modelo.IntegranteMilitar;
import Modelo.MisionOperativa;
import Modelo.OrganizacionArmada;
import Modelo.PerfilCriminal;
import Modelo.RegistroEvidencia;
import Modelo.Sexo;
import Modelo.SustanciaExplosiva;
import Modelo.TipoDispositivo;
import Modelo.TipoMision;
import Modelo.TipoSangre;
import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio de Angel
        /*
        Sistema de gestion  y seguimiento de operativos de seguridad sobre criminales
        */
        
        
        RegistroEvidencia evidencia = new RegistroEvidencia(
                "Documento encontrado",
                "Documento relacionado con una investigacion"
        );


        OrganizacionArmada organizacion = new OrganizacionArmada(
                "Organizacion Alfa",
                "Region Andina"
        );

        organizacion.agregarDepartamento("Norte de Santander");
        organizacion.agregarDepartamento("Santander");


        DispositivoExplosivo dispositivo = new DispositivoExplosivo(
                TipoDispositivo.IMPROVISADO,
                SustanciaExplosiva.OTRA,
                ActivacionExplosivo.ELECTRICA,
                10,
                20,
                5
        );


        EspecialistaExplosivos especialista =
                new EspecialistaExplosivos(
                        true,
                        true,
                        true,
                        false,
                        AreaExplosivos.MANEJO
                );

        especialista.agregarDispositivo(dispositivo);


        PerfilCriminal criminal = new PerfilCriminal(

                "123456",

                "Gomez",

                "Carlos",

                "Colombiano",

                1.75,

                Sexo.MASCULINO,

                LocalDate.of(1985, 5, 10),

                TipoSangre.O_POSITIVO,

                "Cucuta",

                LocalDate.of(2005, 6, 15),

                "Cucuta",

                EstadoIndividuo.VIVO,

                "Alias Alfa",

                "Investigaciones por varios delitos",

                "Uso de explosivos",

                "Firma Alfa",

                "Zona fronteriza"
        );


      
        criminal.agregarEvidencia(evidencia);

        criminal.agregarOrganizacion(organizacion);

        criminal.asignarEspecialista(especialista);



        IntegranteMilitar militar1 =
                new IntegranteMilitar(
                        "Juan Perez",
                        "1001",
                        FuncionMilitar.EJECUTAR,
                        CategoriaMilitar.SOLDADO
                );

        IntegranteMilitar militar2 =
                new IntegranteMilitar(
                        "Pedro Lopez",
                        "1002",
                        FuncionMilitar.SUPERVISAR,
                        CategoriaMilitar.OFICIAL
                );


        MisionOperativa mision =
                new MisionOperativa(

                        "Operacion Alfa",

                        LocalDate.of(2026, 9, 23),

                        LocalDate.of(2026, 9, 25),

                        "Cucuta",

                        "Localizar al objetivo",

                        "Seguimiento y captura",

                        EstadoMision.PLANEADA,

                        true,

                        true,

                        TipoMision.CAPTURA
                );



        mision.agregarRecurso("Vehiculo");
        mision.agregarRecurso("Equipo de comunicacion");

        mision.agregarIntegrante(militar1);
        mision.agregarIntegrante(militar2);

        mision.agregarObjetivo(criminal);

        mision.agregarOrganizacion(organizacion);


        mision.mostrarInformacion();

        System.out.println("\n======================================");
        System.out.println("       INFORMACION DEL OBJETIVO");
        System.out.println("======================================");

        criminal.mostrarInformacion();
    }
    
}
