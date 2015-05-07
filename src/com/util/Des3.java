package com.util;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;


/**
 * 3DES加密工具类
 */
public class Des3 {
	// 密钥24字节密钥
	private final static String secretKey = "b939d3ff-eebd-4b1c-acea-c7b7";
	// 向量
	private final static String iv = "01234567";
	// 加解密统一使用的编码方式
	private final static String encoding = "utf-8";
	private final static String secretType="desede/CBC/PKCS5Padding";
	private final static String desede ="desede";

	/**
	 * 3DES加密
	 * 
	 * @param plainText 普通文本
	 * @return
	 * @throws Exception 
	 */
	public static String encode(String plainText) throws Exception {
		Key deskey = null;
		/*for(byte b:secretKey.getBytes()){
		System.out.println(b);
		}
		System.out.println(secretKey.getBytes().length);*/
		DESedeKeySpec spec = new DESedeKeySpec(secretKey.getBytes());
		SecretKeyFactory keyfactory = SecretKeyFactory.getInstance(desede);
		deskey = keyfactory.generateSecret(spec);

		Cipher cipher = Cipher.getInstance(secretType);
		IvParameterSpec ips = new IvParameterSpec(iv.getBytes());
		cipher.init(Cipher.ENCRYPT_MODE, deskey, ips);
		byte[] encryptData = cipher.doFinal(plainText.getBytes(encoding));
		return Base64.encode(encryptData);
	}

	/**
	 * 3DES解密
	 * 
	 * @param encryptText 加密文本
	 * @return
	 * @throws Exception
	 */
	public static String decode(String encryptText) throws Exception {
		Key deskey = null;
		DESedeKeySpec spec = new DESedeKeySpec(secretKey.getBytes());
		SecretKeyFactory keyfactory = SecretKeyFactory.getInstance(desede);
		deskey = keyfactory.generateSecret(spec);
		Cipher cipher = Cipher.getInstance(secretType);
		IvParameterSpec ips = new IvParameterSpec(iv.getBytes());
		cipher.init(Cipher.DECRYPT_MODE, deskey, ips);

		byte[] decryptData = cipher.doFinal(Base64.decode(encryptText));

		return new String(decryptData, encoding);
	}
	
	
	
	public static void main(String args[]) throws Exception{
		
		String str = "{hd:\"hdfs\"}";
		String str2 ="{userId:\"asda\",startTime:\"2015-03-18 08:56:32\",endTime:\"2015-03-18 09:50:23\"}";
		String encode = encode(str2);
		System.out.println("加密内容:"+encode);
		String decode = decode(encode);
		System.out.println("解密内容:"+decode);
		
	}
}
