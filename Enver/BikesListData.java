package Enver;

import Enver.BikeList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BikeListData {


    public static void main(String[] args) {
        BikeList c1 = new BikeList();
        c1.setVinNum(11);
        c1.setModel("Giant");

        BikeList c2 = new BikeList();
        c2.setVinNum(22);
        c2.setModel("mongoose");

        BikeList c3 = new BikeList();
        c3.setVinNum(33);
        c3.setModel("ideal");

        BikeList c4 = new BikeList();
        c4.setVinNum(33);
        c4.setModel("nirve");

        List AllowingBikeDuplicates = new ArrayList();
        AllowingBikeDuplicates.add(c1);
        AllowingBikeDuplicates.add(c2);
        AllowingBikeDuplicates.add(c3);
        AllowingBikeDuplicates.add(c4);

        System.out.println("The Bikes in the list are " + AllowingBikeDuplicates.size());


        Set NoBikeDuplicates = new HashSet();
        NoBikeDuplicates.add(c1);
        NoBikeDuplicates.add(c2);
        NoBikeDuplicates.add(c3);
        NoBikeDuplicates.add(c4);

        System.out.println("The Bikes in the list are  " + NoBikeDuplicates.size());

    }


}