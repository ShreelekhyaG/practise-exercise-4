package com.company.Java;

public class CharOccurence1 {
    public int countOccurence(String input,String ch){
        return input.length()-input.replace(ch,"").length();
    }
}
