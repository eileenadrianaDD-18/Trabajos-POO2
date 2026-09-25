/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package co.edu.ufps.fortaleza2.controlador;

import co.edu.ufps.fortaleza2.modelo.Docente;
import co.edu.ufps.fortaleza2.modelo.DocenteCatedratico;
import co.edu.ufps.fortaleza2.modelo.DocenteOcasional;
import co.edu.ufps.fortaleza2.modelo.DocentePlanta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class fortalezaControlador {

    private List<Docente> docentes;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtDepartamento;

    @FXML
    private ComboBox<String> cbTipoDocente;

    @FXML
    private TextField txtContrato;

    @FXML
    private TextField txtHoras;

    @FXML
    private TextField txtValorHora;

    @FXML
    private TextField txtSalBasico;

    @FXML
    private TextField txtPuntos;

    @FXML
    private TextField txtValorPunto;

    @FXML
    private TextField txtCategoria;

    @FXML
    private TextField txtResolucion;

    @FXML
    private TextField txtFecha;

    @FXML
    private ListView<String> listaDocentes;


    @FXML
    public void initialize() {

        docentes = new ArrayList<>();

        cbTipoDocente.setItems(
                FXCollections.observableArrayList(
                        "Catedrático",
                        "Ocasional",
                        "Planta"
                )
        );
    }


    @FXML
    private void registrarDocente() {

        try {

            int codigo = Integer.parseInt(
                    txtCodigo.getText()
            );

            String nombre = txtNombre.getText();

            String titulo = txtTitulo.getText();

            String departamento =
                    txtDepartamento.getText();

            String tipo =
                    cbTipoDocente.getValue();


            if (nombre.isEmpty()
                    || titulo.isEmpty()
                    || departamento.isEmpty()
                    || tipo == null) {

                mostrarMensaje(
                        "Complete los datos básicos del docente."
                );

                return;
            }


            Docente docente;

            if (tipo.equals("Catedrático")) {

                int contrato =
                        Integer.parseInt(
                                txtContrato.getText()
                        );

                int horas =
                        Integer.parseInt(
                                txtHoras.getText()
                        );

                double valorHora =
                        Double.parseDouble(
                                txtValorHora.getText()
                        );


                docente = new DocenteCatedratico(
                        contrato,
                        horas,
                        valorHora,
                        codigo,
                        nombre,
                        titulo,
                        departamento
                );
            }

            else if (tipo.equals("Ocasional")) {

                double salario =
                        Double.parseDouble(
                                txtSalBasico.getText()
                        );


                docente = new DocenteOcasional(
                        salario,
                        codigo,
                        nombre,
                        titulo,
                        departamento
                );
            }

            else {

                double salario =
                        Double.parseDouble(
                                txtSalBasico.getText()
                        );

                int puntos =
                        Integer.parseInt(
                                txtPuntos.getText()
                        );

                double valorPunto =
                        Double.parseDouble(
                                txtValorPunto.getText()
                        );

                String categoria =
                        txtCategoria.getText();

                int resolucion =
                        Integer.parseInt(
                                txtResolucion.getText()
                        );

                LocalDate fecha =
                        LocalDate.parse(
                                txtFecha.getText()
                        );


                docente = new DocentePlanta(
                        salario,
                        puntos,
                        valorPunto,
                        categoria,
                        resolucion,
                        fecha,
                        codigo,
                        nombre,
                        titulo,
                        departamento
                );
            }

            docentes.add(docente);

            mostrarDocentes();

            limpiarCampos();

            mostrarMensaje(
                    "Docente registrado correctamente."
            );


        } catch (Exception e) {

            mostrarMensaje(
                    "Revise los datos ingresados."
            );
        }
    }

    private void mostrarDocentes() {

        listaDocentes.getItems().clear();


        for (Docente docente : docentes) {

            String tipo;


            if (docente instanceof DocenteCatedratico) {

                tipo = "Catedrático";

            } else if (docente instanceof DocenteOcasional) {

                tipo = "Ocasional";

            } else {

                tipo = "Planta";
            }


            listaDocentes.getItems().add(
                    "Código: "
                    + docente.getCodigo()
                    + " | Nombre: "
                    + docente.getNombre()
                    + " | Título: "
                    + docente.getTitulo()
                    + " | Departamento: "
                    + docente.getDepartamento()
                    + " | Tipo: "
                    + tipo
                    + " | Salario: $"
                    + docente.calcularSalario()
            );
        }
    }


    private void limpiarCampos() {

        txtCodigo.clear();
        txtNombre.clear();
        txtTitulo.clear();
        txtDepartamento.clear();

        txtContrato.clear();
        txtHoras.clear();
        txtValorHora.clear();

        txtSalBasico.clear();

        txtPuntos.clear();
        txtValorPunto.clear();

        txtCategoria.clear();
        txtResolucion.clear();
        txtFecha.clear();

        cbTipoDocente.getSelectionModel().clearSelection();
    }

    private void mostrarMensaje(String mensaje) {

        Alert alerta = new Alert(
                Alert.AlertType.INFORMATION
        );

        alerta.setTitle(
                "Sistema de Docentes"
        );

        alerta.setHeaderText(null);

        alerta.setContentText(
                mensaje
        );

        alerta.showAndWait();
    }
}