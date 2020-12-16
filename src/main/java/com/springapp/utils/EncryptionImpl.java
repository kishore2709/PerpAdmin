package com.springapp.utils;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//import org.apache.log4j.Logger;

public  class EncryptionImpl implements EncryptionSvc {
    

    
    private static final EncryptionSvc ENCRYPTIONSVC = new EncryptionImpl();
    private String keyPass = "J7UVUvFg9d9OkspNL1ebUfI1Nzr4YYmkP2Yd1jde9n7OaUo3uiifHbIZIIyO6c5";
    private Cipher encodeCipher = null;
    private Cipher decodeCipher = null;

    @Value("${arb.keystore.location}") 
    private String keyStore;
    
    public EncryptionImpl() {
        
        try {
            initCyphers();
        } catch (Exception e) {
            System.out.println("ARBERException encountered while initializing EncryptionSvc.");
        } 
    }
    
    private void initCyphers() throws Exception {

        

        try {
            KeyStore ks = KeyStore.getInstance("JCEKS");
          //key path
        	Resource resource = new ClassPathResource("arb_ks.jks");
           InputStream fis = resource.getInputStream();

            ks.load(fis, null);
            fis.close();
            System.out.println("Encryption file loaded.");
            
            //key alias
            Key privateKey = ks.getKey("ARBARBERkey", keyPass.toCharArray());
            System.out.println("Retrieved the encryption key.");
            
            encodeCipher = Cipher.getInstance("AES");
            encodeCipher.init(Cipher.ENCRYPT_MODE, privateKey);
            System.out.println("Initialized encoding cipher.");
            
            decodeCipher = Cipher.getInstance("AES");
            decodeCipher.init(Cipher.DECRYPT_MODE, privateKey);
            System.out.println("Initialized decoding cipher.");
            
        } catch (KeyStoreException e) {
        	System.out.println("Failed to load keystore. " );
            throw new Exception("Failed to load keystore. " + e.getMessage(), e);
        } catch (FileNotFoundException e) {
        	System.out.println("Failed to open keystore. " );
            throw new Exception("Failed to open keystore. " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e) {
        	System.out.println("Failed to get Cipher instance. " );
            throw new Exception("Failed to get Cipher Instance. " + e.getMessage(), e);
        } catch (CertificateException e) {
        	System.out.println("Failed to retrieve keystore certificate. " );
            throw new Exception("Failed to retrieve keystore certificate. " + e.getMessage(), e);
        } catch (IOException e) {
        	System.out.println("Failed to read keystore. " );
            throw new Exception("Failed to read keystore. " + e.getMessage(), e);
        } catch (UnrecoverableKeyException e) {
        	System.out.println("Failed to retrieve keystore key. " );
            throw new Exception("Failed to retrieve keystore key. " + e.getMessage(), e);
        } catch (NoSuchPaddingException e) {
        	System.out.println("Failed to initialize ciphers. " );
            throw new Exception("Failed to initialize ciphers. " + e.getMessage(), e);
        } catch (InvalidKeyException e) {
        	System.out.println("Failed to retrieve keystore key. " );
            throw new Exception("Failed to retrieve keystore key. " + e.getMessage(), e);
        }
    }
    
    public static EncryptionSvc getInstance() {
        assert ENCRYPTIONSVC != null;

        return ENCRYPTIONSVC;
    }
    
    public String decode(String argText) throws Exception {
        byte[] decoded = {};
        try {
        	 System.out.println(">>>>>>>>>>>>>>>");
        	 System.out.println(">>>>>>>>>>>>>>>"+argText.toCharArray());
            System.out.println(Hex.decodeHex(argText.toCharArray()));

            decoded = decodeCipher.doFinal(Hex.decodeHex(argText.toCharArray()));
            System.out.println(decoded);
        } catch (IllegalBlockSizeException e) {
        	System.out.println("Illegal block size whlie decrypting string. ");
            throw new Exception("Illegal block size whlie decrypting string. " + argText, e);
        } catch (BadPaddingException e) {
        	System.out.println("BadPaddingException whlie decrypting string. " );
            throw new Exception("BadPaddingException whlie decrypting string. " + argText, e);
        } catch (DecoderException de) {
        	System.out.println ("Exception while decoding string. " );
            //throw new Exception("Exception while decoding string. " + argText, de, false);
        }
        return new String(decoded);
    }

	@Override
	public String encode(String argText) throws Exception {

        byte[] encoded = {};
        try {
            encoded = encodeCipher.doFinal(argText.getBytes());
        } catch (IllegalBlockSizeException e) {
            throw new Exception("Illegal block size whlie encrypting string. " + argText, e);
        } catch (BadPaddingException e) {
            throw new Exception("BadPaddingException whlie encrypting string. " + argText, e);
        }
        return new String(Hex.encodeHex(encoded));
    
	}


}
