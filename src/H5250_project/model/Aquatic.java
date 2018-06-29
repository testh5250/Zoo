package H5250_project.model;

import javafx.beans.property.StringProperty;

public class Aquatic extends Animal implements Showable {

    public boolean carnivorous;

    public Aquatic() {
        super();
        setDepartment("Aquatic");
        this.carnivorous=false;
    }

    public boolean isCarnivorous() {
        return carnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }

    @Override
    public void show(){
        System.out.println("[id:"+super.getId()+",name:"+super.getName()+",nationality:"
                +super.getNationality()+",nationalId:"+super.getNationalId()+",food:"+super.food+",department"+super.getDepartment());
    }
}
