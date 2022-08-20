module com.example.java_chat_client {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_chat_client to javafx.fxml;
    exports com.example.java_chat_client;
}