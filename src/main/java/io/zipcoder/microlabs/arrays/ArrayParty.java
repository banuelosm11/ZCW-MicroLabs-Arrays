package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray){

        String output = "*** Output ***\n";

        for(int i = 0; i < inputArray.length; i++){
            if(i == inputArray.length - 1) {
                output += inputArray[i];
            }else{
                output += inputArray[i] + "\n";
            }
        }

        return output;
    }

    public String lastElement(String[] inputArray){

        String output = "*** Output ***\n";

        output += inputArray[inputArray.length - 1];

        return output;
    }

    //TODO Define the method lastButOne

    public String lastButOne(String[] inputArray){

        String output = "*** Output ***\n";

        output += inputArray[inputArray.length - 2];

        return output;
    }

    //TODO Define the method reverse

    public String reverse(String[] inputArray){

        String output = "*** Output ***\n";

        
        return "";
    }

    //TODO Define the method isPalindrome

    //TODO Define the method compress

    //TODO Define the method pack



}
