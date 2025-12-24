package ListEx;

import java.util.HashMap;

public class MilkShop {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        map.put("Milk", 100);
        map.put("Mango",312);
        map.put("Maggie",212);
        map.put("Biscuit",21);
        map.put("Sugar",231);

        String price = String.valueOf(map.get("Milk"));
        System.out.println("Milk Price Of = " + price + "rs");
        map.remove("Maggie");
        System.out.println(map);

    }
}
