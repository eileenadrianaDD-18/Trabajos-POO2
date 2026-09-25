/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ufps.sistemadonacion.modelo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DELL
 */
public class SistemaEmergencia {
    


    private List<Pais> paises;
    private List<Departamento> departamentos;
    private List<Municipio> municipios;

    private List<Terremoto> terremotos;

    private List<Persona> personas;
    private List<Damnificado> damnificados;

    private List<Empresa> empresas;
    private List<Donacion> donaciones;

    private List<Organizacion> organizaciones;
    private List<Ayuda> ayudas;




    public SistemaEmergencia() {

        paises = new ArrayList<>();
        departamentos = new ArrayList<>();
        municipios = new ArrayList<>();

        terremotos = new ArrayList<>();

        personas = new ArrayList<>();
        damnificados = new ArrayList<>();

        empresas = new ArrayList<>();
        donaciones = new ArrayList<>();

        organizaciones = new ArrayList<>();
        ayudas = new ArrayList<>();
    }
    
    //paises

    public void registrarPais(Pais pais) {

        if (pais != null) {
            paises.add(pais);
        }
    }

    public List<Pais> consultarPaises() {
        return paises;
    }

//departamentos
    public void registrarDepartamento(Departamento departamento) {

        if (departamento != null) {
            departamentos.add(departamento);
        }
    }

    public List<Departamento> consultarDepartamentos() {
        return departamentos;
    }

//municipios

    public void registrarMunicipio(Municipio municipio) {

        if (municipio != null) {
            municipios.add(municipio);
        }
    }

    public List<Municipio> consultarMunicipios() {
        return municipios;
    }

//terremotos

    public void registrarTerremoto(Terremoto terremoto) {

        if (terremoto != null) {
            terremotos.add(terremoto);
        }
    }

    public List<Terremoto> consultarTerremotos() {
        return terremotos;
    }


//personas

    public void registrarPersona(Persona persona) {

        if (persona != null) {
            personas.add(persona);
        }
    }

    public List<Persona> consultarPersonas() {
        return personas;
    }

//damnificado
    public void registrarDamnificado(Damnificado damnificado) {

        if (damnificado != null) {

            // Como Damnificado hereda de Persona,
            // también lo registramos como Persona.
            damnificados.add(damnificado);
            personas.add(damnificado);
        }
    }

    public List<Damnificado> consultarDamnificados() {
        return damnificados;
    }

//empresas

    public void registrarEmpresa(Empresa empresa) {

        if (empresa != null) {
            empresas.add(empresa);
        }
    }

    public List<Empresa> consultarEmpresas() {
        return empresas;
    }

//donaciones

    public boolean registrarDonacion(Donacion donacion) {

        if (donacion != null && donacion.validarDonacion()) {

            donaciones.add(donacion);

            return true;
        }

        return false;
    }

    public List<Donacion> consultarDonaciones() {
        return donaciones;
    }

//organizaciones

    public void registrarOrganizacion(Organizacion organizacion) {

        if (organizacion != null) {
            organizaciones.add(organizacion);
        }
    }

    public List<Organizacion> consultarOrganizaciones() {
        return organizaciones;
    }

//ayudas

    public void registrarAyuda(Ayuda ayuda) {

        if (ayuda != null) {
            ayudas.add(ayuda);
        }
    }

    public List<Ayuda> consultarAyudas() {
        return ayudas;
    }


    
    /**
     * RELACIONES
     * Relaciona un departamento con un país.
     */
    public void agregarDepartamentoAPais(Pais pais,
                                         Departamento departamento) {

        if (pais != null && departamento != null) {

            pais.agregarDepartamento(departamento);

            if (!paises.contains(pais)) {
                paises.add(pais);
            }

            if (!departamentos.contains(departamento)) {
                departamentos.add(departamento);
            }
        }
    }


    /**
     * Relaciona un municipio con un departamento.
     */
    public void agregarMunicipioADepartamento(
            Departamento departamento,
            Municipio municipio) {

        if (departamento != null && municipio != null) {

            departamento.agregarMunicipio(municipio);

            if (!departamentos.contains(departamento)) {
                departamentos.add(departamento);
            }

            if (!municipios.contains(municipio)) {
                municipios.add(municipio);
            }
        }
    }


    /**
     * Registra una persona dentro de un municipio.
     */
    public void agregarPersonaAMunicipio(
            Municipio municipio,
            Persona persona) {

        if (municipio != null && persona != null) {

            municipio.registrarPersona(persona);

            if (!personas.contains(persona)) {
                personas.add(persona);
            }
        }
    }


    /**
     * Relaciona un terremoto con un municipio afectado.
     */
    public void agregarMunicipioAfectado(
            Terremoto terremoto,
            Municipio municipio) {

        if (terremoto != null && municipio != null) {

            terremoto.agregarMunicipioAfectado(municipio);

            if (!terremotos.contains(terremoto)) {
                terremotos.add(terremoto);
            }

            if (!municipios.contains(municipio)) {
                municipios.add(municipio);
            }
        }
    }


    /**
     * Relaciona una empresa con una donación.
     */
    public void agregarDonacionAEmpresa(
            Empresa empresa,
            Donacion donacion) {

        if (empresa != null && donacion != null) {

            empresa.realizarDonacion(donacion);

            if (!empresas.contains(empresa)) {
                empresas.add(empresa);
            }

            if (!donaciones.contains(donacion)) {
                donaciones.add(donacion);
            }
        }
    }


    /**
     * Relaciona una donación con una organización.
     */
    public void asignarDonacionAOrganizacion(
            Donacion donacion,
            Organizacion organizacion) {

        if (donacion != null && organizacion != null) {

            donacion.asignarOrganizacion(organizacion);

            if (!donaciones.contains(donacion)) {
                donaciones.add(donacion);
            }

            if (!organizaciones.contains(organizacion)) {
                organizaciones.add(organizacion);
            }
        }
    }


    /**
     * Genera una ayuda a partir de una organización.
     */
    public Ayuda generarAyuda(
            Organizacion organizacion,
            TipoAyuda tipo,
            double cantidad) {

        if (organizacion != null && cantidad > 0 && tipo != null) {

            Ayuda ayuda = organizacion.generarAyuda(tipo, cantidad);

            ayudas.add(ayuda);

            return ayuda;
        }

        return null;
    }


    /**
     * Entrega una ayuda a un damnificado.
     */
    public void entregarAyuda(
            Organizacion organizacion,
            Ayuda ayuda,
            Damnificado damnificado) {

        if (organizacion != null
                && ayuda != null
                && damnificado != null) {

            organizacion.entregarAyuda(ayuda, damnificado);

            if (!ayudas.contains(ayuda)) {
                ayudas.add(ayuda);
            }

            if (!damnificados.contains(damnificado)) {
                damnificados.add(damnificado);
            }

            if (!personas.contains(damnificado)) {
                personas.add(damnificado);
            }
        }
    }

}
