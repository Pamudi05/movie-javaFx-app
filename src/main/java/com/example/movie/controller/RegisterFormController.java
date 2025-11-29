package com.example.movie.controller;

import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RegisterFormController {
    public AnchorPane context;

    public TextField txtusername;
    public TextField txtEmail;
    public TextField txtcontact;
    public PasswordField txtPassword;
    public CheckBox chkshowpassword;

     public void registerOnAction(ActionEvent actionEvent) throws IOException{
        setUi("LoginForm");
    }

    private void setUi(String location) throws IOException {
        URL resource = getClass().getResource("/com/example/movie/view/"+location+".fxml");
        Parent load = FXMLLoader.load(resource);
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(load));
    }
}
