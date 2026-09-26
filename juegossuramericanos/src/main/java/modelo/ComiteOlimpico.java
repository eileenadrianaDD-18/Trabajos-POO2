/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class ComiteOlimpico {

    private String nombre;
    private String codigo;
    private String presidente;
    private DelegacionOficial delegacion;

    public ComiteOlimpico() {
        this.delegacion = new DelegacionOficial();
    }

    public ComiteOlimpico(String nombre, String codigo, String presidente) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.presidente = presidente;
        this.delegacion = new DelegacionOficial();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public DelegacionOficial getDelegacion() {
        return delegacion;
    }

    
    public void inscribirPais(Edicion edicion) {
        
       edicion.agregarComite(this);
       
         System.out.println(nombre + " (" + codigo + ") fue inscrito en la edicion " + edicion.getAnioRealizacion());
    
    }
   
    public void financiarParticipacion(double monto) {
        
        delegacion.setPresupuestoAsignado(monto);
        
      System.out.println(nombre + " asignó un presupuesto de " + monto);
        
    }
}
