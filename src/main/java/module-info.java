module com.example.scenechanger {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.scenechanger to javafx.fxml;
    exports com.example.scenechanger;
}