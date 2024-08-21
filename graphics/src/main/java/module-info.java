module com.grafics {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.grafics to javafx.fxml;
    exports com.grafics;
}
