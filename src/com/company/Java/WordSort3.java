package com.company.Java;

import java.util.Arrays;

public class WordSort3 {
    public String sortString(String string){
        if(string==null)
            return null;
        String strArray[]=string.split("\\s");
        Arrays.sort(strArray);
        return String.join(" ",strArray);
    }
}
