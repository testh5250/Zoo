package H5250_project.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.Serializable;

public class Manager extends Person implements Serializable ,Showable {

    public StringProperty address;
    public IntegerProperty wage;

    public Manager() {
        super();
        this.address=new SimpleStringProperty("");
        this.wage=new SimpleIntegerProperty(0);
    }

    public String getAddress() {
        return address.get();
    }

    public StringProperty addressProperty() {
        return address;
    }

    public void setAddress(String address) {
        this.address.set(address);
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
    @Override
    public void show(){
        System.out.println("[id:"+super.getId()+",name:"+super.getName()+",lastName:"
                +super.getLastName()+",mail:"+super.getMail()+",user:"+super.getUser()+",pass:"+super.getPass());
    }
}
