package com.springapp.utils;




public interface EncryptionSvc {
    
    String encode(String argText) throws Exception;
    
    String decode(String argText) throws Exception;

}
