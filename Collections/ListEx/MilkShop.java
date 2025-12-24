package ListEx;

import java.util.HashMap;

public class MilkShop {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Milk");
        map.put(200, "Mango");
        map.put(10, "Maggie");
        map.put(30, "Biscuit");
        map.put(50, "Sugar");

        String name = map.get(100);
        System.out.println("100 Price = " + name);
        map.remove(10);
        System.out.println(map);

    }
}
