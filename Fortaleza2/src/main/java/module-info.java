module co.edu.ufps.fortaleza2 {
    requires javafx.controls;
    requires javafx.fxml;
   

    opens co.edu.ufps.fortaleza2.controlador to javafx.fxml;
    exports co.edu.ufps.fortaleza2;
}
