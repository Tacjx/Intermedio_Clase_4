module com.example.intermedio_clase_4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intermedio_clase_4 to javafx.fxml;
    exports com.example.intermedio_clase_4;
}