package H5250_project.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.Serializable;

public abstract class LiveCreature implements Serializable {
    public StringProperty name;
    private static int coutId=0;
    private int id=0;

    public LiveCreature(){
        this.name=new SimpleStringProperty("");

        id=coutId++;
    }

    public LiveCreature(StringProperty name) {
        this.name = name;
        coutId+=1;
        id=coutId;
    }

    public abstract String getName();

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getId() {
        return id;
    }

}
