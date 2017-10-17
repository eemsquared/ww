package com.entities;
import java.sql.Timestamp;

public class Ship {
    private int id;
    private String berthNumber;
    private String bollardNumber;
    private String name;
    private Timestamp ETA;
    private Timestamp ETD;
    private String lastPort;
    private String nextPort;


    public Ship() {
    }

    public Ship(String berthNumber, String bollardNumber, String name, Timestamp ETA, Timestamp ETD, String lastPort, String nextPort) {
        this.berthNumber = berthNumber;
        this.bollardNumber = bollardNumber;
        this.name = name;
        this.ETA = ETA;
        this.ETD = ETD;
        this.lastPort = lastPort;
        this.nextPort = nextPort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBerthNumber() {
        return berthNumber;
    }

    public void setBerthNumber(String berthNumber) {
        this.berthNumber = berthNumber;
    }

    public String getBollardNumber() {
        return bollardNumber;
    }

    public void setBollardNumber(String bollardNumber) {
        this.bollardNumber = bollardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getETA() {
        return ETA;
    }

    public void setETA(Timestamp ETA) {
        this.ETA = ETA;
    }

    public Timestamp getETD() {
        return ETD;
    }

    public void setETD(Timestamp ETD) {
        this.ETD = ETD;
    }

    public String getLastPort() {
        return lastPort;
    }

    public void setLastPort(String lastPort) {
        this.lastPort = lastPort;
    }

    public String getNextPort() {
        return nextPort;
    }

    public void setNextPort(String nextPort) {
        this.nextPort = nextPort;
    }
}
