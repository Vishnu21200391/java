package java123;

import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<String> chocolates = new TreeSet<>();
        System.out.println("Chocolates: " + chocolates);

        chocolates.add("Dairy Milk");
        chocolates.add("KitKat");
        chocolates.add("Perk");
        chocolates.add("Munch");
        chocolates.add("5 Star");

        chocolates.remove("Perk");
        chocolates.remove("Munch");

        System.out.println("Chocolates: " + chocolates);

        for (String choco : chocolates) {
            System.out.println(choco);
        }
    }
}
