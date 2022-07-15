package com.example.network_chat_demo;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    /*  случайно всё создал в мастере, решил сюда что-то добавить для возможности создать ПР
    */

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textField;

    @FXML
    private ListView<String> usersList;

    @FXML
    private TextArea chatArea;

    @FXML
    void sendMessage(ActionEvent event) {
        chatArea.setText(textField.getText() +  " " + new Date() +"\n" + chatArea.getText());
        textField.clear();
    }


    @FXML
    void initialize() {
        usersList.getItems().add(new User("Andrey").getName());
    }

    private void print(){
        // nothing to do
    }
}
