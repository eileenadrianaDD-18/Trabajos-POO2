/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


import java.util.ArrayList;


public class DelegacionOficial {

    private Atleta abanderado;
    private int cantidadIntegrantes;
    private double presupuestoAsignado;
    private ArrayList<Miembro> miembros;
    private boolean llegoALugar;

    public DelegacionOficial() {
        this.miembros = new ArrayList<>();
    }

    public DelegacionOficial(double presupuestoAsignado) {
        this.miembros = new ArrayList<>();
        this.presupuestoAsignado = presupuestoAsignado;
    }

    public Atleta getAbanderado() {
        return abanderado;
    }

    public void setAbanderado(Atleta abanderado) {
        this.abanderado = abanderado;
    }

    public int getCantidadIntegrantes() {
        return cantidadIntegrantes;
    }

    public double getPresupuestoAsignado() {
        return presupuestoAsignado;
    }

    public void setPresupuestoAsignado(double presupuestoAsignado) {
        this.presupuestoAsignado = presupuestoAsignado;
    }

    public ArrayList<Miembro> getMiembros() {
        return miembros;
    }

    
    
    public void agregarMiembro(Miembro miembro) {
        this.miembros.add(miembro);
        this.cantidadIntegrantes = this.miembros.size();
    }

    
    public void registrarLlegada() {
        this.llegoALugar = true;
        System.out.println("La delegación con el abanderado " + abanderado.getNombre() + " llegó a la villa olimpica");
    }

    
    public boolean desfilar() {
        
        if (!llegoALugar) {
            
            System.out.println("La delegación aún no ha llegado a la villa olimpica");
            return false;
            
        }
        
       String nombreAbanderado;

if (abanderado != null) {
    
    nombreAbanderado = abanderado.getNombre();
    
} else {
    
   System.out.println("Aún no hay un abanderado asignado");
   return false;
    
}

System.out.println("La delegación desfila en la ceremonia de apertura, liderada por el abanderado " + nombreAbanderado);
return true;

    }
}
