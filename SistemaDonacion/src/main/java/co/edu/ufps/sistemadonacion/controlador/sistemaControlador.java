/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package co.edu.ufps.sistemadonacion.controlador;


import java.time.LocalDate;
import java.time.LocalTime;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import co.edu.ufps.sistemadonacion.modelo.Ayuda;
import co.edu.ufps.sistemadonacion.modelo.Damnificado;
import co.edu.ufps.sistemadonacion.modelo.Departamento;
import co.edu.ufps.sistemadonacion.modelo.Donacion;
import co.edu.ufps.sistemadonacion.modelo.Empresa;
import co.edu.ufps.sistemadonacion.modelo.Estado;
import co.edu.ufps.sistemadonacion.modelo.Municipio;
import co.edu.ufps.sistemadonacion.modelo.NivelAfectacion;
import co.edu.ufps.sistemadonacion.modelo.Organizacion;
import co.edu.ufps.sistemadonacion.modelo.Pais;
import co.edu.ufps.sistemadonacion.modelo.SistemaEmergencia;
import co.edu.ufps.sistemadonacion.modelo.Terremoto;
import co.edu.ufps.sistemadonacion.modelo.TipoAyuda;
import co.edu.ufps.sistemadonacion.modelo.TipoDonacion;
import co.edu.ufps.sistemadonacion.modelo.TipoOrganizacion;
/**
 * FXML Controller class
 *
 * @author DELL
 */
public class sistemaControlador  {

    /**
     * Initializes the controller class.
     */
    private SistemaEmergencia sistema;

    

    @FXML
    private TextField txtPais;

    @FXML
    private TextField txtDepartamento;

    @FXML
    private TextField txtMunicipio;

    @FXML
    private ComboBox<Pais> cbPais;

    @FXML
    private ComboBox<Departamento> cbDepartamento;

    @FXML
    private ListView<String> listaUbicacion;

    @FXML
    private TextField txtFecha;

    @FXML
    private TextField txtHora;

    @FXML
    private TextField txtProfundidad;

    @FXML
    private TextField txtMagnitud;

    @FXML
    private TextField txtEpicentro;

    @FXML
    private ListView<String> listaTerremotos;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtEstatura;

    @FXML
    private TextField txtPeso;

    @FXML
    private TextField txtIdentificacion;

    @FXML
    private ComboBox<Estado> cbEstado;

    @FXML
    private ComboBox<NivelAfectacion> cbNivel;

    @FXML
    private ListView<String> listaDamnificados;

    @FXML
    private TextField txtEmpresa;

    @FXML
    private TextField txtRepresentanteEmpresa;

    @FXML
    private ListView<String> listaEmpresas;

    @FXML
    private TextField txtOrganizacion;

    @FXML
    private TextField txtRepresentanteOrganizacion;

    @FXML
    private ComboBox<TipoOrganizacion> cbTipoOrganizacion;

    @FXML
    private ListView<String> listaOrganizaciones;

    @FXML
    private ComboBox<Empresa> cbEmpresa;

    @FXML
    private ComboBox<Organizacion> cbOrganizacion;

    @FXML
    private TextField txtCantidadDonacion;

    @FXML
    private ComboBox<TipoDonacion> cbTipoDonacion;

    @FXML
    private ListView<String> listaDonaciones;

    @FXML
    private ComboBox<Organizacion> cbOrganizacionAyuda;

    @FXML
    private ComboBox<Damnificado> cbDamnificadoAyuda;

    @FXML
    private TextField txtCantidadAyuda;

    @FXML
    private ComboBox<TipoAyuda> cbTipoAyuda;

    @FXML
    private ListView<String> listaAyudas;

    @FXML
    public void initialize() {

        sistema = new SistemaEmergencia();

        cbEstado.setItems(
                FXCollections.observableArrayList(
                        Estado.values()
                )
        );

        cbNivel.setItems(
                FXCollections.observableArrayList(
                        NivelAfectacion.values()
                )
        );

        cbTipoOrganizacion.setItems(
                FXCollections.observableArrayList(
                        TipoOrganizacion.values()
                )
        );

        cbTipoDonacion.setItems(
                FXCollections.observableArrayList(
                        TipoDonacion.values()
                )
        );

        cbTipoAyuda.setItems(
                FXCollections.observableArrayList(
                        TipoAyuda.values()
                )
        );

        txtFecha.setText(
                LocalDate.now().toString()
        );

        txtHora.setText(
                LocalTime.now().withSecond(0).withNano(0).toString()
        );
    }

    @FXML
    private void registrarPais() {

        String nombre = txtPais.getText();

        if (nombre.isEmpty()) {
            mostrarMensaje("Ingrese el nombre del país.");
            return;
        }

        Pais pais = new Pais(nombre);

        sistema.registrarPais(pais);

        txtPais.clear();

        actualizarPaises();

        mostrarUbicaciones();
    }
 

    @FXML
    private void registrarDepartamento() {

        String nombre = txtDepartamento.getText();
        Pais pais = cbPais.getValue();

        if (nombre.isEmpty() || pais == null) {
            mostrarMensaje(
                    "Ingrese el departamento y seleccione un país."
            );
            return;
        }

        Departamento departamento =
                new Departamento(nombre);

        sistema.agregarDepartamentoAPais(
                pais,
                departamento
        );

        txtDepartamento.clear();

        actualizarPaises();
        actualizarDepartamentos();

        mostrarUbicaciones();
    }

    @FXML
    private void registrarMunicipio() {

        String nombre = txtMunicipio.getText();

        Departamento departamento =
                cbDepartamento.getValue();

        if (nombre.isEmpty() || departamento == null) {
            mostrarMensaje(
                    "Ingrese el municipio y seleccione un departamento."
            );
            return;
        }

        Municipio municipio =
                new Municipio(nombre);

        sistema.agregarMunicipioADepartamento(
                departamento,
                municipio
        );

        txtMunicipio.clear();

        actualizarDepartamentos();

        mostrarUbicaciones();
    }


    @FXML
    private void registrarTerremoto() {

        try {

            LocalDate fecha =
                    LocalDate.parse(
                            txtFecha.getText()
                    );

            LocalTime hora =
                    LocalTime.parse(
                            txtHora.getText()
                    );

            double profundidad =
                    Double.parseDouble(
                            txtProfundidad.getText()
                    );

            double magnitud =
                    Double.parseDouble(
                            txtMagnitud.getText()
                    );

            String epicentro =
                    txtEpicentro.getText();

            if (epicentro.isEmpty()) {

                mostrarMensaje(
                        "Ingrese el epicentro."
                );

                return;
            }

            Terremoto terremoto =
                    new Terremoto(
                            fecha,
                            hora,
                            profundidad,
                            magnitud,
                            epicentro
                    );

            sistema.registrarTerremoto(
                    terremoto
            );

            mostrarTerremotos();

            txtProfundidad.clear();
            txtMagnitud.clear();
            txtEpicentro.clear();

        } catch (Exception e) {

            mostrarMensaje(
                    "Revise los datos del terremoto."
            );
        }
    }


    @FXML
    private void registrarDamnificado() {

        try {

            String nombre =
                    txtNombre.getText();

            int edad =
                    Integer.parseInt(
                            txtEdad.getText()
                    );

            double estatura =
                    Double.parseDouble(
                            txtEstatura.getText()
                    );

            double peso =
                    Double.parseDouble(
                            txtPeso.getText()
                    );

            int identificacion =
                    Integer.parseInt(
                            txtIdentificacion.getText()
                    );

            Estado estado =
                    cbEstado.getValue();

            NivelAfectacion nivel =
                    cbNivel.getValue();


            if (nombre.isEmpty()
                    || estado == null
                    || nivel == null) {

                mostrarMensaje(
                        "Complete todos los datos."
                );

                return;
            }


            Damnificado damnificado =
                    new Damnificado(
                            nombre,
                            edad,
                            estatura,
                            peso,
                            identificacion,
                            estado,
                            nivel
                    );


            sistema.registrarDamnificado(
                    damnificado
            );


            mostrarDamnificados();

            actualizarDamnificados();

            txtNombre.clear();
            txtEdad.clear();
            txtEstatura.clear();
            txtPeso.clear();
            txtIdentificacion.clear();

        } catch (Exception e) {

            mostrarMensaje(
                    "Revise los datos ingresados."
            );
        }
    }

    @FXML
    private void registrarEmpresa() {

        String nombre =
                txtEmpresa.getText();

        String representante =
                txtRepresentanteEmpresa.getText();


        if (nombre.isEmpty()
                || representante.isEmpty()) {

            mostrarMensaje(
                    "Complete los datos de la empresa."
            );

            return;
        }


        Empresa empresa =
                new Empresa(
                        nombre,
                        representante
                );


        sistema.registrarEmpresa(
                empresa
        );


        actualizarEmpresas();

        actualizarEmpresasCombo();

        txtEmpresa.clear();
        txtRepresentanteEmpresa.clear();
    }


    @FXML
    private void registrarOrganizacion() {

        String nombre =
                txtOrganizacion.getText();

        String representante =
                txtRepresentanteOrganizacion
                        .getText();

        TipoOrganizacion tipo =
                cbTipoOrganizacion.getValue();


        if (nombre.isEmpty()
                || representante.isEmpty()
                || tipo == null) {

            mostrarMensaje(
                    "Complete los datos de la organización."
            );

            return;
        }


        Organizacion organizacion =
                new Organizacion(
                        nombre,
                        representante,
                        tipo
                );


        sistema.registrarOrganizacion(
                organizacion
        );


        actualizarOrganizaciones();

        actualizarOrganizacionesCombo();

        txtOrganizacion.clear();
        txtRepresentanteOrganizacion.clear();
    }


    @FXML
    private void registrarDonacion() {

        try {

            Empresa empresa =
                    cbEmpresa.getValue();

            Organizacion organizacion =
                    cbOrganizacion.getValue();

            double cantidad =
                    Double.parseDouble(
                            txtCantidadDonacion
                                    .getText()
                    );

            TipoDonacion tipo =
                    cbTipoDonacion.getValue();


            if (empresa == null
                    || organizacion == null
                    || tipo == null) {

                mostrarMensaje(
                        "Seleccione empresa, organización y tipo."
                );

                return;
            }


            Donacion donacion =
                    new Donacion(
                            LocalDate.now(),
                            cantidad,
                            tipo
                    );


            if (!sistema.registrarDonacion(
                    donacion)) {

                mostrarMensaje(
                        "La donación no es válida."
                );

                return;
            }


            sistema.agregarDonacionAEmpresa(
                    empresa,
                    donacion
            );


            sistema.asignarDonacionAOrganizacion(
                    donacion,
                    organizacion
            );


            mostrarDonaciones();

            txtCantidadDonacion.clear();

        } catch (Exception e) {

            mostrarMensaje(
                    "Ingrese una cantidad válida."
            );
        }
    }

    @FXML
    private void generarAyuda() {

        try {

            Organizacion organizacion =
                    cbOrganizacionAyuda
                            .getValue();

            Damnificado damnificado =
                    cbDamnificadoAyuda
                            .getValue();

            TipoAyuda tipo =
                    cbTipoAyuda.getValue();

            double cantidad =
                    Double.parseDouble(
                            txtCantidadAyuda
                                    .getText()
                    );


            if (organizacion == null
                    || damnificado == null
                    || tipo == null) {

                mostrarMensaje(
                        "Complete todos los datos."
                );

                return;
            }


            Ayuda ayuda =
                    sistema.generarAyuda(
                            organizacion,
                            tipo,
                            cantidad
                    );


            if (ayuda == null) {

                mostrarMensaje(
                        "No se pudo generar la ayuda."
                );

                return;
            }


            sistema.entregarAyuda(
                    organizacion,
                    ayuda,
                    damnificado
            );


            mostrarAyudas();

            txtCantidadAyuda.clear();

        } catch (Exception e) {

            mostrarMensaje(
                    "Ingrese una cantidad válida."
            );
        }
    }

    private void actualizarPaises() {

        cbPais.setItems(
                FXCollections.observableArrayList(
                        sistema.consultarPaises()
                )
        );
    }


    private void actualizarDepartamentos() {

        cbDepartamento.setItems(
                FXCollections.observableArrayList(
                        sistema.consultarDepartamentos()
                )
        );
    }


    private void actualizarDamnificados() {

        cbDamnificadoAyuda.setItems(
                FXCollections.observableArrayList(
                        sistema.consultarDamnificados()
                )
        );
    }


    private void actualizarEmpresasCombo() {

        cbEmpresa.setItems(
                FXCollections.observableArrayList(
                        sistema.consultarEmpresas()
                )
        );
    }


    private void actualizarOrganizacionesCombo() {

        cbOrganizacion.setItems(
                FXCollections.observableArrayList(
                        sistema.consultarOrganizaciones()
                )
        );

        cbOrganizacionAyuda.setItems(
                FXCollections.observableArrayList(
                        sistema.consultarOrganizaciones()
                )
        );
    }

    private void mostrarUbicaciones() {

        listaUbicacion.getItems().clear();


        for (Pais pais :
                sistema.consultarPaises()) {

            listaUbicacion.getItems().add(
                    "País: "
                    + pais.getNombre()
            );


            for (Departamento departamento :
                    pais.consultarDepartamentos()) {

                listaUbicacion.getItems().add(
                        "   Departamento: "
                        + departamento.getNombre()
                );


                for (Municipio municipio :
                        departamento.consultarMunicipios()) {

                    listaUbicacion.getItems().add(
                            "      Municipio: "
                            + municipio.getNombre()
                    );
                }
            }
        }
    }

    private void mostrarTerremotos() {

        listaTerremotos.getItems().clear();


        for (Terremoto terremoto :
                sistema.consultarTerremotos()) {

            listaTerremotos.getItems().add(
                    "Fecha: "
                    + terremoto.getFecha()
                    + " | Hora: "
                    + terremoto.getHora()
                    + " | Magnitud: "
                    + terremoto.getMagnitud()
                    + " | Epicentro: "
                    + terremoto.getEpicentro()
            );
        }
    }

    private void mostrarDamnificados() {

        listaDamnificados.getItems().clear();


        for (Damnificado damnificado :
                sistema.consultarDamnificados()) {

            listaDamnificados.getItems().add(
                    "Nombre: "
                    + damnificado.getNombre()
                    + " | ID: "
                    + damnificado.getIdentificacion()
                    + " | Estado: "
                    + damnificado.getEstado()
                    + " | Afectación: "
                    + damnificado.getNivelAfectacion()
            );
        }
    }


    private void actualizarEmpresas() {

        listaEmpresas.getItems().clear();


        for (Empresa empresa :
                sistema.consultarEmpresas()) {

            listaEmpresas.getItems().add(
                    "Empresa: "
                    + empresa.getNombre()
                    + " | Representante: "
                    + empresa.getRepresentante()
            );
        }
    }

    private void actualizarOrganizaciones() {

        listaOrganizaciones.getItems().clear();


        for (Organizacion organizacion :
                sistema.consultarOrganizaciones()) {

            listaOrganizaciones.getItems().add(
                    "Organización: "
                    + organizacion.getNombre()
                    + " | Tipo: "
                    + organizacion.getTipoOrganizacion()
                    + " | Representante: "
                    + organizacion.getRepresentante()
            );
        }
    }



    private void mostrarDonaciones() {

        listaDonaciones.getItems().clear();


        for (Donacion donacion :
                sistema.consultarDonaciones()) {

            String organizacion = "Sin organización";


            if (donacion.getOrganizacion() != null) {

                organizacion =
                        donacion.getOrganizacion()
                                .getNombre();
            }


            listaDonaciones.getItems().add(
                    "Fecha: "
                    + donacion.getFecha()
                    + " | Cantidad: "
                    + donacion.getCantidad()
                    + " | Tipo: "
                    + donacion.getTipoDonacion()
                    + " | Organización: "
                    + organizacion
            );
        }
    }

    private void mostrarAyudas() {

        listaAyudas.getItems().clear();


        for (Ayuda ayuda :
                sistema.consultarAyudas()) {

            String damnificado =
                    "Sin damnificado";


            if (ayuda.getDamnificado() != null) {

                damnificado =
                        ayuda.getDamnificado()
                                .getNombre();
            }


            listaAyudas.getItems().add(
                    "Fecha: "
                    + ayuda.getFecha()
                    + " | Cantidad: "
                    + ayuda.getCantidad()
                    + " | Tipo: "
                    + ayuda.getTipoAyuda()
                    + " | Damnificado: "
                    + damnificado
            );
        }
    }

    private void mostrarMensaje(String mensaje) {

        Alert alerta =
                new Alert(
                        Alert.AlertType.INFORMATION
                );

        alerta.setTitle(
                "Sistema de Donaciones"
        );

        alerta.setHeaderText(null);

        alerta.setContentText(
                mensaje
        );

        alerta.showAndWait();
    }
    
   
    
     
    
}
