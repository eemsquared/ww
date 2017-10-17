package com.dao;

import com.entities.Ship;

import java.sql.Timestamp;
import java.util.List;

public interface Shipdao {

    void createShipTable();
    void insert (Ship ship);
    Ship selectById (int id);
    List<Ship> selectAll();
    List<Ship> selectByName(String name);
    List<Ship> selectByDate(Timestamp timestamp);
    //void delete (int id);day
    void update (Ship ship, int id);
}
