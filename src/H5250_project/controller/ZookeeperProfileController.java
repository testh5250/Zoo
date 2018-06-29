package H5250_project.controller;

import H5250_project.Main;
import H5250_project.model.*;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class ZookeeperProfileController {

    public Main main;

    public ZooKeeper zooKeeper;

    @FXML
    public Label zookeeperName;

    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField phoneField;
    @FXML
    private TextField mailField;
    @FXML
    private TextField addressField;
    @FXML
    private PasswordField oldPass;
    @FXML
    private PasswordField newPass;
    @FXML
    private PasswordField confirmPass;
    @FXML
    private TextField wageField;
    @FXML
    private TextField departmentField;


    @FXML
    public TabPane tabs;

    public ObservableList<Ticket> tickets;

    //////////////////////////////////////////////////////////////////////////////////////////
//////////ticket Components/////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    public TableView<Ticket> ticketTable;                              ///////////
    @FXML
    public TableColumn<Ticket,String> dateColumn;                       ///////////
    @FXML
    public TableColumn<Ticket,String> visitorColumn;                   ///////////
    @FXML
    public TableColumn<Ticket,String> countColumn;                       ///////////
                                                                             ///////////
//////////////////////////////////////////////////////////////////////////////////////////



    public static ObservableList<StringProperty> messages=FXCollections.observableArrayList();

    @FXML
    public TableView<StringProperty> messagesTable;
    @FXML
    public TableColumn<StringProperty,String> messagesColumn;


    @FXML
    private void initialize() {

    }

    @FXML
    public void handleSave(){
        String error="";
        zooKeeper.setName(firstNameField.getText());
        zooKeeper.setLastName(lastNameField.getText());
        zooKeeper.setPhoneNumber(phoneField.getText());
        if (mailField.getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")||mailField.getText().equals(""))
            zooKeeper.setMail(mailField.getText());
        else
            error+="Email not valid!\n     Valid Ex: example@domain.com\n";
        if(!oldPass.getText().isEmpty()&&!newPass.getText().isEmpty()&&!confirmPass.getText().isEmpty()){
        if(oldPass.getText().equals(zooKeeper.getPass())&&newPass.getText().equals(confirmPass.getText()))
            zooKeeper.setPass(newPass.getText());
        else
            error+="Passwords dont match!\n";
        }
        if (phoneField.getText().matches("[09]{2}[0-9]{9}")||phoneField.getText().equals(""))
            zooKeeper.setPhoneNumber(phoneField.getText());
        else
            error +="Phone not valid!\n     Valid Ex: 09xxxxxxxxx\n";

        if (!error.equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please input valid initials");
            alert.setContentText(error);
            alert.showAndWait();
        }


        zookeeperName.setText("ZooKeepers: "+zooKeeper.getName()+" "+zooKeeper.getLastName());

    }

    public void setMain(Main main) {
        this.main = main;

        for (int i = 0; i < main.bird.tickets.size(); i++) {
            if(main.bird.tickets.get(i).zooKeeper==this.zooKeeper)
                if(!tickets.contains(main.bird.tickets.get(i)))
                    tickets.add(main.bird.tickets.get(i));

        }
        for (int i = 0; i < main.wild.tickets.size(); i++) {
            if(main.wild.tickets.get(i).zooKeeper==this.zooKeeper)
                if(!tickets.contains(main.wild.tickets.get(i)))
                    tickets.add(main.wild.tickets.get(i));

        }
        for (int i = 0; i < main.aquatic.tickets.size(); i++) {
            if(main.aquatic.tickets.get(i).zooKeeper==this.zooKeeper)
                if(!tickets.contains(main.aquatic.tickets.get(i)))
                    tickets.add(main.aquatic.tickets.get(i));
        }

        ticketTable.setItems(tickets);

        dateColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
        visitorColumn.setCellValueFactory(cellData -> cellData.getValue().getVisitor().fullNameProperty());
        countColumn.setCellValueFactory(cellData -> cellData.getValue().countProperty());


    }
    public void setZooKeeper(ZooKeeper zooKeeper) {
        this.zooKeeper = zooKeeper;

        zookeeperName.setText("ZooKeepers: "+zooKeeper.getName()+" "+zooKeeper.getLastName());

        firstNameField.setText(zooKeeper.getName());
        lastNameField.setText(zooKeeper.getLastName());
        phoneField.setText(zooKeeper.getPhoneNumber());
        mailField.setText(zooKeeper.getMail());
        addressField.setText(zooKeeper.getAddress());
        wageField.setText(zooKeeper.getWage()+"");
        departmentField.setText(zooKeeper.getDepartment());

    }

    @FXML
    public void logout(){
        main.showWelcomeForm();
    }


}
