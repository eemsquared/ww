import com.entities.Ship;
import com.impl.ShipDaoImp;

import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ShipDaoImp pdi = new ShipDaoImp();

        pdi.createShipTable();


        Ship ship1 = new Ship("MV Daniel V", "n/a", "Filipino", Float.valueOf("499"), Float.valueOf("63"), "Subic", "Subic", "B-23", "Capt. Cesar Arino",
                Float.valueOf("349"), Float.valueOf("2000"), Float.valueOf("13"), Timestamp.valueOf("2017-10-20 14:00:00"), Timestamp.valueOf("2017-10-26 14:00:00"), Float.valueOf("5.3"),
                Float.valueOf("4.9"), "North Tip", "179-182","to take place MV Evernin II", "True");

        Ship ship2 = new Ship("MV Jeselle", "n/a", "Filipino", Float.valueOf("739"), Float.valueOf("72"), "Subic", "Subic", "B-23", "Capt. Felicito Tamparong",
                Float.valueOf("480"), Float.valueOf("2700"), Float.valueOf("12.8"), Timestamp.valueOf("2017-11-28 21:00:00"), Timestamp.valueOf("2017-11-14 24:00:00"), Float.valueOf("4"),
                Float.valueOf("1"), "North Corner", "180-184","to take place MV Allen V", "True");

        Ship ship3 = new Ship("MV Benjamin", "n/a", "Filipino", Float.valueOf("953"), Float.valueOf("66"), "San Fernando", "Dumaguete", "B-23", "Capt. Cartella",
                Float.valueOf("0"), Float.valueOf("0"), Float.valueOf("328"), Timestamp.valueOf("2017-10-27 12:00:00"), Timestamp.valueOf("2017-11-2 20:00:00"), Float.valueOf("5.4"),
                Float.valueOf("4.6"), "North Corner", "179-182","to take place MV Evernin II", "True");

        Ship ship4 = new Ship("MV Lapu-Lapu Ferry 8", "1156", "Filipino", Float.valueOf("114.69"), Float.valueOf("40.06"), "Baybay, Leyte", "Baybay, Leyte", "B-22", "Romme Sulajes",
                Float.valueOf("93.32"), Float.valueOf("100"), Float.valueOf("7.31"), Timestamp.valueOf("2017-10-20 07:00:00"), Timestamp.valueOf("2017-10-20 20:00:00"), Float.valueOf("1.2"),
                Float.valueOf("2.1"), "Pontoon", "179-182"," ", "True");

        Ship ship5 = new Ship("MV Lapu-Lapu Ferry 8", "1156", "Filipino", Float.valueOf("114.69"), Float.valueOf("40.06"), "Baybay, Leyte", "Baybay, Leyte", "B-22", "Romme Sulajes",
                Float.valueOf("93.32"), Float.valueOf("100"), Float.valueOf("7.31"), Timestamp.valueOf("2017-10-18 07:00:00"), Timestamp.valueOf("2017-10-18 20:00:00"), Float.valueOf("1.2"),
                Float.valueOf("2.1"), "Pontoon", "179-182"," ", "True");

        Ship ship6 = new Ship("MV Lapu-Lapu Ferry 8", "1156", "Filipino", Float.valueOf("114.69"), Float.valueOf("40.06"), "Baybay, Leyte", "Baybay, Leyte", "B-22", "Romme Sulajes",
                Float.valueOf("93.32"), Float.valueOf("100"), Float.valueOf("7.31"), Timestamp.valueOf("2017-10-24 07:00:00"), Timestamp.valueOf("2017-10-24 20:00:00"), Float.valueOf("1.2"),
                Float.valueOf("2.1"), "Pontoon", "179-182"," ", "True");

        Ship ship7 = new Ship("MV Lapu-Lapu Ferry 8", "1156", "Filipino", Float.valueOf("114.69"), Float.valueOf("40.06"), "Baybay, Leyte", "Baybay, Leyte", "B-22", "Romme Sulajes",
                Float.valueOf("93.32"), Float.valueOf("100"), Float.valueOf("7.31"), Timestamp.valueOf("2017-10-26 07:00:00"), Timestamp.valueOf("2017-10-26 20:00:00"), Float.valueOf("1.2"),
                Float.valueOf("2.1"), "Pontoon", "179-182"," ", "True");

        Ship ship8 = new Ship("MV Everwin 9", "n/a", "Filipino", Float.valueOf("135"), Float.valueOf("72.72"), "Batangas", "Batangas", "B-23", "Capt. Chito Capunong",
                Float.valueOf("809"), Float.valueOf("0"), Float.valueOf("18"), Timestamp.valueOf("2017-10-05 20:00:00"), Timestamp.valueOf("2017-10-10 20:00:00"), Float.valueOf("4.83"),
                Float.valueOf("4.87"), "South Corner", "179-182","to take place Everwin 5", "True");

        Ship ship9 = new Ship("MV Nico Bryan", "1015CZ2017", "Filipino", Float.valueOf("244.42"), Float.valueOf("49"), "Zamboanga City", "Zamboanga City", "B-22", "Capt. Jovie Relampagos",
                Float.valueOf("122.7"), Float.valueOf("0"), Float.valueOf("9"), Timestamp.valueOf("2017-10-13 06:00:00"), Timestamp.valueOf("2017-10-15 24:00:00"), Float.valueOf("3.80"),
                Float.valueOf("4.00"), "South Corner", "179-182"," ", "True");

        Ship ship10 = new Ship("MV Rondel", "n/a", "Filipino", Float.valueOf("248.34"), Float.valueOf("49"), "Dumaguete City", "Dumaguete City", "B-23", "Capt. j. Allic",
                Float.valueOf("152.25"), Float.valueOf("454.25"), Float.valueOf("8.8"), Timestamp.valueOf("2017-08-23 08:00:00"), Timestamp.valueOf("2017-08-26 24:00:00"), Float.valueOf("2.8"),
                Float.valueOf("3.8"), "North Corner", "179-182","to take place Dhane but to temporary dock  B-23 tip after shifting to give way NFA vessels", "True");



        pdi.insert(ship1);
        pdi.insert(ship2);
        pdi.insert(ship3);
        pdi.insert(ship4);
        pdi.insert(ship5);
        pdi.insert(ship6);
        pdi.insert(ship7);
        pdi.insert(ship8);
        pdi.insert(ship9);
        pdi.insert(ship10);



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

        /*
        List<Ship> ships = pdi.selectAll();
        //List<Ship> ships = pdi.selectByName("Lorcon");
        //List<Ship> ships = pdi.selectByDate(Timestamp.valueOf("2017-9-25 7:00:00"));
        System.out.println();
        for (Ship ship: ships) {
            System.out.println(ship.getId() + ". " + ship.getBerthNumber() + " " + ship.getBollardNumber() + " " + ship.getName() + " "
                    + ship.getETA() + " " + ship.getETD() + " " + ship.getLastPort() + " " + ship.getNextPort()+ " " + ship.getApprove());
        }*/


    }
}
