package H5250_project.model;

import javafx.collections.ObservableList;

import java.io.Serializable;
import java.util.ArrayList;

public class Department implements Serializable , Showable {

    public static int id=0;
    public String name;
    public Long ticketPrice;
    public ObservableList<ZooKeeper> zooKeepers;
    public ObservableList<Animal> animals;
    public ObservableList<Ticket> tickets;

    public Department(String name, Long ticketPrice, ObservableList<ZooKeeper> zooKeepers, ObservableList<Animal> animals, ObservableList<Ticket> tickets) {
        this.name = name;
        this.ticketPrice = ticketPrice;
        this.zooKeepers = zooKeepers;
        this.animals = animals;
        this.tickets = tickets;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Department.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Long ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public void show() {
        System.out.println("[id:" + getId() + ",name:" + getName() + ",ticketPrice:" + getTicketPrice());
    }
}
