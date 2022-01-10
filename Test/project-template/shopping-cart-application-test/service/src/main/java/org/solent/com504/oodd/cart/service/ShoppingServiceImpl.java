/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.oodd.cart.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.solent.com504.oodd.cart.model.service.ShoppingCart;
import org.solent.com504.oodd.cart.model.dto.ShoppingItem;
import org.solent.com504.oodd.cart.model.service.ShoppingService;

/**
 *
 * @author cgallen
 */

public class ShoppingServiceImpl implements ShoppingService {

    // note ConcurrentHashMap instead of HashMap if map can be altered while being read
    private Map<String, ShoppingItem> itemMap = new ConcurrentHashMap<String, ShoppingItem>();

    private List<ShoppingItem> itemlist = Arrays.asList(new ShoppingItem("house", 20000.00, 1),
            new ShoppingItem("hen", 5.00, 1),
            new ShoppingItem("car", 5000.00, 1),
            new ShoppingItem("pet alligator", 65.00, 1)
    );

    public ShoppingServiceImpl() {

        // initialised the hashmap
        for (ShoppingItem item : itemlist) {
            itemMap.put(item.getName(), item);
        }
    }

    @Override
    public List<ShoppingItem> getAvailableItems() {
        return itemlist;
    }

    @Override
    public boolean purchaseItems(ShoppingCart shoppingCart) {
        System.out.println("purchased items");
        for (ShoppingItem shoppingItem : shoppingCart.getShoppingCartItems()) {
            System.out.println(shoppingItem);
        }

        return true;
    }

    @Override
    public ShoppingItem getNewItemByName(String name) {
        ShoppingItem templateItem = itemMap.get(name);
        
        if(templateItem==null) return null;
        
        ShoppingItem item = new ShoppingItem();
        item.setName(name);
        item.setPrice(templateItem.getPrice());
        item.setQuantity(0);
        item.setUuid(UUID.randomUUID().toString());
        return item;
    }

}
