package sinavahazirlik;

import java.util.Scanner;

public class aileMaasHesaplama {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("İsminizi Giriniz : ");
		String ad = giris.nextLine();
		System.out.println("Çocuk Sayısını Giriniz : ");
		int cs = giris.nextInt();
		System.out.println("Medeni Durumunuz(e/b) : ");
		String mdn = giris.next();
		while (!mdn.equalsIgnoreCase("e") && !mdn.equalsIgnoreCase("b")) {
			System.out.println("Geçersiz medeni durumu! Tekrar Deneyiniz(e/b) : ");
			mdn = giris.next();
		}

		System.out.println("Maaşınızı Giriniz(TL) : ");
		int maas = giris.nextInt();
		if (cs > 0) {
			maas += cs * 500;
		} else {

		}
		if (mdn.equalsIgnoreCase("e")) {
			maas += 1000;
		} else {

		}
		System.out.println("Kişinin adı : " + ad);
		System.out.println("Çocuk Sayısı : " + cs);
		System.out.println("Medeni Durumu : " + mdn);
		System.out.println("Maaşı : " + maas);
		giris.close();
	}

}
