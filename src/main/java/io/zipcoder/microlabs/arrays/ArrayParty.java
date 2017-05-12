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
            if (!inputArray[i].equals(inputArray[inputArray.length - 1 -i])) {
                return false;
            }
        }
        return true;
    }

        //TODO Define the method compress

    public ArrayList<Integer> compress(int[] nums){

        ArrayList<Integer> noDuplicates = new ArrayList<Integer>();

        for(int i=0; i<nums.length-1; i++) {

            if (nums[i] == nums[i + 1] ) {
                if(noDuplicates.isEmpty() || noDuplicates.get(noDuplicates.size()-1) != nums[i]) {
                    noDuplicates.add(nums[i]);
                }
            }
        }

        return noDuplicates;

    }

        //TODO Define the method pack
    public String pack(char[] letters){

        StringBuilder consecutiveChars = new StringBuilder();
        consecutiveChars.append("*** Output ***\n: ");
        consecutiveChars.append(letters[0]);

        for(int i=0; i<letters.length-1; i++){

            if( letters[i] == letters[i+1]){
                consecutiveChars.append(letters[i+1]);
            }else{
                consecutiveChars.append(", " + letters[i+1]);
            }
        }

        return consecutiveChars.toString();
    }


}
