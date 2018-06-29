package H5250_project.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import H5250_project.Main;
import H5250_project.model.Visitor;

public class SignUpFormController {

    @FXML
    public TextField usrField;
    @FXML
    public PasswordField passField;
    @FXML
    public PasswordField confirm_passField;
    @FXML
    public TextField emailField;

    public Main main;

    public SignUpFormController(){}
    public void initialize(){}

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    public void handleSignUp(){
        String error="";
        if(!checkUser(usrField.getText()))
            error+="UserName Already Taken!\n";
        if(!checkPass(passField.getText(),confirm_passField.getText()))
            error+="PassWords dont match!\n";
        if(!checkMail(emailField.getText()))
                error+="Email not valid!\n     Valid Ex: example@domain.com\n";
        if (!error.equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please input valid initials");
            alert.setContentText(error);
            alert.showAndWait();
        }
        if(checkUser(usrField.getText())&&checkPass(passField.getText(),confirm_passField.getText())&&checkMail(emailField.getText())) {
            Visitor tmp = new Visitor(usrField.getText(), passField.getText(), emailField.getText());
            Main.visitors.add(tmp);
            main.showVisitorProfile(tmp);
        }

    }

    private boolean checkUser(String user){
        if(Main.visitors.size()==0)
            return true;
        else {
            for (int i = 0; i < Main.visitors.size(); i++) {
                if (Main.visitors.get(i).getUser().equals(user))
                    return false;
            }
            return true;
        }
    }
    private boolean checkPass(String pass,String confirm_pass){
        if(pass.equals(confirm_pass))
            return true;
        else
            return false;
    }
    private boolean checkMail(String mail){
        return mail.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }

    @FXML
    public void handleBack(){
        main.showWelcomeForm();
    }


}
