package H5250_project.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Ticket implements Serializable {

    public Long price;
    public int count;
    public String department;
    public Visitor visitor;
    public LocalDate date;
    public ZooKeeper zooKeeper;

    public Ticket(Long price, int count, String department, Visitor visitor, LocalDate date, ZooKeeper zooKeeper) {
        this.price = price;
        this.count = count;
        this.department = department;
        this.visitor = visitor;
        this.date = date;
        this.zooKeeper = zooKeeper;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public StringProperty deprtmentProperty(){
        return new SimpleStringProperty(this.department);
    }
    public StringProperty dateProperty(){
        return new SimpleStringProperty(this.date.toString());
    }
    public StringProperty zookeeperProperty(){
        return new SimpleStringProperty(this.zooKeeper.getName()+" "+this.zooKeeper.getLastName());
    }
    public StringProperty countProperty(){
        return new SimpleStringProperty(this.count+"");
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ZooKeeper getZooKeeper() {
        return zooKeeper;
    }

    public void setZooKeeper(ZooKeeper zooKeeper) {
        this.zooKeeper = zooKeeper;
    }
}
