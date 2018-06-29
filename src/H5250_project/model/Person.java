package H5250_project.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.Serializable;

public abstract class Person extends LiveCreature implements Serializable {

    public StringProperty lastName;
    private String user;
    private String pass;
    public String mail;
    public StringProperty phoneNumber;

    public Person() {
        super();
        this.lastName = new SimpleStringProperty("");
        this.user = "";
        this.pass = "";
        this.mail = "";
        this.phoneNumber = new SimpleStringProperty("");
    }

    @Override
    public String getName(){
        return super.name.get();
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user=user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass=pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail=mail;
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public StringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }
}
