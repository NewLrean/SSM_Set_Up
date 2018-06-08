package com.jzp.util;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class SecurityUtils {
	
	public static String toMD5(String input){
		try {
			MessageDigest digest=MessageDigest.getInstance("md5");
			BASE64Encoder encoder=new BASE64Encoder();
			String encode = encoder.encode(digest.digest(input.getBytes()));
			return encode;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		return "加密失败";
		
	}
	
	public static String BASE64(String input){
		
		
		BASE64Encoder encoder=new BASE64Encoder();
		
		String encode = encoder.encode(input.getBytes());
		return encode;
		
		
		
	}
	
	public static String BASE64D(String input){
		BASE64Decoder decoder=new BASE64Decoder();
		
		try {
			byte[] decodeBuffer = decoder.decodeBuffer(input);
			return new String(decodeBuffer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "解密失败";
		
	}
}
