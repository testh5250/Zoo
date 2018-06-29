package H5250_project.controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import H5250_project.Main;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class StaffFormController {

    @FXML
    public ChoiceBox choice;

    @FXML
    public TextField usrField;

    @FXML
    public PasswordField passField;

    public Main main;

    public void initialize(){
        choice.setItems(FXCollections.observableArrayList("Manager", "ZooKeeper"));
        choice.setValue("Manager");
        //baqie chizash inja hast:https://www.thoughtco.com/choicebox-overview-2033928
        //to browser ham pin shode
    }

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    public void handleLogin(){
        if(choice.getValue().toString().equals("Manager")){
            for (int i = 0; i < main.managers.size(); i++) {
                if (usrField.getText().equals(main.managers.get(i).getUser()) && passField.getText().equals(main.managers.get(i).getPass())) {
                    System.out.println("manager signed in");
                    main.showManagerProfile(main.managers.get(i));
                }
            }
        }
        if(choice.getValue().toString().equals("ZooKeeper")){
            boolean notFound=true;
            for (int i = 0; i < main.bird.zooKeepers.size(); i++) {
                if(usrField.getText().equals(main.bird.zooKeepers.get(i).getUser())&&passField.getText().equals(main.bird.zooKeepers.get(i).getPass())){
                    main.showZooKeeperProfile(main.bird.zooKeepers.get(i));
                    notFound=false;
                }
            }
            if(notFound)
            for (int i = 0; i < main.wild.zooKeepers.size(); i++) {
                if(usrField.getText().equals(main.wild.zooKeepers.get(i).getUser())&&passField.getText().equals(main.wild.zooKeepers.get(i).getPass())){
                    main.showZooKeeperProfile(main.wild.zooKeepers.get(i));
                    notFound=false;
                }
            }
            if(notFound)
            for (int i = 0; i < main.aquatic.zooKeepers.size(); i++) {
                if(usrField.getText().equals(main.aquatic.zooKeepers.get(i).getUser())&&passField.getText().equals(main.aquatic.zooKeepers.get(i).getPass())){
                    main.showZooKeeperProfile(main.aquatic.zooKeepers.get(i));
                }
            }
        }
    }
    @FXML
    public void handleBack(){
        main.showWelcomeForm();
    }


}
