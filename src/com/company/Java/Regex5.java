package com.company.Java;

import java.util.regex.Pattern;

public class Regex5 {
    public boolean checkPresence(String string){
        String regex="\\bHarry\\b";
        Pattern pattern=Pattern.compile(regex);
        if(pattern.matcher(string).find())
            return true;
        else
            return false;
    }
}
