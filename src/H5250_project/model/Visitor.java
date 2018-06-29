package H5250_project.model;


import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.Serializable;

public class Visitor extends Person implements Serializable ,Showable {

    public LongProperty credit;
    public String imageAddress="";

    public Visitor() {
        super();
        this.credit.set(0);
    }

    public Visitor(String user,String pass,String mail){
        super();
        setUser(user);
        setPass(pass);
        setMail(mail);
        this.credit=new SimpleLongProperty(12500);

    }

    @Override
    public void setPass(String pass) {
        super.setPass(String.valueOf(pass.hashCode()));
    }

    public String getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress;
    }

    public long getCredit() {
        return credit.get();
    }

    public LongProperty creditProperty() {
        return credit;
    }

    public void setCredit(long credit) {
        this.credit.set(credit);
    }

    public StringProperty fullNameProperty(){
        return new SimpleStringProperty(this.name.get()+" "+this.lastName.get());
    }

    @Override
    public void show(){
        System.out.println("[id:"+super.getId()+",name:"+super.getName()+",lastName:"
                +super.getLastName()+",mail:"+super.getMail()+",user:"+super.getUser()+",pass:"+super.getPass());
    }
}
