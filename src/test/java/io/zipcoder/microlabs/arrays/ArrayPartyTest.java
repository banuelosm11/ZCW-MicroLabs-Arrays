package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayPartyTest {

//    @Test
//    public void printArrayTest(){
//        //: Given
//        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
//        ArrayParty arrayParty = new ArrayParty();
//        String expected = "*** Output ***\n" +
//                "Sausage\n" +
//                "Eggs\n" +
//                "Beans\n" +
//                "Bacon\n" +
//                "Tomatoes\n" +
//                "Mushrooms";
//
//        //: When
//        String actual = arrayParty.printArray(breakfast);
//
//        //: Then
//        Assert.assertEquals("The two string outputs are equal", expected, actual);
//    }
//
//    @Test
//    public void lastElementTest(){
//        //: Given
//        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
//        ArrayParty arrayParty = new ArrayParty();
//        String expected = "*** Output ***\n" +
//                "Mushrooms";
//
//        //: When
//        String actual = arrayParty.lastElement(breakfast);
//
//        //: Then
//        Assert.assertEquals("The two strings are equal", expected, actual);
//    }
//
//    //TODO Define the method lastButOneTest
//
//    @Test
//    public void lastButOneTest(){
//        //: Given
//        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
//        ArrayParty arrayParty = new ArrayParty();
//        String expected = "*** Output ***\n" +
//                "Tomatoes";
//
//        //: When
//        String actual = arrayParty.lastButOne(breakfast);
//
//        //: Then
//        Assert.assertEquals("The two strings are equal", expected, actual);
//    }
//
//    //TODO Define the method reverseTest
//
//    @Test
//    public void reverseTest(){
//        //Given:
//        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
//        ArrayParty arrayParty = new ArrayParty();
//        String expected = "*** Output ***\n" + "Mushrooms\n" + "Tomatoes\n"+
//                "Bacon\n"+"Beans\n"+"Eggs\n"+ "Sausage\n";
//
//        //When:
//        String actual = arrayParty.reverse(breakfast);
//
//        //Then:
//        Assert.assertEquals("The two strings are equal", expected, actual);
//
//    }
//
//    //TODO Define the method isPalindromeTest
//
//    @Test
//    public void isPalindromeTest(){
//
//        //Given:
//        String[] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};
//        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
//        ArrayParty arrayParty = new ArrayParty();
//
//        //When:
//        boolean actualPalindromic = arrayParty.isPalindrome(palindromic);
//        boolean actualBreakfast = arrayParty.isPalindrome(breakfast);
//
//        //Then:
//        Assert.assertTrue(actualPalindromic);
//        Assert.assertFalse(actualBreakfast);
//
//    }

    //TODO Define the method compressTest

    @Test
    public void compressTest(){

        //Given:
        int[] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        ArrayParty arrayParty = new ArrayParty();
        ArrayList<Integer> expected = new ArrayList<Integer>();
        int[]a ={1, 3, 2, 1, 4};
        for(int e: a){
            expected.add(e);
        }


        //When:
        ArrayList<Integer> actual = arrayParty.compress(nums);

        //Then:
        Assert.assertEquals(expected, actual);

    }

    //TODO Define the method packTest

//    @Test
//    public void packTest(){
//
//        //Given:
//        char[] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};
//        ArrayParty arrayParty = new ArrayParty();
//        ArrayList<String> expected = new ArrayList<String>();
//        String[]a ={"aaaa", "b", "cc", "aa", "d", "eeee"};
//        for(String e: a){
//            expected.add(e);
//        }
//
//
//        //When:
//        ArrayList<String> actual = arrayParty.pack(letters);
//
//        //Then:
//        Assert.assertEquals(expected, actual);
//
//    }


}
