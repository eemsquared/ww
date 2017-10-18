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
        Ship ship3 = new Ship("B-6", "25.5-44","Lorcon dumaguete", Timestamp.valueOf("2017-9-21 6:00:00"),
                Timestamp.valueOf("2017-9-21 18:00:00"), "Manila", "Cagayan");
        Ship ship4 = new Ship("B-6", "34.5-44","MCC Palawan", Timestamp.valueOf("2017-9-21 18:00:00"),
                Timestamp.valueOf("2017-9-21 23:00:00"), "Manila", "Cagayan");
        Ship ship5 = new Ship("B-8/9", "49-60","St. Pope John Paul II", Timestamp.valueOf("2017-9-21 16:30:00"),
                Timestamp.valueOf("2017-9-21 20:00:00"), "Manila", "Cagayan");
        Ship ship6 = new Ship("B-8/9", "54-61","Span Asia 32", Timestamp.valueOf("2017-9-21 00:01:00"),
                Timestamp.valueOf("2017-9-21 21:00:00"), "Manila", "Cagayan");
        Ship ship7 = new Ship("B-11", "77-78","Trans Asia 10", Timestamp.valueOf("2017-9-21 05:00:00"),
                Timestamp.valueOf("2017-9-21 20:00:00"), "Cagayan", "Cagayan");
        Ship ship8 = new Ship("B-14/15", "109-110","Filipinas Jagna", Timestamp.valueOf("2017-9-21 05:00:00"),
                Timestamp.valueOf("2017-9-21 19:00:00"), "Cagayan", "Cagayan");

        pdi.insert(ship1);
        pdi.insert(ship2);
        pdi.insert(ship3);
        pdi.insert(ship4);
        pdi.insert(ship5);
        pdi.insert(ship6);
        pdi.insert(ship7);
        pdi.insert(ship8);



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


        List<Ship> ships = pdi.selectAll();
        //List<Ship> ships = pdi.selectByName("Lorcon");
        //List<Ship> ships = pdi.selectByDate(Timestamp.valueOf("2017-9-25 7:00:00"));
        System.out.println();
        for (Ship ship: ships) {
            System.out.println(ship.getId() + ". " + ship.getBerthNumber() + " " + ship.getBollardNumber() + " " + ship.getName() + " "
                    + ship.getETA() + " " + ship.getETD() + " " + ship.getLastPort() + " " + ship.getNextPort());
        }


    }
}
