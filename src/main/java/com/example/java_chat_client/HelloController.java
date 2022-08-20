package com.example.java_chat_client;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class HelloController {

    @FXML
    private TextField inputField;

    @FXML
    private ListView<String> listOfUsers;

    @FXML
    private TextArea messageHistoryList;

    @FXML
    void initialize() {
        listOfUsers.setItems(FXCollections.observableArrayList("Naryiaana", "George", "Dream"));
    }

    @FXML
    void send(ActionEvent event) {
        String message = inputField.getText().trim();
        inputField.clear();

        if (message.length() == 0) {
            return;
        }

        messageHistoryList.appendText(message);
        messageHistoryList.appendText(System.lineSeparator());
    }

}
