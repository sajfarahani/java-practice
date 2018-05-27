package com.example.mypackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItem> list;

    public StockList(Map<String, StockItem> list) {
        this.list = new HashMap<>();
    }

    public int addStock(StockItem item){
        if(item!=null){
            //Check if already have quantities of this item
            StockItem intStcok = list.get(item.getName(), item);
            //If there are already stocks on this item, adjust the quantity
            if(intStcok !=item){
                item.adjustStock(intStcok.quantityInStock());
            }
            list.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity){
        StockItem intStock = list.getOrDefault(item, null);
        if((intStock !=null ) && (intStock.quantityInStock() >= quantity) && (quantity >0)){
            intStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key){
        return list.get(key);
    }
    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for(Map.Entry<String, StockItem> item: list.entrySet()){
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice()*stockItem.quantityInStock();

            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
            s = s + itemValue + "\n";
            totalCost += itemValue;
        }
        return s + "Total stock value" + totalCost;
    }
}
