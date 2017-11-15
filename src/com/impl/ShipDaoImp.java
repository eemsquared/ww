package com.impl;

import com.dao.Shipdao;
import com.entities.Ship;
import com.util.ConnectionConfiguration;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShipDaoImp implements Shipdao{

    @Override
    public void createShipTable() {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = ConnectionConfiguration.getConnection();
            statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS ship(id int primary key unique auto_increment," +
                    "vessel_name varchar(60), voyage_no varchar(60), nationality varchar(60), GRT float, LOA float," +
                    "last_port varchar(60), next_port varchar(60), berth_pref varchar(60), master varchar(60), NRT float, DWT float," +
                    "beam float, ETA timestamp, ETD timestamp, draft_fwd float, draft_aft float, berth_post varchar(60), " +
                    "bollard varchar(60), remarks mediumtext, filled varchar(60))");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void insert(Ship ship) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO ship (vessel_name, voyage_no, nationality, GRT, " +
                    "LOA, last_port, next_port, berth_pref, master, NRT, DWT, beam, ETA, ETD, draft_fwd, draft_aft, berth_post," +
                    "bollard, remarks, filled)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, ship.getVessel_name());
            preparedStatement.setString(2, ship.getVoyage_num());
            preparedStatement.setString(3, ship.getNationality());
            preparedStatement.setFloat(4, ship.getGRT());
            preparedStatement.setFloat(5, ship.getLOA());
            preparedStatement.setString(6, ship.getLast_port());
            preparedStatement.setString(7, ship.getNext_port());
            preparedStatement.setString(8, ship.getBerth_pref());
            preparedStatement.setString(9, ship.getMaster());
            preparedStatement.setFloat(10, ship.getNRT());
            preparedStatement.setFloat(11, ship.getDWT());
            preparedStatement.setFloat(12, ship.getBeam());
            preparedStatement.setTimestamp(13, ship.getETA());
            preparedStatement.setTimestamp(14, ship.getETD());
            preparedStatement.setFloat(15, ship.getDraft_fwd());
            preparedStatement.setFloat(16, ship.getDraft_aft());
            preparedStatement.setString(17, ship.getBerth_post());
            preparedStatement.setString(18, ship.getBollard());
            preparedStatement.setString(19, ship.getRemarks());
            preparedStatement.setString(20, ship.getFilled());
            preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public Ship selectById(int id) {
        Ship ship = new Ship();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM ship WHERE id = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                ship.setVessel_name(resultSet.getString("vessel_name"));
                ship.setVoyage_num(resultSet.getString("voyage_no"));
                ship.setNationality(resultSet.getString("nationality"));
                ship.setGRT(resultSet.getFloat("GRT"));
                ship.setLOA(resultSet.getFloat("LOA"));
                ship.setLast_port(resultSet.getString("last_port"));
                ship.setNext_port(resultSet.getString("next_port"));
                ship.setBerth_pref(resultSet.getString("berth_pref"));
                ship.setMaster(resultSet.getString("master"));
                ship.setNRT(resultSet.getFloat("NRT"));
                ship.setDWT(resultSet.getFloat("DWT"));
                ship.setBeam(resultSet.getFloat("beam"));
                ship.setETA(resultSet.getTimestamp("ETA"));
                ship.setETD(resultSet.getTimestamp("ETD"));
                ship.setDraft_fwd(resultSet.getFloat("draft_fwd"));
                ship.setDraft_aft(resultSet.getFloat("draft_aft"));
                ship.setBerth_post(resultSet.getString("berth_post"));
                ship.setBollard(resultSet.getString("bollard"));
                ship.setRemarks(resultSet.getString("remarks"));
                ship.setFilled(resultSet.getString("filled"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return ship;
    }

    @Override
    public List<Ship> selectAll() {
        List <Ship> ships = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionConfiguration.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM ship");

            while (resultSet.next()) {
                Ship ship = new Ship();
                ship.setVessel_name(resultSet.getString("vessel_name"));
                ship.setVoyage_num(resultSet.getString("voyage_no"));
                ship.setNationality(resultSet.getString("nationality"));
                ship.setGRT(resultSet.getFloat("GRT"));
                ship.setLOA(resultSet.getFloat("LOA"));
                ship.setLast_port(resultSet.getString("last_port"));
                ship.setNext_port(resultSet.getString("next_port"));
                ship.setBerth_pref(resultSet.getString("berth_pref"));
                ship.setMaster(resultSet.getString("master"));
                ship.setNRT(resultSet.getFloat("NRT"));
                ship.setDWT(resultSet.getFloat("DWT"));
                ship.setBeam(resultSet.getFloat("beam"));
                ship.setETA(resultSet.getTimestamp("ETA"));
                ship.setETD(resultSet.getTimestamp("ETD"));
                ship.setDraft_fwd(resultSet.getFloat("draft_fwd"));
                ship.setDraft_aft(resultSet.getFloat("draft_aft"));
                ship.setBerth_post(resultSet.getString("berth_post"));
                ship.setBollard(resultSet.getString("bollard"));
                ship.setRemarks(resultSet.getString("remarks"));
                ship.setFilled(resultSet.getString("filled"));
                ships.add(ship);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return ships;
    }

    @Override
    public List<Ship> selectByName(String name) {
        List <Ship> ships = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM ship WHERE name = ?");
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Ship ship = new Ship();
                ship.setId(resultSet.getInt("id"));
                ship.setETA(resultSet.getTimestamp("ETA"));
                ship.setETD(resultSet.getTimestamp("ETD"));
                ship.setLast_port(resultSet.getString("last_port"));
                ship.setNext_port(resultSet.getString("next_port"));

                ships.add(ship);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return ships;
    }

    @Override
    public List<Ship> selectByDate(Timestamp timestamp) {
        List <Ship> ships = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM ship WHERE ETA <= ? and ETD >= ?");
            preparedStatement.setTimestamp(1, timestamp);
            preparedStatement.setTimestamp(2, timestamp);
            resultSet = preparedStatement.executeQuery();

            System.out.println("SELECT * FROM ship WHERE timestamp >= ETA and timestamp <= ETD");
            while (resultSet.next()) {
                Ship ship = new Ship();
                ship.setId(resultSet.getInt("id"));
                ship.setETA(resultSet.getTimestamp("ETA"));
                ship.setETD(resultSet.getTimestamp("ETD"));
                ship.setLast_port(resultSet.getString("last_port"));
                ship.setNext_port(resultSet.getString("next_port"));

                ships.add(ship);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return ships;
    }

    /*
    @Override
    public void delete(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("DELETE FROM ship WHERE id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            System.out.println("DELETE FROM ship WHERE id = ?");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
*/
    @Override
    public void update(Ship ship, int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
    /*
        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE ship SET " +
                    "berth_number = ?, bollard_number = ?, name = ?, ETA = ?, ETD = ?, last_port = ?, next_port = ? WHERE id = ?");
            preparedStatement.setInt(8, id);
            preparedStatement.setString(1, ship.getBerthNumber());
            preparedStatement.setString(2, ship.getBollardNumber());
            preparedStatement.setString(3, ship.getName());
            preparedStatement.setTimestamp(4, ship.getETA());
            preparedStatement.setTimestamp(5, ship.getETD());
            preparedStatement.setString(6, ship.getLastPort());
            preparedStatement.setString(7, ship.getNextPort());
            preparedStatement.executeUpdate();

            System.out.println("UPDATE ship SET " +
                    "berth_number = ?, bollard_number = ?, name = ?, ETA = ?, ETD = ?, last_port = ?, next_port = ? WHERE id = ?");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }
}
