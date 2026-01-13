package ch14_casting.items.system;

import ch14_casting.items.Bow;
import ch14_casting.items.Staff;
import ch14_casting.items.Sword;

public class Main {
    public static void main(String[] args) {
        Inventory myInventory = new Inventory(5);

        myInventory.addWeapon(new Sword());
        myInventory.addWeapon(new Bow());
        myInventory.addWeapon(new Staff());


        myInventory.attackAll();




}
}

