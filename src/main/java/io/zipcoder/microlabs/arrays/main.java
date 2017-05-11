package io.zipcoder.microlabs.arrays;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by aurorabanuelos on 5/10/17.
 */
public class main {
    public static void main(String[] args) {
        ArrayParty test = new ArrayParty();

        char[] a = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};

        String[] breakfast = {"Sausage", "Eggs", "Beans", "Eggs", "Sausage"};

        int[] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};


        System.out.println(test.compress(nums));
       // System.out.println(test.pack(a));
    }
}
