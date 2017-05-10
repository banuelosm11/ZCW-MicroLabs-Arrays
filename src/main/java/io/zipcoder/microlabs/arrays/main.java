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


        System.out.println(test.pack(a));
    }
}
