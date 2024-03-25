package sinavahazirlik;

import java.util.Scanner;

public class akaryakitHesaplama {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Hoş Geldiniz!\n----------------");
		System.out.println("Sisteme girilecek satış sayısı : ");
		int stsmktr = giris.nextInt();
		String ykt[] = new String[stsmktr];
		int ltr[] = new int[stsmktr];
		int fiyat[] = new int[stsmktr];
		byte menu;
		for (int i = 0; i < stsmktr; i++) {
			System.out.println("Satılan Yakıt Türü : ");
			ykt[i] = giris.next();
			while (!ykt[i].equalsIgnoreCase("dizel") && !ykt[i].equalsIgnoreCase("benzin")
					&& !ykt[i].equalsIgnoreCase("lpg")) {
				System.out.println("Geçersiz yakıt türü! tekrar deneyiniz : ");
				ykt[i] = giris.next();
			}
			System.out.println("Satılan Litre Miktarı : ");
			ltr[i] = giris.nextInt();
		}
		for (;;) {
			System.out.println("1-Toplam satış ücreti\n2-Toplam satılan lire");
			menu = giris.nextByte();
			switch (menu) {
			case 1:
				for (int i = 0; i < stsmktr; i++) {
					if (ykt[i].equalsIgnoreCase("dizel")) {
						fiyat[i] = (int) (ltr[i] * 40);
					} else if (ykt[i].equalsIgnoreCase("benzin")) {
						fiyat[i] = (int) (ltr[i] * 42);
					} else if (ykt[i].equalsIgnoreCase("lpg")) {
						fiyat[i] = (int) (ltr[i] * 20);
					}
					System.out.println(
							"Yakıt Türü: " + ykt[i] + ", Satılan Litre: " + ltr[i] + ", Ücret: " + fiyat[i] + " TL");
				}

				break;
			case 2:
				int toplamLitre = 0;
				for (int i = 0; i < stsmktr; i++) {
					toplamLitre += ltr[i];
				}
				System.out.println("Toplam satılan litre: " + toplamLitre);
				break;
			default:
				giris.close();
				break;
			}
		}

	}

}
