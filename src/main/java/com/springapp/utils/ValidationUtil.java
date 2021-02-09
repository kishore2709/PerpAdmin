package com.springapp.utils;

import com.springapp.exception.BadRequestException;

import java.util.Optional;

public class ValidationUtil{

    /**
     * 
     * @param optional
     */
    public static void isNull(Optional optional, String entity,String parameter , Object value){
        if(!optional.isPresent()){
            String msg = entity
                         + " does not exist "
                         +"{ "+ parameter +":"+ value.toString() +" }";
            throw new BadRequestException(msg);
        }
    }

    /**
     * Check if it is email
     * @param string
     * @return
     */
    public static boolean isEmail(String string) {
        if (string == null){
            return false;
        }
        String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        return string.matches(regEx1);
    }
}
