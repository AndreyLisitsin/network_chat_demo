module com.example.network_chat_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.network_chat_demo to javafx.fxml;
    exports com.example.network_chat_demo;
}