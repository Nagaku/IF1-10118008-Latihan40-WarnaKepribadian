package if1.pkg10118008.latihan40.warnakepribadian;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Warna {
	public static final String ANSI_RESET = "\u001B[0m";
    	public static final String ANSI_BLACK = "\u001B[30m";
    	public static final String ANSI_RED = "\u001B[31m";
    	public static final String ANSI_GREEN = "\u001B[32m";
    	public static final String ANSI_YELLOW = "\u001B[33m";
    	public static final String ANSI_BLUE = "\u001B[34m";
    	public static final String ANSI_PURPLE = "\u001B[35m";
    	public static final String ANSI_CYAN = "\u001B[36m";
    	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	private String[][] Kep = {
			{ 
				"Menyenangkan,",
				"Bijaksana,",
				"Pembawaan diri tenang saat menghadapi masalah,",
				"Dinamis,",
				"Senang Berbagi,",
				"Bersahabat,",
				"Tidak terlalu suka menjadi sorotan banyak orang,",
				"Menyembunyikan persaan karena karakternya yang cenderung mencari jalan damai."
			},
			{
				"Periang,",
				"Pemberani,",
				"Berani mengambil risiko dalam setiap langkah,",
				"Menyukai tantangan,",
				"Kurang sabar,",
				"Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,",
				"Memiliki energi kehangatan dan cinta."
			},
			{
				"Optimis,",
				"Suka bergaul,",
				"Periang,",
				"Senang menolong,",
				"Lincah dan Aktif,",
				"Tidak suka meremehkan kekurangan orang lain,",
				"Loyal,",
				"Hangat,",
				"Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,",
				"Cenderung penakut."
			},
			{
				"Optimis,",
				"Tidak pernah ragu,",
				"Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,",
				"Memiliki ambisi yang besar,",
				"Memiliki empati yang besar,",
				"Memiliki sisi misterius sebab seringkali menutupi persaannya,",
				"Terkadang bersikap keras kepala dan angkuh."
			},
			{
				"Romantis,",
				"Menyukai hal yang berbau alami dan keindahan,",
				"Teguh pada prinsip,",
				"Menginginkan Kesempurnaan,",
				"Mudah Cemburu,",
				"Mudah merasa iri,",
				"Menjunjung tinggi suatu nilai toleransi dan kepercayaan."
			}
		};
	private int[] pnjg = {8, 7, 10, 7, 7};
	int pilih = 0;
	String favorit, Nama;
	
	private void printWarna(){
		System.out.println(ANSI_RED + "YUK" + ANSI_GREEN + "CEK" + ANSI_YELLOW + "KEPRIBADIANMU" + ANSI_CYAN + "DARI" + ANSI_PURPLE + "WARN			A" + ANSI_BLUE + "FAVORITMU" + ANSI_RESET);	
		System.out.println(ANSI_RED_BACKGROUND+ "\t\tMERAH\t\t");
		System.out.println(ANSI_GREEN_BACKGROUND+ "\t\tHIJAU\t\t");
		System.out.println(ANSI_YELLOW_BACKGROUND+ "\t\tKUNING\t\t");
		System.out.println(ANSI_BLUE_BACKGROUND+ "\t\tBIRU\t\t");
		System.out.println(ANSI_PURPLE_BACKGROUND+ "\t\tUNGU\t\t" + ANSI_WHITE_BACKGROUND);
	}
	
	private String pilihWarna(){
		switch(this.favorit){
			case "BIRU":
				pilih = 0;
				return ANSI_BLUE;
			case "MERAH":
				pilih = 1;
				return ANSI_RED;
			case "KUNING":
				pilih = 2;
				return ANSI_YELLOW;
			case "UNGU":
				pilih = 3;
				return ANSI_PURPLE;	
			case "HIJAU":
				pilih = 4;
				return ANSI_GREEN;
			default:
				pilih = 5;
				
		};
		return "";
	}
	
	private void inputAwal(){
		System.out.print("PILIH WARNAFAVORITMU : ");
		Scanner sc = new Scanner(System.in);
		favorit = sc.next().toUpperCase();
		Nama = sc.nextLine();
	}
	
	private void printKepribadian(){
		System.out.print("\n===HASIL TEST KEPRIBADIAN " + Nama + "===" + "\nWarna Favoritmu Adalah ");
		System.out.println(pilihWarna() +  favorit + ANSI_RESET);
		if (pilih == 5)
			System.out.println("Ooops.. Belum teridentifikasi");
		else {
			for( int i = 0; i < pnjg[pilih]; i++){
				System.out.println((i+1) + ". " + Kep[pilih][i]);
			}
		}	
	}

	public void run(){
		printWarna();
		inputAwal();
		printKepribadian();
	}
}
