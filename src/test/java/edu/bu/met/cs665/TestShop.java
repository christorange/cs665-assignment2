package edu.bu.met.cs665;

import static org.junit.Assert.*;
import org.junit.Test;
public class TestShop {
    @Test
    public void testShop() {
        String name = "Shop Name";
        String address = "123 Main St";
        String phone = "555-555-5555";

        Shop shop = new Shop(name, address, phone);

        assertEquals(name, shop.getName());
        assertEquals(address, shop.getAddress());
        assertEquals(phone, shop.getPhone());
    }

    @Test
    public void testSetters() {
        String name = "Shop Name";
        String address = "123 Main St";
        String phone = "555-555-5555";

        Shop shop = new Shop(name, address, phone);

        String newName = "New Shop Name";
        String newAddress = "456 Main St";
        String newPhone = "666-666-6666";

        shop.setName(newName);
        shop.setAddress(newAddress);
        shop.setPhone(newPhone);

        assertEquals(newName, shop.getName());
        assertEquals(newAddress, shop.getAddress());
        assertEquals(newPhone, shop.getPhone());
    }
}
