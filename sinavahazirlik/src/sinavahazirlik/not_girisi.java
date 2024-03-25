package sinavahazirlik;

import java.util.Scanner;

public class not_girisi {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Kişi Sayısını Giriniz : ");
        int ks = giris.nextInt();
        String ad[] = new String[ks];
        String harf[] = new String[ks];
        String durum[] = new String[ks];
        byte vize[] = new byte[ks];
        byte Final[] = new byte[ks];
        byte basariNotu[] = new byte[ks];
        byte menu;

        for (int i = 0; i < ks; i++) {

            System.out.println("İsim Giriniz : ");
            giris.nextLine();
            ad[i] = giris.nextLine();
            System.out.println("Vize Notunu Giriniz : ");
            vize[i] = giris.nextByte();
            System.out.println("Final Notunu Giriniz : ");
            Final[i] = giris.nextByte();
            basariNotu[i] = (byte) (vize[i] * 0.4 + Final[i] * 0.6);
            if (basariNotu[i] < 30) {
                harf[i] = "ff";
                durum[i] = "Kaldı";
            } else if (basariNotu[i] < 40) {
                harf[i] = "dd";
                durum[i] = "Koşullu geçti";
            } else if (basariNotu[i] < 50) {
                harf[i] = "dc";
                durum[i] = "Koşullu geçti";
            } else if (basariNotu[i] < 60) {
                harf[i] = "cc";
                durum[i] = "geçti";
            } else if (basariNotu[i] < 70) {
                harf[i] = "cb";
                durum[i] = "geçti";
            } else if (basariNotu[i] < 80) {
                harf[i] = "bb";
                durum[i] = "geçti";
            } else if (basariNotu[i] < 90) {
                harf[i] = "ba";
                durum[i] = "geçti";
            } else {
                harf[i] = "aa";
                durum[i] = "geçti";
            }
        }
        for (;;) {
            System.out.println("1-Kayıt\n2-Kayıt Arama\n3-Ortalama\n4-En Küçük Ortalama\n5-En Büyük Ortalama\n6-Çıkış");
            menu = giris.nextByte();
            switch (menu) {
                case 1:
                    for (int i = 0; i < ks; i++) {
                        System.out.println(ad[i]);
                        System.out.println("Vize Notu : " + vize[i]);
                        System.out.println("Final Notu : " + Final[i]);
                        System.out.println("Başarı Durumu : " + durum[i] + "\nHarf Notu : " + harf[i] + "\nBaşarı Puanı : " + basariNotu[i]);
                        System.out.println("-------------");
                    }
                    break;
                case 2:
                	System.out.println("Aranacak adı giriniz : ");
                	String arananAd = giris.nextLine();
                	for (int i = 0; i < ks; i++) {
						if(arananAd.equalsIgnoreCase(ad[i])) {
							System.out.println(ad[i]);
	                        System.out.println("Vize Notu : " + vize[i]);
	                        System.out.println("Final Notu : " + Final[i]);
	                        System.out.println("Başarı Durumu : " + durum[i] + "\nHarf Notu : " + harf[i] + "\nBaşarı Puanı : " + basariNotu[i]);
						}
					}
                	
                	
                    break;
                case 3:
                    double bno = 0;
                    for (int i = 0; i < ks; i++) {
                        bno += basariNotu[i];
                    }
                    double ortalama = bno / ks;
                    System.out.println("Sınıf Başarı Notu Ortalaması : " + ortalama);
                    break;

                case 4:
                    byte enkbno = basariNotu[0];
                    for (int i = 1; i < ks; i++) { 
                        if (basariNotu[i] < enkbno) {
                            enkbno = basariNotu[i];
                        }
                    }
                    System.out.println("Sınıfın en düşük ortalaması : " + enkbno);
                    for (int i = 0; i < ks; i++) { 
                        if (basariNotu[i] == enkbno) {
                            System.out.println(ad[i]);
                            System.out.println("Vize Notu : " + vize[i]);
                            System.out.println("Final Notu : " + Final[i]);
                            System.out.println("Başarı Durumu : " + durum[i] + "\nHarf Notu : " + harf[i]);
                        }
                    }
                    break;

                case 5:
                    byte enbbno = basariNotu[0];
                    for (int i = 1; i < ks; i++) { 
                        if (basariNotu[i] > enbbno) {
                            enbbno = basariNotu[i];
                        }
                    }
                    System.out.println("Sınıfın en yüksek ortalaması : " + enbbno);
                    for (int i = 0; i < ks; i++) { 
                        if (basariNotu[i] == enbbno) {
                            System.out.println(ad[i]);
                            System.out.println("Vize Notu : " + vize[i]);
                            System.out.println("Final Notu : " + Final[i]);
                            System.out.println("Başarı Durumu : " + durum[i] + "\nHarf Notu : " + harf[i]);
                        }
                    }
                    break;

                case 6:
                	System.out.println("Program bitti");
                	System.exit(0);
                	break;
                default:
                	giris.close();
                    break;
            }
        }
    }

}
