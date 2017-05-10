package io.zipcoder.microlabs.arrays;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by aurorabanuelos on 5/10/17.
 */
public class main {
    public static void main(String[] args) {
        ArrayParty test = new ArrayParty();

        int[] a = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};


        System.out.println(test.compress(a));
    }
}
