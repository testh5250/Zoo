package H5250_project.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.Serializable;
import java.util.Objects;

public class ZooKeeper extends Person implements Serializable ,Showable {

    public String address;
    public String department;
    public IntegerProperty wage;

    public ZooKeeper(String department){
        super();
        this.address="";
        this.department=department;
        this.wage=new SimpleIntegerProperty(0);
    }


//    public ZooKeeper(StringProperty name, StringProperty lastName, String user, String pass, String mail, StringProperty phoneNumber, String address, String department, IntegerProperty wage) {
//        super(name, lastName, user, pass, mail, phoneNumber);
//        this.address = address;
//        this.department = department;
//        this.wage = wage;
//    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getWage() {
        return wage.get();
    }

    public IntegerProperty wageProperty() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage.set(Integer.parseInt(wage));
    }

    public StringProperty userProperty(){
        return new SimpleStringProperty(this.getUser());
    }

    @Override
    public void show(){
        System.out.println("[id:"+super.getId()+",name:"+super.getName()+",lastName:"
                +super.getLastName()+",mail:"+super.getMail()+",user:"+super.getUser()+",pass:"+super.getPass());
    }
}
