/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Evento {

    private Categoria categoriaGenero;
    private LocalDateTime fecha;
    private FaseEvento fase;
    private Sede sedeDeportiva;
    private ArrayList<Equipamento> equipamiento;
    private Juez juez;
    private ArrayList<Resultado> resultados;
    private boolean enCompetencia;

    public Evento() {
        this.equipamiento = new ArrayList<>();
        this.resultados = new ArrayList<>();
    }

    public Evento(Categoria categoriaGenero, LocalDateTime fecha, FaseEvento fase, Sede sedeDeportiva) {
        this();
        this.categoriaGenero = categoriaGenero;
        this.fecha = fecha;
        this.fase = fase;
        this.sedeDeportiva = sedeDeportiva;
    }

    public Categoria getCategoriaGenero() {
        return categoriaGenero;
    }

    public void setCategoriaGenero(Categoria categoriaGenero) {
        this.categoriaGenero = categoriaGenero;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public FaseEvento getFase() {
        return fase;
    }

    public void setFase(FaseEvento fase) {
        this.fase = fase;
    }

    public Sede getSedeDeportiva() {
        return sedeDeportiva;
    }

    public void setSedeDeportiva(Sede sedeDeportiva) {
        this.sedeDeportiva = sedeDeportiva;
    }

    public ArrayList<Equipamento> getEquipamiento() {
        return equipamiento;
    }

    public void agregarEquipamiento(Equipamento equipamento) {
        this.equipamiento.add(equipamento);
    }

    public Juez getJuez() {
        return juez;
    }

    public void setJuez(Juez juez) {
        this.juez = juez;
    }

    public ArrayList<Resultado> getResultados() {
        return resultados;
    }

   
    
      public boolean getEnCompetencia() {
        
        return enCompetencia;
        
    }
      public void setEnCompetencia(boolean enCompetencia) {
        this.enCompetencia = enCompetencia;
    }

    // Métodos operacionales

     public void agregarResultado(Resultado resultado) {
         
        this.resultados.add(resultado);
        
    }
     
    public void iniciarCompetencia() {
        
        this.enCompetencia = true;
        System.out.println("El evento inicia su competencia en la fase: " + fase);
    
    }

   
    public void finalizarCompetencia() {
        
        this.enCompetencia = false;
        System.out.println("Ha finalizado la competencia");
        
    }

  
    
    public boolean validarFase() {
        
        return this.fase == FaseEvento.FINAL;
        
    }
}
