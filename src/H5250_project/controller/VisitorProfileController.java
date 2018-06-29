package H5250_project.controller;

import H5250_project.model.Ticket;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.AccessibleRole;
import javafx.scene.control.*;
import H5250_project.Main;
import H5250_project.model.Visitor;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Shape;
import javafx.stage.FileChooser;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class VisitorProfileController {

    public Main main;

    public Visitor visitor;

    public String imageAddress="";

    public ObservableList<Ticket>tickets=FXCollections.observableArrayList();

    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField phoneField;
    @FXML
    private TextField mailField;
    @FXML
    private PasswordField oldPass;
    @FXML
    private PasswordField newPass;
    @FXML
    private PasswordField confirmPass;

    @FXML
    public TextArea message;

    @FXML
    public DatePicker datePicker;

    @FXML
    public Button btn;

    @FXML
    public Label credit;

    public FileChooser browser;

    @FXML
    public Shape profile;

    @FXML
    public TabPane tabs;

    public TableView<Ticket> ticketTable;
    @FXML
    private TableColumn<Ticket, String> dateColumn;
    @FXML
    private TableColumn<Ticket, String> departmentColumn;
    @FXML
    private TableColumn<Ticket, String> zookeeperColumn;


    @FXML
    public VBox birdBox;
    public Label birdPrice;
    public TextField birdCount;

    @FXML
    public VBox wildBox;
    public Label wildPrice;
    public TextField wildCount;

    @FXML
    public VBox aquaBox;
    public Label aquaPrice;
    public TextField aquaCount;



    @FXML
    public void showBird(){
        birdBox.setVisible(true);
        wildBox.setVisible(false);
        aquaBox.setVisible(false);

        birdPrice.setText(main.bird.getTicketPrice()+"");

    }
    @FXML
    public void showWild(){
        birdBox.setVisible(false);
        wildBox.setVisible(true);
        aquaBox.setVisible(false);

        wildPrice.setText(main.wild.getTicketPrice()+"");

    }
    @FXML
    public void showAqua(){
        birdBox.setVisible(false);
        wildBox.setVisible(false);
        aquaBox.setVisible(true);

        aquaPrice.setText(main.aquatic.getTicketPrice()+"");

    }
    @FXML
    public void buyBird(){
        try {
            Random rand = new Random();
            Long price=main.bird.ticketPrice*Integer.parseInt(birdCount.getText());
            int count=Integer.parseInt(birdCount.getText());
            Ticket tmp=new Ticket(price,count,"Bird",this.visitor,datePicker.getValue(),main.bird.zooKeepers.get(rand.nextInt(main.bird.zooKeepers.size())));
            main.bird.tickets.add(tmp);
            this.visitor.credit=new SimpleLongProperty(this.visitor.getCredit()-price);
            Main.income=new SimpleLongProperty(Main.income.get()+price);
            credit.setText(String.valueOf(visitor.getCredit())+"$");
            birdBox.setVisible(false);
            wildBox.setVisible(false);
            aquaBox.setVisible(false);

            for (int i = 0; i < main.bird.tickets.size(); i++) {
                if(main.bird.tickets.get(i).visitor==this.visitor)
                    if(!tickets.contains(main.bird.tickets.get(i)))
                        tickets.add(main.bird.tickets.get(i));

            }
            for (int i = 0; i < main.wild.tickets.size(); i++) {
                if(main.wild.tickets.get(i).visitor==this.visitor)
                    if(!tickets.contains(main.wild.tickets.get(i)))
                        tickets.add(main.wild.tickets.get(i));

            }
            for (int i = 0; i < main.aquatic.tickets.size(); i++) {
                if(main.aquatic.tickets.get(i).visitor==this.visitor)
                    if(!tickets.contains(main.aquatic.tickets.get(i)))
                        tickets.add(main.aquatic.tickets.get(i));
            }

            ticketTable.setItems(tickets);
        }
        catch (IllegalArgumentException ex){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("No Zookeepers");
            alert.setHeaderText("There is no Zookeepers availabe");
            alert.setContentText("Try again later");
            alert.showAndWait();
        }
    }
    @FXML
    public void buyWild() {
        try {
            Random rand = new Random();
            Long price = main.wild.ticketPrice * Integer.parseInt(wildCount.getText());
            int count = Integer.parseInt(wildCount.getText());
            Ticket tmp = new Ticket(price, count, "Wild", this.visitor, datePicker.getValue(), main.wild.zooKeepers.get(rand.nextInt(main.wild.zooKeepers.size())));
            main.wild.tickets.add(tmp);
            this.visitor.credit = new SimpleLongProperty(this.visitor.getCredit() - price);
            Main.income = new SimpleLongProperty(Main.income.get() + price);
            credit.setText(String.valueOf(visitor.getCredit()) + "$");
            birdBox.setVisible(false);
            wildBox.setVisible(false);
            aquaBox.setVisible(false);

            for (int i = 0; i < main.bird.tickets.size(); i++) {
                if (main.bird.tickets.get(i).visitor == this.visitor)
                    if (!tickets.contains(main.bird.tickets.get(i)))
                        tickets.add(main.bird.tickets.get(i));

            }
            for (int i = 0; i < main.wild.tickets.size(); i++) {
                if (main.wild.tickets.get(i).visitor == this.visitor)
                    if (!tickets.contains(main.wild.tickets.get(i)))
                        tickets.add(main.wild.tickets.get(i));

            }
            for (int i = 0; i < main.aquatic.tickets.size(); i++) {
                if (main.aquatic.tickets.get(i).visitor == this.visitor)
                    if (!tickets.contains(main.aquatic.tickets.get(i)))
                        tickets.add(main.aquatic.tickets.get(i));
            }

            ticketTable.setItems(tickets);
        }
        catch (IllegalArgumentException ex){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("No Zookeepers");
            alert.setHeaderText("There is no Zookeepers availabe");
            alert.setContentText("Try again later");
            alert.showAndWait();
        }
    }
    @FXML
    public void buyAqua(){
        try {
            Random rand = new Random();
            Long price=main.aquatic.ticketPrice*Integer.parseInt(aquaCount.getText());
            int count=Integer.parseInt(aquaCount.getText());
            Ticket tmp=new Ticket(price,count,"Aquatic",this.visitor,datePicker.getValue(),main.aquatic.zooKeepers.get(rand.nextInt(main.aquatic.zooKeepers.size())));
            main.aquatic.tickets.add(tmp);
            this.visitor.credit=new SimpleLongProperty(this.visitor.getCredit()-price);
            Main.income=new SimpleLongProperty(Main.income.get()+price);
            credit.setText(String.valueOf(visitor.getCredit())+"$");
            birdBox.setVisible(false);
            wildBox.setVisible(false);
            aquaBox.setVisible(false);

            for (int i = 0; i < main.bird.tickets.size(); i++) {
                if(main.bird.tickets.get(i).visitor==this.visitor)
                    if(!tickets.contains(main.bird.tickets.get(i)))
                        tickets.add(main.bird.tickets.get(i));

            }
            for (int i = 0; i < main.wild.tickets.size(); i++) {
                if(main.wild.tickets.get(i).visitor==this.visitor)
                    if(!tickets.contains(main.wild.tickets.get(i)))
                        tickets.add(main.wild.tickets.get(i));

            }
            for (int i = 0; i < main.aquatic.tickets.size(); i++) {
                if(main.aquatic.tickets.get(i).visitor==this.visitor)
                    if(!tickets.contains(main.aquatic.tickets.get(i)))
                        tickets.add(main.aquatic.tickets.get(i));
            }

            ticketTable.setItems(tickets);
        }
        catch (IllegalArgumentException ex){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("No Zookeepers");
            alert.setHeaderText("There is no Zookeepers availabe");
            alert.setContentText("Try again later");
            alert.showAndWait();
        }
    }


    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
        credit.setText(String.valueOf(visitor.getCredit()));
        imageAddress=this.visitor.imageAddress;
        if(!imageAddress.isEmpty())
            profile.setFill(new ImagePattern(new Image(imageAddress)));


        firstNameField.setText(visitor.getName());
        lastNameField.setText(visitor.getLastName());
        phoneField.setText(visitor.getPhoneNumber());
        mailField.setText(visitor.getMail());
    }

    public void setMain(Main main) {
        this.main = main;

        birdBox.setVisible(false);
        wildBox.setVisible(false);
        aquaBox.setVisible(false);

        for (int i = 0; i < main.bird.tickets.size(); i++) {
            if(main.bird.tickets.get(i).visitor==this.visitor)
                if(!tickets.contains(main.bird.tickets.get(i)))
                    tickets.add(main.bird.tickets.get(i));

        }
        for (int i = 0; i < main.wild.tickets.size(); i++) {
            if(main.wild.tickets.get(i).visitor==this.visitor)
                if(!tickets.contains(main.wild.tickets.get(i)))
                    tickets.add(main.wild.tickets.get(i));

        }
        for (int i = 0; i < main.aquatic.tickets.size(); i++) {
            if(main.aquatic.tickets.get(i).visitor==this.visitor)
                if(!tickets.contains(main.aquatic.tickets.get(i)))
                    tickets.add(main.aquatic.tickets.get(i));
        }

        ticketTable.setItems(tickets);
        dateColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
        departmentColumn.setCellValueFactory(cellData -> cellData.getValue().deprtmentProperty());
        zookeeperColumn.setCellValueFactory(cellData -> cellData.getValue().zookeeperProperty());

//        guestTable.setItems(this.visitor.guests);
    }

    @FXML
    public void openBrowser(){

        browser= new FileChooser();
        browser.setTitle("Open image");
        browser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png","*.jpeg"));
        File file=browser.showOpenDialog(btn.getScene().getWindow());
        imageAddress=file.toURI().toString();
        profile.setFill(new ImagePattern(new Image(imageAddress)));
        this.visitor.imageAddress=imageAddress;

    }

    @FXML
    public void ticketBuy(){
        tabs.getSelectionModel().selectFirst();
    }


    @FXML
    public void logout(){
        this.visitor=null;
        main.showWelcomeForm();
    }

    @FXML
    public void test(){
        this.visitor.setCredit(this.visitor.getCredit()+500);
        credit.setText(String.valueOf(visitor.getCredit())+"$");
    }

    @FXML
    public void send(){
        Main.messages.add(new SimpleStringProperty(this.visitor.getName()+" "+this.visitor.getLastName()+"\n"+message.getText()));
    }

    @FXML
    private void handleSave() {
        String error="";
        visitor.setName(firstNameField.getText());
        visitor.setLastName(lastNameField.getText());
        visitor.setPhoneNumber(phoneField.getText());
        if (mailField.getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")||mailField.getText().equals(""))
            visitor.setMail(mailField.getText());
        else
            error+="Email not valid!\n     Valid Ex: example@domain.com\n";
        if(!oldPass.getText().isEmpty()&&!newPass.getText().isEmpty()&&!confirmPass.getText().isEmpty()){
            if(String.valueOf(oldPass.getText().hashCode()).equals(visitor.getPass())&&newPass.getText().equals(confirmPass.getText()))
                visitor.setPass(newPass.getText());
            else
                error+="Passwords dont match!\n";
        }
        if (phoneField.getText().matches("[09]{2}[0-9]{9}")||phoneField.getText().equals(""))
            visitor.setPhoneNumber(phoneField.getText());
        else
            error +="Phone not valid!\n     Valid Ex: 09xxxxxxxxx\n";

        if (!error.equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please input valid initials");
            alert.setContentText(error);
            alert.showAndWait();
        }

    }

    @FXML
    public void returnTickets(){
        this.visitor.credit=new SimpleLongProperty(this.visitor.getCredit()+ticketTable.getSelectionModel().getSelectedItem().price*9/10);
        credit.setText(String.valueOf(visitor.getCredit())+"$");
        Main.income=new SimpleLongProperty(Main.income.get()-ticketTable.getSelectionModel().getSelectedItem().price*9/10);
        if(main.bird.tickets.contains(ticketTable.getSelectionModel().getSelectedItem())) {
            main.bird.tickets.remove(ticketTable.getSelectionModel().getSelectedItem());
        }
        if(main.wild.tickets.contains(ticketTable.getSelectionModel().getSelectedItem())) {
            main.wild.tickets.remove(ticketTable.getSelectionModel().getSelectedItem());
        }
        if(main.aquatic.tickets.contains(ticketTable.getSelectionModel().getSelectedItem())) {
            main.aquatic.tickets.remove(ticketTable.getSelectionModel().getSelectedItem());
        }
        tickets.remove(ticketTable.getSelectionModel().getSelectedItem());
    }

}