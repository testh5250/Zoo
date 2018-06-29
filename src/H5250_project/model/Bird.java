package H5250_project.model;

import javafx.beans.property.StringProperty;

import java.io.Serializable;

public class Bird extends Animal implements Serializable ,Showable{

    public boolean wild;

    public Bird(){
        super();
        super.setDepartment("Bird");
        this.wild=false;
    }


    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    @Override
    public void show(){
        System.out.println("[id:"+super.getId()+",name:"+super.getName()+",nationality:"
                +super.getNationality()+",nationalId:"+super.getNationalId()+",food:"+super.food+",department"+super.getDepartment());
    }
}
