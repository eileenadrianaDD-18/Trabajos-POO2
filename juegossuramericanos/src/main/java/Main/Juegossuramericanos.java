/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Main;

import java.time.LocalDateTime;
import java.util.Date;
import modelo.Atleta;
import modelo.Categoria;
import modelo.Clasificacion;
import modelo.ComiteOlimpico;
import modelo.Juez;
import modelo.DelegacionOficial;
import modelo.Deporte;
import modelo.Disciplina;
import modelo.Edicion;
import modelo.Entrenador;
import modelo.Equipamento;
import modelo.Estado;
import modelo.Evento;
import modelo.FaseEvento;
import modelo.Medalla;
import modelo.Ganador;
import modelo.NivelCertificacion;
import modelo.Organizador;
import modelo.Resultado;
import modelo.Sede;
import modelo.TipoMaterial;


public class Juegossuramericanos {

    public static void main(String[] args) {

        System.out.println("JUEGOS SURAMERICANOS");
       

        System.out.println();
        Organizador organizador = new Organizador("ODESUR");
        Edicion edicion = new Edicion(2026, "Santa Fe", "Estadio Ciudad del Deporte", "Un mismo continente, un mismo sueño");
        organizador.agregarEdicion(edicion);
        organizador.inaugurarJuegos(edicion);

        
        System.out.println();
        ComiteOlimpico arg = new ComiteOlimpico("Comite Olimpico Argentino", "ARG", "Diego Maradona");
        ComiteOlimpico col = new ComiteOlimpico("Comite Olimpico Colombiano", "COL", "Luis Díaz");
        arg.inscribirPais(edicion);
        col.inscribirPais(edicion);
        arg.financiarParticipacion(500000);
        col.financiarParticipacion(450000);

        
        System.out.println();
        DelegacionOficial deleArg = arg.getDelegacion();
        DelegacionOficial deleCol = col.getDelegacion();

        
        Atleta atletaArg = new Atleta("Lionela Messie", new Date(), "1234", 58.5, 1.70, "Resistencia");
        Entrenador entrenadorArg = new Entrenador("Carlos Ibarra", new Date(), "654321",NivelCertificacion.NIVEL_3, "Plan de resistencia aerobica");

        Atleta atletaCol = new Atleta("James Rodriguez", new Date(), "987654",63.0, 1.75, "Relevos");
        Entrenador entrenadorCol = new Entrenador("Diana Rios", new Date(), "456789",NivelCertificacion.NIVEL_2, "Tecnica de partida");

        deleArg.agregarMiembro(atletaArg);
        deleArg.agregarMiembro(entrenadorArg);
        deleArg.setAbanderado(atletaArg);

        deleCol.agregarMiembro(atletaCol);
        deleCol.agregarMiembro(entrenadorCol);
        deleCol.setAbanderado(atletaCol);

        deleArg.registrarLlegada();
        deleArg.desfilar();
        deleCol.registrarLlegada();
        deleCol.desfilar();
        
         System.out.println();
        atletaArg.entrenar();
        entrenadorArg.planificarEstrategias();
        atletaCol.entrenar();
        entrenadorCol.planificarEstrategias();

        
        System.out.println();
        Clasificacion clasifArg = new Clasificacion("10.21s", new Date());
        atletaArg.agregarRegistroClasificacion(clasifArg);
        
               
        System.out.println(atletaArg.getNombre() + " -> clasifica: " + clasifArg.validarRequisitos());

        Clasificacion clasifCol = new Clasificacion("10.15s", new Date());
        atletaCol.agregarRegistroClasificacion(clasifCol);
       
        System.out.println(atletaCol.getNombre() + " -> clasificacion aprobada: " +  clasifCol.validarRequisitos());

        
        System.out.println();
        Deporte atletismo = new Deporte("Atletismo", "World Athletics");
        Disciplina velocidad = new Disciplina("100 metros planos", "Reglamento World Athletics 2026");
        atletismo.agregarDisciplina(velocidad);
        velocidad.actualizarNormativas("Reglamento 2026 - Nueva Version Revisada");

       
        Sede estadioPrincipal = new Sede("Estadio Ciudad del Deporte", 40000, "Av. Mariscal Lopez, Santa Fe");

       
        Evento f100m = new Evento(Categoria.MASCULINO,LocalDateTime.of(2026, 3, 15, 18, 30), FaseEvento.FINAL, null);
        velocidad.programarEvento(f100m);
        estadioPrincipal.asignarSede(f100m);
        System.out.println("La sede puede tener 35000 espectadores: " + estadioPrincipal.verificarCapacidad(35000));

   
        Equipamento vallas = new Equipamento("Equipamento 1", Estado.OPTIMO);
        f100m.agregarEquipamiento(vallas);
        vallas.revisarMantenimiento();

        
        Juez juecesFinal = new Juez("Roberto Sanchez", 4 , false);
        f100m.setJuez(juecesFinal);

       
        System.out.println();
        f100m.iniciarCompetencia();
        juecesFinal.penalizarFalta(atletaCol);
        Resultado resultadoArg = juecesFinal.emitirVeredicto(atletaArg, f100m, "1", 99.8);
        Resultado resultadoCol = juecesFinal.emitirVeredicto(atletaCol, f100m, "2", 98.4);
        f100m.finalizarCompetencia();

        System.out.println();
        resultadoArg.calcularPosicionRanking();
        resultadoArg.imprimirDiploma();
        resultadoCol.calcularPosicionRanking();
        resultadoCol.imprimirDiploma();

        
        System.out.println();
        if (f100m.validarFase()) {
            Medalla oro = new Medalla(TipoMaterial.ORO, 500);
            oro.otorgarAtleta(atletaArg);
            Medalla plata = new Medalla(TipoMaterial.PLATA, 480);
            plata.otorgarAtleta(atletaCol);

            Ganador ganadorArg = new Ganador("Argentina");
            ganadorArg.ganar(oro);
            ganadorArg.actualizarTablaPosiciones();

            Ganador ganadorCol = new Ganador("Colombia");
            ganadorCol.ganar(plata);
            ganadorCol.actualizarTablaPosiciones();
        }

        
        System.out.println();
        organizador.clausurarJuegos(edicion);
    }
}
