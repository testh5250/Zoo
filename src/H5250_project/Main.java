package H5250_project;

import H5250_project.model.*;
import javafx.application.Application;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.*;
import java.util.ArrayList;


import H5250_project.controller.*;


public class Main extends Application implements Serializable {


    private Stage primaryStage;
    private BorderPane rootLayout;

    public static ObservableList<Visitor> visitors= FXCollections.observableArrayList();
    public static ObservableList<Manager> managers= FXCollections.observableArrayList();
    public static LongProperty income=new SimpleLongProperty(0);
    public static ObservableList<StringProperty> messages=FXCollections.observableArrayList();

    public static Department wild=new Department("wild",Long.parseLong("1000") , FXCollections.observableArrayList(),FXCollections.observableArrayList(),FXCollections.observableArrayList());
    public static Department bird=new Department("bird",Long.parseLong("1000") , FXCollections.observableArrayList(),FXCollections.observableArrayList(),FXCollections.observableArrayList());
    public static Department aquatic=new Department("aquatic",Long.parseLong("1000") , FXCollections.observableArrayList(),FXCollections.observableArrayList(),FXCollections.observableArrayList());

    public final String superUser="Adminstrator";
    public String superPass="123";
    public String email="hossein.h5250@yahoo.com";

    public Main(){


    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ZOO! By:H5250");

        // Set the application icon.
        //this.primaryStage.getIcons().add(new Image("file:resources/images/address_book_32.png"));

        initRootLayout();

        showWelcomeForm();



        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {

            }
        });
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            rootLayout.setPrefSize(1024,720);
            rootLayout.setMaxSize(1024,720);
            rootLayout.setMinSize(1024,720);

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showWelcomeForm() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/WelcomeForm.fxml"));
            AnchorPane welcomeForm = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(welcomeForm);

            // Give the controller access to the main app.
            WelcomeFormController controller = loader.getController();
            controller.setMain(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showLoginForm() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/LoginForm.fxml"));
            AnchorPane loginForm = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(loginForm);

            // Give the controller access to the main app.
            LoginFormController controller = loader.getController();
            controller.setMain(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showSignUpForm() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/SignUpForm.fxml"));
            AnchorPane signUpForm = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(signUpForm);

            // Give the controller access to the main app.
            SignUpFormController controller = loader.getController();
            controller.setMain(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showSuperAdminForm() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/SuperAdminProfile.fxml"));
            AnchorPane welcomeForm = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(welcomeForm);

            // Give the controller access to the main app.
            SuperAdminProfileController controller = loader.getController();
            controller.setMain(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showStaffForm() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/StaffForm.fxml"));
            AnchorPane signUpForm = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(signUpForm);

            // Give the controller access to the main app.
            StaffFormController controller = loader.getController();
            controller.setMain(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showManagerProfile(Manager manager) {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/ManagerProfile.fxml"));
            AnchorPane ManagerProfile = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(ManagerProfile);

            // Give the controller access to the main app.
            ManagerProfileController controller = loader.getController();
            controller.setManager(manager);
            controller.setMain(this);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showVisitorProfile(Visitor visitor) {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/VisitorProfile.fxml"));
            AnchorPane visitorProfile = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(visitorProfile);

            // Give the controller access to the main app.
            VisitorProfileController controller = loader.getController();
            controller.setVisitor(visitor);
            controller.setMain(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showZooKeeperProfile(ZooKeeper zooKeeper) {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/ZookeeperProfile.fxml"));
            AnchorPane visitorProfile = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(visitorProfile);

            // Give the controller access to the main app.
            ZookeeperProfileController controller = loader.getController();
            controller.setZooKeeper(zooKeeper);
            controller.setMain(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }

}
