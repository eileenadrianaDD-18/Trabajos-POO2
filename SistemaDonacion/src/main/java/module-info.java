module co.edu.ufps.sistemadonacion {
    requires javafx.controls;
    requires javafx.fxml;
    
   

    opens co.edu.ufps.sistemadonacion.controlador to javafx.fxml;
    exports co.edu.ufps.sistemadonacion;
}
