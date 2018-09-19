package com.company.Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOccRegex6 {
    public String occurence(String string,String word){
        if(string==null || word==null)
            return null;
        String regex=word;
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(string);
        String result="";
        while (matcher.find()){
            result=result+matcher.start()+"-"+matcher.end()+" ";
        }
        return result.trim();
    }
}
