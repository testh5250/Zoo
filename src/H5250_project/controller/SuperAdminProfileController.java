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

public class SuperAdminProfileController {

    public Main main;


    @FXML
    public Label income;


    @FXML
    private TextField mailField;
    @FXML
    private PasswordField oldPass;
    @FXML
    private PasswordField newPass;
    @FXML
    private PasswordField confirmPass;

    @FXML
    public TabPane tabs;

    @FXML
    public TextField wildPrice;
    @FXML
    public TextField birdPrice;
    @FXML
    public TextField aquaticPrice;

    //////////////////////////////////////////////////////////////////////////////////////////
    //////////bird Components/////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    @FXML                                                                      ///////////
    public AnchorPane birdsPane;                                               ///////////
    @FXML
    public TableView<Animal> birdsTable;                                       ///////////
    @FXML
    public TableColumn<Animal,String> birdName;                                ///////////
    @FXML
    public TableColumn<Animal,String> birdNationalID;                          ///////////
    @FXML
    public TableColumn<Animal,String> birdNationality;                         ///////////
    @FXML
    public TableColumn<Animal,String> birdFood;                                ///////////
    @FXML
    public AnchorPane birdDetails;                                             ///////////
    @FXML
    public TextField birdNameField;                                            ///////////
    @FXML
    public TextField birdNationalityField;                                     ///////////
    @FXML
    public TextField birdNationalIdField;                                      ///////////
    @FXML
    public TextField birdFoodField;                                            ///////////
    @FXML
    public ChoiceBox birdSex;                                                  ///////////
    @FXML
    public CheckBox birdInsurance;                                             ///////////
    @FXML
    public CheckBox birdWild;                                                  ///////////
    @FXML
    public Button birdOK;                                                      ///////////
    @FXML
    public Button birdCancel;                                                  ///////////
//////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////
    //////////birdKeeper Components/////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    @FXML                                                                      ///////////
    public AnchorPane birdKeepersPane;                                         ///////////
    @FXML
    public TableView<ZooKeeper> birdKeepersTable;                              ///////////
    @FXML
    public TableColumn<ZooKeeper,String> birdKeeperName;                       ///////////
    @FXML
    public TableColumn<ZooKeeper,String> birdKeeperLastName;                   ///////////
    @FXML
    public TableColumn<ZooKeeper,Number> birdKeeperWage;                       ///////////
    @FXML
    public AnchorPane birdKeeperDetails;                                       ///////////
    @FXML
    public TextField birdKeeperNameField;                                      ///////////
    @FXML
    public TextField birdKeeperLastNameField;                                  ///////////
    @FXML
    public TextField birdKeeperMailField;                                      ///////////
    @FXML
    public TextField birdKeeperUserField;                                      ///////////
    @FXML
    public TextField birdKeeperPassField;                                      ///////////
    @FXML
    public TextField birdKeeperAddressField;                                   ///////////
    @FXML
    public TextField birdKeeperWageField;                                      ///////////
    @FXML
    public TextField birdKeeperPhoneField;                                     ///////////
    @FXML
    public Button birdKeeperOK;                                                ///////////
    @FXML
    public Button birdKeeperCancel;                                            ///////////
//////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////
    //////////wild Components/////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    @FXML                                                                      ///////////
    public AnchorPane wildsPane;                                               ///////////
    @FXML
    public TableView<Animal> wildsTable;                                       ///////////
    @FXML
    public TableColumn<Animal,String> wildName;                                ///////////
    @FXML
    public TableColumn<Animal,String> wildNationalID;                          ///////////
    @FXML
    public TableColumn<Animal,String> wildNationality;                         ///////////
    @FXML
    public TableColumn<Animal,String> wildFood;                                ///////////
    @FXML
    public AnchorPane wildDetails;                                             ///////////
    @FXML
    public TextField wildNameField;                                            ///////////
    @FXML
    public TextField wildNationalityField;                                     ///////////
    @FXML
    public TextField wildNationalIdField;                                      ///////////
    @FXML
    public TextField wildFoodField;                                            ///////////
    @FXML
    public ChoiceBox wildSex;                                                  ///////////
    @FXML
    public CheckBox wildInsurance;                                             ///////////
    @FXML
    public TextField wildHomeField;                                            ///////////
    @FXML
    public Button wildOK;                                                      ///////////
    @FXML
    public Button wildCancel;                                                  ///////////
//////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////
//////////wildKeeper Components/////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    @FXML                                                                      ///////////
    public AnchorPane wildKeepersPane;                                         ///////////
    @FXML
    public TableView<ZooKeeper> wildKeepersTable;                              ///////////
    @FXML
    public TableColumn<ZooKeeper,String> wildKeeperName;                       ///////////
    @FXML
    public TableColumn<ZooKeeper,String> wildKeeperLastName;                   ///////////
    @FXML
    public TableColumn<ZooKeeper,Number> wildKeeperWage;                       ///////////
    @FXML
    public AnchorPane wildKeeperDetails;                                       ///////////
    @FXML
    public TextField wildKeeperNameField;                                      ///////////
    @FXML
    public TextField wildKeeperLastNameField;                                  ///////////
    @FXML
    public TextField wildKeeperMailField;                                      ///////////
    @FXML
    public TextField wildKeeperUserField;                                      ///////////
    @FXML
    public TextField wildKeeperPassField;                                      ///////////
    @FXML
    public TextField wildKeeperAddressField;                                   ///////////
    @FXML
    public TextField wildKeeperWageField;                                      ///////////
    @FXML
    public TextField wildKeeperPhoneField;                                     ///////////
    @FXML
    public Button wildKeeperOK;                                                ///////////
    @FXML
    public Button wildKeeperCancel;                                            ///////////
//////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////
//////////bird Components/////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    @FXML                                                                      ///////////
    public AnchorPane aquaticsPane;                                               ///////////
    @FXML
    public TableView<Animal> aquaticsTable;                                       ///////////
    @FXML
    public TableColumn<Animal,String> aquaticName;                                ///////////
    @FXML
    public TableColumn<Animal,String> aquaticNationalID;                          ///////////
    @FXML
    public TableColumn<Animal,String> aquaticNationality;                         ///////////
    @FXML
    public TableColumn<Animal,String> aquaticFood;                                ///////////
    @FXML
    public AnchorPane aquaticDetails;                                             ///////////
    @FXML
    public TextField aquaticNameField;                                            ///////////
    @FXML
    public TextField aquaticNationalityField;                                     ///////////
    @FXML
    public TextField aquaticNationalIdField;                                      ///////////
    @FXML
    public TextField aquaticFoodField;                                            ///////////
    @FXML
    public ChoiceBox aquaticSex;                                                  ///////////
    @FXML
    public CheckBox aquaticInsurance;                                             ///////////
    @FXML
    public CheckBox aquaticCarnivorous;                                           ///////////
    @FXML
    public Button aquaticOK;                                                      ///////////
    @FXML
    public Button aquaticCancel;                                                  ///////////
//////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////
//////////aquaKeeper Components/////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    @FXML                                                                      ///////////
    public AnchorPane aquaKeepersPane;                                         ///////////
    @FXML
    public TableView<ZooKeeper> aquaKeepersTable;                              ///////////
    @FXML
    public TableColumn<ZooKeeper,String> aquaKeeperName;                       ///////////
    @FXML
    public TableColumn<ZooKeeper,String> aquaKeeperLastName;                   ///////////
    @FXML
    public TableColumn<ZooKeeper,Number> aquaKeeperWage;                       ///////////
    @FXML
    public AnchorPane aquaKeeperDetails;                                       ///////////
    @FXML
    public TextField aquaKeeperNameField;                                      ///////////
    @FXML
    public TextField aquaKeeperLastNameField;                                  ///////////
    @FXML
    public TextField aquaKeeperMailField;                                      ///////////
    @FXML
    public TextField aquaKeeperUserField;                                      ///////////
    @FXML
    public TextField aquaKeeperPassField;                                      ///////////
    @FXML
    public TextField aquaKeeperAddressField;                                   ///////////
    @FXML
    public TextField aquaKeeperWageField;                                      ///////////
    @FXML
    public TextField aquaKeeperPhoneField;                                     ///////////
    @FXML
    public Button aquaKeeperOK;                                                ///////////
    @FXML
    public Button aquaKeeperCancel;                                            ///////////
//////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////
    //////////Manager Components/////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    @FXML                                                                      ///////////
    public TableView<Manager> managersTable;                              ///////////
    @FXML
    public TableColumn<Manager,String> managerName;                       ///////////
    @FXML
    public TableColumn<Manager,String> managerLastName;                   ///////////
    @FXML
    public TableColumn<Manager,Number> managerWage;                       ///////////
    @FXML
    public AnchorPane managerDetails;                                       ///////////
    @FXML
    public TextField managerNameField;                                      ///////////
    @FXML
    public TextField managerLastNameField;                                  ///////////
    @FXML
    public TextField managerMailField;                                      ///////////
    @FXML
    public TextField managerUserField;                                      ///////////
    @FXML
    public TextField managerPassField;                                      ///////////
    @FXML
    public TextField managerAddressField;                                   ///////////
    @FXML
    public TextField managerWageField;                                      ///////////
    @FXML
    public TextField managerPhoneField;                                     ///////////
    @FXML
    public Button managerOK;                                                ///////////
    @FXML
    public Button managerCancel;                                            ///////////
//////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////
//////////ticket Components/////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    @FXML                                                                      ///////////
    public ScrollPane tickets;                                         ///////////
    @FXML
    public TableView<Ticket> ticketsTable;                              ///////////
    @FXML
    public TableColumn<Ticket,String> dateColumn;                       ///////////
    @FXML
    public TableColumn<Ticket,String> visitorColumn;                   ///////////
    @FXML
    public TableColumn<Ticket,String> zookeeperColumn;                       ///////////
    @FXML
    public TableColumn<Ticket,String> countColumn;                       ///////////
    ///////////
//////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    public TextField superUserField;
    @FXML
    public PasswordField superPassField;
    @FXML
    public AnchorPane SuperLogin;

    public ObservableList<StringProperty> messages=Main.messages;

    @FXML
    public TableView<StringProperty> messagesTable;
    @FXML
    public TableColumn<StringProperty,String> messagesColumn;


    @FXML
    private void initialize() {

        income.setText(income.getText()+" "+Main.income.get()+"$");

        wildPrice.setText(Main.wild.getTicketPrice().toString());
        birdPrice.setText(Main.bird.getTicketPrice().toString());
        aquaticPrice.setText(Main.aquatic.getTicketPrice().toString());


        // Initializes the birds.
        birdsPane.setVisible(false);
        birdDetails.setVisible(false);

        birdsTable.setItems(Main.bird.animals);
        birdName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        birdNationalID.setCellValueFactory(cellData -> cellData.getValue().nationalIdProperty());
        birdNationality.setCellValueFactory(cellData -> cellData.getValue().nationalityProperty());
        birdFood.setCellValueFactory(cellData -> cellData.getValue().foodProperty());
        ///////////////////////////////////////////////////////////////////////////////////////////

        //Initializes the birdKeepers.
        birdKeepersPane.setVisible(false);
        birdKeeperDetails.setVisible(false);

        birdKeepersTable.setItems(Main.bird.zooKeepers);
        birdKeeperName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        birdKeeperLastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        birdKeeperWage.setCellValueFactory(cellData -> cellData.getValue().wageProperty());
        ////////////////////////////////////////////////////////////////////////////////////////////

        //Initializes the wilds.
        wildsPane.setVisible(false);
        wildDetails.setVisible(false);

        wildsTable.setItems(Main.wild.animals);
        wildName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        wildNationalID.setCellValueFactory(cellData -> cellData.getValue().nationalIdProperty());
        wildNationality.setCellValueFactory(cellData -> cellData.getValue().nationalityProperty());
        wildFood.setCellValueFactory(cellData -> cellData.getValue().foodProperty());
        //////////////////////////////////////////////////////////////////////////////////////////////

        //Initializes the wildKeepers.
        wildKeepersPane.setVisible(false);
        wildKeeperDetails.setVisible(false);

        wildKeepersTable.setItems(Main.wild.zooKeepers);
        wildKeeperName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        wildKeeperLastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        wildKeeperWage.setCellValueFactory(cellData -> cellData.getValue().wageProperty());
        ////////////////////////////////////////////////////////////////////////////////////////////

        // Initializes the aquatics.
        aquaticsPane.setVisible(false);
        aquaticDetails.setVisible(false);

        aquaticsTable.setItems(Main.aquatic.animals);
        aquaticName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        aquaticNationalID.setCellValueFactory(cellData -> cellData.getValue().nationalIdProperty());
        aquaticNationality.setCellValueFactory(cellData -> cellData.getValue().nationalityProperty());
        aquaticFood.setCellValueFactory(cellData -> cellData.getValue().foodProperty());
        ///////////////////////////////////////////////////////////////////////////////////////////

        //Initializes the aquaKeepers.
        aquaKeepersPane.setVisible(false);
        aquaKeeperDetails.setVisible(false);

        aquaKeepersTable.setItems(Main.aquatic.zooKeepers);
        aquaKeeperName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        aquaKeeperLastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        aquaKeeperWage.setCellValueFactory(cellData -> cellData.getValue().wageProperty());
        ////////////////////////////////////////////////////////////////////////////////////////////

        //Initializes the managers.
        managerDetails.setVisible(false);

        managersTable.setItems(Main.managers);
        managerName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        managerLastName.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        managerWage.setCellValueFactory(cellData -> cellData.getValue().wageProperty());
        ////////////////////////////////////////////////////////////////////////////////////////////

        tickets.setVisible(false);

        //Initializing messages table
        messagesTable.setItems(messages);
        messagesColumn.setCellValueFactory(cellData ->cellData.getValue() );

    }

    //Birds Methods:
    @FXML
    public void showBirdDetails(Bird bird){

        birdDetails.setVisible(true);

        birdNameField.setText(bird.getName());
        birdNationalityField.setText(bird.getNationality());
        birdNationalIdField.setText(bird.getNationalId());
        birdFoodField.setText(bird.getFood());
        birdSex.setItems(FXCollections.observableArrayList("Male", "Female"));
        birdSex.setValue(bird.getSex());
        if(bird.isInsured())
            birdInsurance.setSelected(true);
        else
            birdInsurance.setSelected(false);
        if(bird.isWild())
            birdWild.setSelected(true);
        else
            birdWild.setSelected(false);

        birdOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                bird.setName(birdNameField.getText());
                bird.setNationality(birdNationalityField.getText());
                bird.setNationalId(birdNationalIdField.getText());
                bird.setFood(birdFoodField.getText());
                bird.setSex(birdSex.getValue().toString());
                bird.setInsurance(birdInsurance.isSelected());
                bird.setWild(birdWild.isSelected());


                birdDetails.setVisible(false);

            }
        });

        birdCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                birdDetails.setVisible(false);
            }
        });

    }

    @FXML
    public void handleNewBird(){
        Bird tmp=new Bird();
        showBirdDetails(tmp);
        if(!tmp.name.toString().equals(""))
            Main.bird.animals.add(tmp);
    }
    @FXML
    public void handleEditBird(){
        showBirdDetails((Bird)Main.bird.animals.get(birdsTable.getSelectionModel().getSelectedIndex()));
    }
    @FXML
    public void handleDeleteBird(){
        Main.bird.animals.remove(birdsTable.getSelectionModel().getSelectedItem());
    }
    @FXML
    public void showBirds(){
        birdsPane.setVisible(true);
    }
    @FXML
    public void hideBirds(){
        birdsPane.setVisible(false);
    }
    //End of Bird Methods

    //BirdKeeper Methods:
    @FXML
    public void showBirdKeeperDetails(ZooKeeper zooKeeper){


        birdKeeperDetails.setVisible(true);

        birdKeeperNameField.setText(zooKeeper.getName());
        birdKeeperLastNameField.setText(zooKeeper.getLastName());
        birdKeeperMailField.setText(zooKeeper.getMail());
        birdKeeperUserField.setText(zooKeeper.getUser());

        birdKeeperPassField.setText(zooKeeper.getPass());
        birdKeeperAddressField.setText(zooKeeper.getAddress());
        birdKeeperWageField.setText(zooKeeper.getWage()+"");
        birdKeeperPhoneField.setText(zooKeeper.getPhoneNumber());
        birdKeeperOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String error = "";

                zooKeeper.setName(birdKeeperNameField.getText());
                zooKeeper.setLastName(birdKeeperLastNameField.getText());
                if (birdKeeperMailField.getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")||birdKeeperMailField.getText().equals(""))
                    zooKeeper.setMail(birdKeeperMailField.getText());
                else
                    error = error + "Email not valid!\n     Valid Ex: example@domain.com\n";
                zooKeeper.setUser(birdKeeperUserField.getText());
                zooKeeper.setPass(birdKeeperPassField.getText());
                zooKeeper.setAddress(birdKeeperAddressField.getText());
                zooKeeper.setWage(birdKeeperWageField.getText());
                if (birdKeeperPhoneField.getText().matches("[09]{2}[0-9]{9}")||birdKeeperPhoneField.getText().equals(""))
                    zooKeeper.setPhoneNumber(birdKeeperPhoneField.getText());
                else
                    error = error + "Phone not valid!\n     Valid Ex: 09xxxxxxxxx\n";

                if (!error.equals("")) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Invalid Fields");
                    alert.setHeaderText("Please input valid initials");
                    alert.setContentText(error);

                    alert.showAndWait();
                }
                else
                    birdKeeperDetails.setVisible(false);

            }
        });

        birdKeeperCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                birdKeeperDetails.setVisible(false);
            }
        });

    }

    @FXML
    public void handleNewBirdKeeper(){
        ZooKeeper tmp=new ZooKeeper("Bird");
        showBirdKeeperDetails(tmp);
        if(!tmp.wage.toString().equals(""))
            Main.bird.zooKeepers.add(tmp);
    }
    @FXML
    public void handleEditBirdKeeper(){
        showBirdKeeperDetails(Main.bird.zooKeepers.get(birdKeepersTable.getSelectionModel().getSelectedIndex()));
    }
    @FXML
    public void handleDeleteBirdKeeper(){
        Main.bird.zooKeepers.remove(birdKeepersTable.getSelectionModel().getSelectedItem());
    }
    @FXML
    public void showBirdKeepers(){
        birdKeepersPane.setVisible(true);
    }
    @FXML
    public void hideBirdKeepers(){
        birdKeepersPane.setVisible(false);
    }
    //End Of BirdKeepers

    //Wild Methods:
    @FXML
    public void showWildDetails(Wild wild){

        wildDetails.setVisible(true);

        wildNameField.setText(wild.getName());
        wildNationalityField.setText(wild.getNationality());
        wildNationalIdField.setText(wild.getNationalId());
        wildFoodField.setText(wild.getFood());
        wildSex.setItems(FXCollections.observableArrayList("Male", "Female"));
        wildSex.setValue(wild.getSex());
        if(wild.isInsured())
            wildInsurance.setSelected(true);
        else
            wildInsurance.setSelected(false);
        wildHomeField.setText(wild.getHome());

        wildOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                wild.setName(wildNameField.getText());
                wild.setNationality(wildNationalityField.getText());
                wild.setNationalId(wildNationalIdField.getText());
                wild.setFood(wildFoodField.getText());
                wild.setSex(wildSex.getValue().toString());
                wild.setInsurance(wildInsurance.isSelected());
                wild.setHome(wildHomeField.getText());


                wildDetails.setVisible(false);

            }
        });

        wildCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                wildDetails.setVisible(false);
            }
        });

    }

    @FXML
    public void handleNewWild(){
        Wild tmp=new Wild();
        showWildDetails(tmp);
        if(!tmp.name.toString().equals(""))
            Main.wild.animals.add(tmp);
    }
    @FXML
    public void handleEditWild(){
        showWildDetails((Wild)Main.wild.animals.get(wildsTable.getSelectionModel().getSelectedIndex()));
    }
    @FXML
    public void handleDeleteWild(){
        Main.wild.animals.remove(wildsTable.getSelectionModel().getSelectedItem());
    }
    @FXML
    public void showWilds(){
        wildsPane.setVisible(true);
    }
    @FXML
    public void hideWilds(){
        wildsPane.setVisible(false);
    }
    //End Of Wilds

    //WildKeeper Methods:
    @FXML
    public void showWildKeeperDetails(ZooKeeper zooKeeper){


        wildKeeperDetails.setVisible(true);

        wildKeeperNameField.setText(zooKeeper.getName());
        wildKeeperLastNameField.setText(zooKeeper.getLastName());
        wildKeeperMailField.setText(zooKeeper.getMail());
        wildKeeperUserField.setText(zooKeeper.getUser());

        wildKeeperPassField.setText(zooKeeper.getPass());
        wildKeeperAddressField.setText(zooKeeper.getAddress());
        wildKeeperWageField.setText(zooKeeper.getWage()+"");
        wildKeeperPhoneField.setText(zooKeeper.getPhoneNumber());
        wildKeeperOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String error = "";

                zooKeeper.setName(wildKeeperNameField.getText());
                zooKeeper.setLastName(wildKeeperLastNameField.getText());
                if (wildKeeperMailField.getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")||wildKeeperMailField.getText().equals(""))
                    zooKeeper.setMail(wildKeeperMailField.getText());
                else
                    error = error + "Email not valid!\n     Valid Ex: example@domain.com\n";
                zooKeeper.setUser(wildKeeperUserField.getText());
                zooKeeper.setPass(wildKeeperPassField.getText());
                zooKeeper.setAddress(wildKeeperAddressField.getText());
                zooKeeper.setWage(wildKeeperWageField.getText());
                if (wildKeeperPhoneField.getText().matches("[09]{2}[0-9]{9}")||wildKeeperPhoneField.getText().equals(""))
                    zooKeeper.setPhoneNumber(wildKeeperPhoneField.getText());
                else
                    error = error + "Phone not valid!\n     Valid Ex: 09xxxxxxxxx\n";

                if (!error.equals("")) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Invalid Fields");
                    alert.setHeaderText("Please input valid initials");
                    alert.setContentText(error);

                    alert.showAndWait();
                }
                else
                    wildKeeperDetails.setVisible(false);

            }
        });

        wildKeeperCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                wildKeeperDetails.setVisible(false);
            }
        });

    }

    @FXML
    public void handleNewWildKeeper(){
        ZooKeeper tmp=new ZooKeeper("Wild");
        showWildKeeperDetails(tmp);
        if(!tmp.wage.toString().equals(""))
            Main.wild.zooKeepers.add(tmp);
    }
    @FXML
    public void handleEditWildKeeper(){
        showWildKeeperDetails(Main.wild.zooKeepers.get(wildKeepersTable.getSelectionModel().getSelectedIndex()));
    }
    @FXML
    public void handleDeleteWildKeeper(){
        Main.wild.zooKeepers.remove(wildKeepersTable.getSelectionModel().getSelectedItem());
    }
    @FXML
    public void showWildKeepers(){
        wildKeepersPane.setVisible(true);
    }
    @FXML
    public void hideWildKeepers(){
        wildKeepersPane.setVisible(false);
    }
    //End Of WildKeepers

    //Aquatic Methods:
    @FXML
    public void showAquaticDetails(Aquatic aquatic){

        aquaticDetails.setVisible(true);

        aquaticNameField.setText(aquatic.getName());
        aquaticNameField.setText(aquatic.getNationality());
        aquaticNationalIdField.setText(aquatic.getNationalId());
        aquaticFoodField.setText(aquatic.getFood());
        aquaticSex.setItems(FXCollections.observableArrayList("Male", "Female"));
        aquaticSex.setValue(aquatic.getSex());
        if(aquatic.isInsured())
            aquaticInsurance.setSelected(true);
        else
            aquaticInsurance.setSelected(false);
        if(aquatic.isCarnivorous())
            aquaticCarnivorous.setSelected(true);
        else
            aquaticCarnivorous.setSelected(false);

        aquaticOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                aquatic.setName(aquaticNameField.getText());
                aquatic.setNationality(aquaticNationalityField.getText());
                aquatic.setNationalId(aquaticNationalIdField.getText());
                aquatic.setFood(aquaticFoodField.getText());
                aquatic.setSex(aquaticSex.getValue().toString());
                aquatic.setInsurance(aquaticInsurance.isSelected());
                aquatic.setCarnivorous(aquaticCarnivorous.isSelected());


                aquaticDetails.setVisible(false);

            }
        });

        aquaticCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                aquaticDetails.setVisible(false);
            }
        });

    }

    @FXML
    public void handleNewAquatic(){
        Aquatic tmp=new Aquatic();
        showAquaticDetails(tmp);
        if(!tmp.name.toString().equals(""))
            Main.aquatic.animals.add(tmp);
    }
    @FXML
    public void handleEditAquatic(){
        showAquaticDetails((Aquatic)Main.aquatic.animals.get(aquaticsTable.getSelectionModel().getSelectedIndex()));
    }
    @FXML
    public void handleDeleteAquatic(){
        Main.aquatic.animals.remove(aquaticsTable.getSelectionModel().getSelectedItem());
    }
    @FXML
    public void showAquatics(){
        aquaticsPane.setVisible(true);
    }
    @FXML
    public void hideAquatics(){
        aquaticsPane.setVisible(false);
    }
    //End Of Aquatics

    //AquaKeeper Methods:
    @FXML
    public void showAquaKeeperDetails(ZooKeeper zooKeeper){


        aquaKeeperDetails.setVisible(true);

        aquaKeeperNameField.setText(zooKeeper.getName());
        aquaKeeperLastNameField.setText(zooKeeper.getLastName());
        aquaKeeperMailField.setText(zooKeeper.getMail());
        aquaKeeperUserField.setText(zooKeeper.getUser());
        aquaKeeperPassField.setText(zooKeeper.getPass());
        aquaKeeperAddressField.setText(zooKeeper.getAddress());
        aquaKeeperWageField.setText(zooKeeper.getWage()+"");
        aquaKeeperPhoneField.setText(zooKeeper.getPhoneNumber());
        aquaKeeperOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String error = "";

                zooKeeper.setName(aquaKeeperNameField.getText());
                zooKeeper.setLastName(aquaKeeperLastNameField.getText());
                if (aquaKeeperMailField.getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")||aquaKeeperMailField.getText().equals(""))
                    zooKeeper.setMail(aquaKeeperMailField.getText());
                else
                    error = error + "Email not valid!\n     Valid Ex: example@domain.com\n";
                zooKeeper.setUser(aquaKeeperUserField.getText());
                zooKeeper.setPass(aquaKeeperPassField.getText());
                zooKeeper.setAddress(aquaKeeperAddressField.getText());
                zooKeeper.setWage(aquaKeeperWageField.getText());
                if (aquaKeeperPhoneField.getText().matches("[09]{2}[0-9]{9}")||aquaKeeperPhoneField.getText().equals(""))
                    zooKeeper.setPhoneNumber(aquaKeeperPhoneField.getText());
                else
                    error = error + "Phone not valid!\n     Valid Ex: 09xxxxxxxxx\n";

                if (!error.equals("")) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Invalid Fields");
                    alert.setHeaderText("Please input valid initials");
                    alert.setContentText(error);

                    alert.showAndWait();
                }
                else
                    aquaKeeperDetails.setVisible(false);

            }
        });

        aquaKeeperCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                aquaKeeperDetails.setVisible(false);
            }
        });

    }

    @FXML
    public void handleNewAquaKeeper(){
        ZooKeeper tmp=new ZooKeeper("Aquatic");
        showAquaKeeperDetails(tmp);
        if(!tmp.wage.toString().equals(""))
            Main.aquatic.zooKeepers.add(tmp);
    }
    @FXML
    public void handleEditAquaKeeper(){
        showAquaKeeperDetails(Main.aquatic.zooKeepers.get(aquaKeepersTable.getSelectionModel().getSelectedIndex()));
    }
    @FXML
    public void handleDeleteAquaKeeper(){
        Main.aquatic.zooKeepers.remove(aquaKeepersTable.getSelectionModel().getSelectedItem());
    }
    @FXML
    public void showAquaKeepers(){
        aquaKeepersPane.setVisible(true);
    }
    @FXML
    public void hideAquaKeepers(){
        aquaKeepersPane.setVisible(false);
    }
    //End Of AquaKeepers

    //Manager Methods:
    @FXML
    public void showManagerDetails(Manager manager){


        managerDetails.setVisible(true);

        managerNameField.setText(manager.getName());
        managerLastNameField.setText(manager.getLastName());
        managerMailField.setText(manager.getMail());
        managerUserField.setText(manager.getUser());

        managerPassField.setText(manager.getPass());
        managerAddressField.setText(manager.getAddress());
        managerWageField.setText(manager.getWage()+"");
        managerPhoneField.setText(manager.getPhoneNumber());
        managerOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String error = "";

                manager.setName(managerNameField.getText());
                manager.setLastName(managerLastNameField.getText());
                if (managerMailField.getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")||managerMailField.getText().equals(""))
                    manager.setMail(managerMailField.getText());
                else
                    error = error + "Email not valid!\n     Valid Ex: example@domain.com\n";
                manager.setUser(managerUserField.getText());
                manager.setPass(managerPassField.getText());
                manager.setAddress(managerAddressField.getText());
                manager.setWage(managerWageField.getText());
                if (managerPhoneField.getText().matches("[09]{2}[0-9]{9}")||managerPhoneField.getText().equals(""))
                    manager.setPhoneNumber(managerPhoneField.getText());
                else
                    error = error + "Phone not valid!\n     Valid Ex: 09xxxxxxxxx\n";

                if (!error.equals("")) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Invalid Fields");
                    alert.setHeaderText("Please input valid initials");
                    alert.setContentText(error);

                    alert.showAndWait();
                }
                else
                    managerDetails.setVisible(false);

            }
        });

        managerCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                managerDetails.setVisible(false);
            }
        });

    }

    @FXML
    public void handleNewManager(){
        Manager tmp=new Manager();
        showManagerDetails(tmp);
        if(!tmp.wage.toString().equals(""))
            Main.managers.add(tmp);
    }
    @FXML
    public void handleEditManager(){
        showManagerDetails(Main.managers.get(managersTable.getSelectionModel().getSelectedIndex()));
    }
    @FXML
    public void handleDeleteManager(){
        Main.managers.remove(managersTable.getSelectionModel().getSelectedItem());
    }
    //End Of Managers

    @FXML
    public void saveBirdPrice(){
        if(birdPrice.getText().matches("[0-9]*"))
        Main.bird.setTicketPrice(Long.parseLong(birdPrice.getText()));
    }
    @FXML
    public void saveWildPrice(){
        if(wildPrice.getText().matches("[0-9]*"))
            Main.wild.setTicketPrice(Long.parseLong(wildPrice.getText()));
    }
    @FXML
    public void saveAquaticPrice(){
        if(aquaticPrice.getText().matches("[0-9]*"))
            Main.aquatic.setTicketPrice(Long.parseLong(aquaticPrice.getText()));
    }


    @FXML
    public void deleteMessage(){
        messages.remove(messagesTable.getSelectionModel().getSelectedItem());
    }

    @FXML
    public void handleSave(){

        main.email=mailField.getText();
        if(oldPass.getText().equals(main.superPass))
            if(newPass.getText().equals(confirmPass.getText()))
                main.superPass=newPass.getText();

    }

    @FXML
    public void birdTickets(){
        tickets.setVisible(true);

        ticketsTable.setItems(Main.bird.tickets);

        dateColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
        zookeeperColumn.setCellValueFactory(cellData -> cellData.getValue().zookeeperProperty());
        visitorColumn.setCellValueFactory(cellData -> cellData.getValue().getVisitor().fullNameProperty());
        countColumn.setCellValueFactory(cellData -> cellData.getValue().countProperty());

    }
    @FXML
    public void wildTickets(){
        tickets.setVisible(true);

        ticketsTable.setItems(Main.wild.tickets);

        dateColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
        zookeeperColumn.setCellValueFactory(cellData -> cellData.getValue().zookeeperProperty());
        visitorColumn.setCellValueFactory(cellData -> cellData.getValue().getVisitor().fullNameProperty());
        countColumn.setCellValueFactory(cellData -> cellData.getValue().countProperty());

    }
    @FXML
    public void aquaTickets(){
        tickets.setVisible(true);

        ticketsTable.setItems(Main.aquatic.tickets);

        dateColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
        zookeeperColumn.setCellValueFactory(cellData -> cellData.getValue().zookeeperProperty());
        visitorColumn.setCellValueFactory(cellData -> cellData.getValue().getVisitor().fullNameProperty());
        countColumn.setCellValueFactory(cellData -> cellData.getValue().countProperty());

    }
    @FXML
    public void hideTickets(){
        tickets.setVisible(false);
    }

    @FXML
    public void superLogin(){
        if(superUserField.getText().equals(main.superUser)&&superPassField.getText().equals(main.superPass))
            SuperLogin.setVisible(false);
    }

    @FXML
    public void handleBack(){
        main.showWelcomeForm();
    }


    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    public void logout(){
//        this.visitor=null;
        main.showWelcomeForm();
    }


}
