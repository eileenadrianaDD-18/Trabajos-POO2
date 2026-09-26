/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Juez {

    private String nombreJuezPrincipal;
    private int numeroAuxiliares;
    private boolean veredictoEmitido;

    public Juez() {
    }

    public Juez(String nombreJuezPrincipal, int numeroAuxiliares, boolean veredictoEmitido) {
        this.nombreJuezPrincipal = nombreJuezPrincipal;
        this.numeroAuxiliares = numeroAuxiliares;
        this.veredictoEmitido = veredictoEmitido;
    }

    public String getNombreJuezPrincipal() {
        return nombreJuezPrincipal;
    }

    public void setNombreJuezPrincipal(String nombreJuezPrincipal) {
        this.nombreJuezPrincipal = nombreJuezPrincipal;
    }

    public int getNumeroAuxiliares() {
        return numeroAuxiliares;
    }

    public void setNumeroAuxiliares(int numeroAuxiliares) {
        this.numeroAuxiliares = numeroAuxiliares;
    }

     public boolean getVeredictoEmitido() {
            
        return veredictoEmitido;
        
    }
      public void setVeredictoEmitido(boolean veredictoEmitido) {
          
        this.veredictoEmitido = veredictoEmitido;
        
    }

    public void penalizarFalta(Atleta atleta) {
        
        System.out.println("El juez " + nombreJuezPrincipal + " penalizó a " + atleta.getNombre());
    
    }    

    public Resultado emitirVeredicto(Atleta atleta, Evento evento, String posicionFinal, double puntaje) {
        
        Resultado resultado = new Resultado(atleta, evento, posicionFinal, puntaje);
        
        evento.agregarResultado(resultado);
        
        this.veredictoEmitido = true;
        
        System.out.println("El juez " + nombreJuezPrincipal + " emite el veredicto para " + atleta.getNombre() + " (Posicion " + posicionFinal + ")");
        
        return resultado;
        
    }

   
}
