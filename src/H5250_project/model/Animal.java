package H5250_project.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.Serializable;

public abstract class Animal extends LiveCreature implements Serializable {

    public StringProperty nationality;
    public StringProperty nationalId;
    public String sex;
    public boolean insurance;
    public StringProperty food;
    public String department;

    public Animal() {
        super();
        this.nationality=new SimpleStringProperty("");
        this.nationalId=new SimpleStringProperty("");
        this.food=new SimpleStringProperty("");
        this.sex="";
        this.department="";
        this.insurance=false;
    }

    @Override
    public String getName(){
        return super.name.get();
    }

    @Override
    public StringProperty nameProperty() {
        return super.nameProperty();
    }

    public String getNationality() {
        return nationality.get();
    }

    public StringProperty nationalityProperty() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality.set(nationality);
    }

    public String getNationalId() {
        return nationalId.get();
    }

    public StringProperty nationalIdProperty() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId.set(nationalId);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isInsured() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public String getFood() {
        return food.get();
    }

    public StringProperty foodProperty() {
        return food;
    }

    public void setFood(String food) {
        this.food.set(food);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}