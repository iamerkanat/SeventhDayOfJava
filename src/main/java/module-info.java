module com.example.seventhdayofjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.seventhdayofjava to javafx.fxml;
    exports com.example.seventhdayofjava;
}