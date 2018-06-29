package H5250_project.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import H5250_project.Main;
import H5250_project.model.Visitor;


public class LoginFormController {

    @FXML
    public TextField usrField;
    @FXML
    public PasswordField passField;


    public Stage stage;
    public Main main;

    public LoginFormController(){}
    public void initialize(){}

    @FXML
    public void handleLogin(){
        if(login(usrField.getText(),passField.getText())!=null)
            main.showVisitorProfile(login(usrField.getText(),passField.getText()));
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(stage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please input valid initials");
            alert.setContentText("Username and password dont match!");

            alert.showAndWait();
        }
    }

    public Visitor login(String user, String pass) {

        for (int i = 0; i < Main.visitors.size() ; i++)
            if(user.equals(Main.visitors.get(i).getUser())&&String.valueOf(pass.hashCode()).equals(Main.visitors.get(i).getPass()))
                return Main.visitors.get(i);

            return null;

    }


    @FXML
    public void handleBack(){
        main.showWelcomeForm();
    }


    public void setMain(Main main) {
        this.main = main;
    }
}
