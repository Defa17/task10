package task10.logic;

import task10.logic.Tablet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TabletChoice {
    public static ArrayList<Tablet> listOfCheapTablets(List<Tablet> listOfTablets, int memory, int rate, int quantity) {
        List<Tablet> newList = new ArrayList<>();
        listOfTablets = listOfTablets.stream()
                .sorted(Comparator.comparing(Tablet::getPrice))
                .filter(o -> (o.getMemory() >= memory && o.getRate() >= rate)).toList();
        int count = 0;
        //int currentPrice = 0;
        ArrayList<Tablet> getTablets = new ArrayList<>();

        for (Tablet currentTablet : listOfTablets) {
            if (quantity > count) {
                //currentPrice += currentTablet.getPrice();
                count++;
                getTablets.add(currentTablet);
            }
        }
        return getTablets;
    }

    public static double price(List<Tablet> listOfTablets, int memory, int rate, int quantity) {
        listOfTablets = listOfCheapTablets(listOfTablets, memory, rate, quantity);
        double sum = 0;
        for (Tablet currentTablet : listOfTablets) {
            sum += currentTablet.getPrice();
        }
        return sum;
    }
}
