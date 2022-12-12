package com.toy._01_creational_patterns._03_abstract_factory._02_after;

import com.toy._01_creational_patterns._02_factory_method._02_after.Ship;
import com.toy._01_creational_patterns._02_factory_method._02_after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipPartsFactory shipPartsFactory = new WhiteshipPartsFactory();
        ShipFactory shipFactory = new WhiteshipFactory(shipPartsFactory);

        Ship ship = shipFactory.createShip();

        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
