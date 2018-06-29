package H5250_project.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.Serializable;

public class Wild extends Animal implements Serializable ,Showable{

    public StringProperty home;

    public Wild() {
        super();
        super.setDepartment("Wild");
        this.home=new SimpleStringProperty("");
    }

    public String getHome() {
        return home.get();
    }

    public StringProperty homeProperty() {
        return home;
    }

    public void setHome(String home) {
        this.home.set(home);
    }

    @Override
    public void show(){
        System.out.println("[id:"+super.getId()+",name:"+super.getName()+",nationality:"
                +super.getNationality()+",nationalId:"+super.getNationalId()+",food:"+super.food+",department"+super.getDepartment());
    }
}
