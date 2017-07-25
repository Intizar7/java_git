package tr.org.linux.kamp.caesarcipher;

import java.util.*;

public class CaesarCipher {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bir mesaj girin :");
		String msn = sc.nextLine();
		System.out.println("Sayi gir:");
		int key = sc.nextInt();

		System.out.println("Şifreleme için E, çözümleme için D giriniz: ");
		String op = sc.next();

		if (msn.equals("E")) {
			System.out.println(Encrypt(msn, key));
		} else if (msn.equals("D")) {
			System.out.println(Decrypt(msn, key));
		} else {
			System.out.println("Hatalı bir operasyon seçtiniz.");
		}

	}

	public static String Decrypt(String msg, int key) {

		return Encrypt(msg, -key);
	}

	public static String Encrypt(String message, int key) {
		if (key < 0)
			key = 26 - (-key % 26);
		String result = "";
		for (int i = 0; i < message.length(); i++) {
			char c = message.charAt(i);
			if (Character.isLetter(c)) {
				if (Character.isUpperCase(c)) {
					result += (char) ('A' + (c + key - 'A') % 26);
				} else {
					result += (char) ('a' + (c + key - 'a') % 26);
				}
			} else {
				result += c;
			}
			// burasi tekrar bakılacak mantık yön farklıdır

			/*
			 * if(key%26<='z' || key%26>='a') { System.out.println(message.charAt(i)
			 * +"  -->>  " + (int)message.charAt(i));
			 * System.out.println((int)message.charAt(i)+key +" -->> " +
			 * (char)((int)message.charAt(i)+key)); result +=
			 * (char)((int)message.charAt(i)+key);}
			 */
		}
		return result;
	}
}
