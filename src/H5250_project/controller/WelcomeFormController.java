package H5250_project.controller;

import javafx.fxml.FXML;
import H5250_project.Main;

public class WelcomeFormController {

    public Main main;


    public WelcomeFormController(){}
    public void initialize(){}

    @FXML
    public void superAdmin(){
        main.showSuperAdminForm();
    }

    @FXML
    public void handleLogin(){
        main.showLoginForm();
    }

    @FXML
    public void handleSignUp(){
        main.showSignUpForm();
    }

    @FXML
    public void handleStaff(){
        main.showStaffForm();
    }

    public void setMain(Main main) {
        this.main = main;
    }
}

