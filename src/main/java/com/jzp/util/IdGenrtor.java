package com.jzp.util;

import java.math.BigInteger;
import java.util.Random;

public class IdGenrtor {
	public static String getGUID(){
		String upperCase = new BigInteger(165,new Random()).toString(36).toUpperCase();
		String str=upperCase+"_";
		return str;
	}
}
