package sinavahazirlik;

import java.util.Scanner;

public class faturaHesaplama {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Adınızı Giriniz : ");
		String ad = giris.nextLine();
		System.out.println("Kullanmak istediğiniz dakika miktarı : ");
		int dk = giris.nextInt();
		System.out.println("Kullanmak istediğiniz SMS miktarı : ");
		int sms = giris.nextInt();
		System.out.println("Kullanmak istediğiniz internet miktarı (GB) : ");
		byte gb = giris.nextByte();
		double ftr = (double) ((dk * 0.5) + (sms * 0.4) + (gb * 12));
		System.out.print("İsim : " + ad);
		System.out.print(" ------ Faturanızın ücreti : " + ftr);
		giris.close();
	}

}
