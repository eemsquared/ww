import com.entities.Ship;
import com.impl.ShipDaoImp;

import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ShipDaoImp pdi = new ShipDaoImp();
        Scanner scanner = new Scanner(System.in);




        pdi.createShipTable();

        Ship ship1 = new Ship("B-2/3", "7-16","Chattanooga", Timestamp.valueOf("2017-9-21 7:00:00"),
                Timestamp.valueOf("2017-9-21 22:00:00"), "Taiwan", "Taiwan");
        Ship ship2 = new Ship("B-5", "26-33","VTB", Timestamp.valueOf("2017-9-21 7:00:00"),
                Timestamp.valueOf("2017-9-29 7:00:00"), "Vietnam", "TBA");
        Ship ship4 = new Ship("B-5", "26-33","Lorcon", Timestamp.valueOf("2017-9-21 7:00:00"),
                Timestamp.valueOf("2017-9-21 19:00:00"), "Vietnam", "TBA");

        //pdi.insert(ship1);
        //pdi.insert(ship2);
        //pdi.insert(ship4);

        /*
        Ship shipp = pdi.selectById(2);
        System.out.println(shipp.getBerthNumber() + " " + shipp.getBollardNumber() + " " + shipp.getId() + " " + shipp.getName() + " " + shipp.getETA()
                + " " + shipp.getETD() + " " + shipp.getLastPort() + " " + shipp.getNextPort());
        */

        //pdi.delete(1);

        //Ship shipe  = new Ship("B-6", "35.5-44", "Lorcon", "0600H-09-21-17", "1800H-0921-17", "Manila", "Cagayan");
        //pdi.update(shipe, 5);
        //pdi.update(ship1, 1);

        /*
        System.out.println("Input data");
        System.out.println("Berth Number: ");
        String berth = scanner.next();
        System.out.println("Bollard Number: ");
        String bollard = scanner.next();
        System.out.println("Name of Vessel: ");
        String name = scanner.next();
        System.out.println("Estimated time of arrival: ");
        String eta = scanner.next();
        System.out.println("Estimated time of departure: ");
        String etd = scanner.next();
        System.out.println("Last Port: ");
        String lp = scanner.next();
        System.out.println("Next Port: ");
        String np = scanner.next();

        Ship ship3 = new Ship(berth, bollard, name, eta, etd, lp, np);
        pdi.insert(ship3);
        */


        //List<Ship> ships = pdi.selectAll();
        //List<Ship> ships = pdi.selectByName("Lorcon");
        List<Ship> ships = pdi.selectByDate(Timestamp.valueOf("2017-9-25 7:00:00"));
        System.out.println();
        for (Ship ship: ships) {
            System.out.println(ship.getId() + ". " + ship.getBerthNumber() + " " + ship.getBollardNumber() + " " + ship.getName() + " "
                    + ship.getETA() + " " + ship.getETD() + " " + ship.getLastPort() + " " + ship.getNextPort());
        }


    }
}
