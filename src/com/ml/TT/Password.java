package com.ml.TT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Password {

    private String value;
    private String regex;

    public Password(String regex){
        setRegex(regex);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String pwd) throws Exception{
            Pattern pattern = Pattern.compile(this.regex);
            Matcher matcher = pattern.matcher(pwd);
            boolean matchFound = matcher.matches();
        if(matchFound) {
            System.out.println("La contraseña se seteo correctamente");
            this.value = pwd;
        } else throw new  Exception("La contraseña no coincide con el patrón esperado");

    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
}
