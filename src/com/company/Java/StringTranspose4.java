package com.company.Java;

import java.util.StringTokenizer;

public class StringTranspose4 {
    public String transpose(String string){
        if(string==null)
            return null;
        String[] stringArr=string.split("\\s");
        String[] result=new String[stringArr.length];
        int index=0;
        StringBuffer buffer=new StringBuffer();
        for(String part:stringArr){
            buffer.append(part);
            buffer.reverse();
            result[index]=buffer.toString();
            buffer.delete(0,part.length());
            index++;
        }
        return String.join(" ",result);
    }
}
