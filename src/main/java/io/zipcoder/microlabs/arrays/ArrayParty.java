package io.zipcoder.microlabs.arrays;


import java.util.ArrayList;

public class ArrayParty {

    public String printArray(String[] inputArray) {

        String output = "*** Output ***\n";

        for (int i = 0; i < inputArray.length; i++) {
            if (i == inputArray.length - 1) {
                output += inputArray[i];
            } else {
                output += inputArray[i] + "\n";
            }
        }

        return output;
    }

    public String lastElement(String[] inputArray) {

        String output = "*** Output ***\n";

        output += inputArray[inputArray.length - 1];

        return output;
    }

    //TODO Define the method lastButOne

    public String lastButOne(String[] inputArray) {

        String output = "*** Output ***\n";

        output += inputArray[inputArray.length - 2];

        return output;
    }

    //TODO Define the method reverse

    public String reverse(String[] inputArray) {

        String output = "*** Output ***\n";

        for (int i = inputArray.length - 1; i >= 0; i--) {
            output += inputArray[i] + "\n";
        }

        return output;
    }

    //TODO Define the method isPalindrome

    public boolean isPalindrome(String[] inputArray) {


        for (int i = 0; i < inputArray.length / 2; i++) {
            if (!inputArray[i].equals(inputArray[inputArray.length - (i + 1)])) {
                return false;
            }
        }
        return true;
    }

        //TODO Define the method compress

    public ArrayList<Integer> compress(int[] nums){

        ArrayList<Integer> inputArray = new ArrayList<Integer>();

        for(int e: nums){
            inputArray.add(e);
        }

        for(int i=0; i<inputArray.size(); i++) {
            for (int j = 0; j < inputArray.size()-(i+1); j++) {
                if (inputArray.get(i) == inputArray.get(i + 1)) {
                    inputArray.remove(i + 1);
                }
            }
        }
        if(inputArray.get(inputArray.size()-1) == inputArray.get(inputArray.size()-2)){
                inputArray.remove(inputArray.size()-1);
            }

        return inputArray;

    }

        //TODO Define the method pack
    public ArrayList<String> pack(char[] letters){

        for(int i=0; i<letters.length; i++){

        }

        ArrayList<String> inputArray = new ArrayList<String>();




        return inputArray;
    }


}
