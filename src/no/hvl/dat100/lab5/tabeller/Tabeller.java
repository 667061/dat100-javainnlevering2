package no.hvl.dat100.lab5.tabeller;

import java.util.Scanner;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String[] strTab = new String[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			int a = tabell[i];
			String b = String.valueOf(a);
			strTab[i] = b;
		}
		String mldStart = "[";
		String sum = "";
		for (int j = 0; j < strTab.length; j++) {
			String a = "";
			if (j == strTab.length - 1) {
				a = strTab[j];
			} else {
				a = strTab[j] + ",";
			}
			sum += a;
		}
		String mldSlutt = "]";
		String total = mldStart + sum + mldSlutt;
		return total;

	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		int k = tabell.length-1;
		while (k >= 0) {
			sum += tabell[k];
			k--;
		}
			
		
//2		for(int x : tabell)
//			sum += x;
		
		
//3		for (int i = 0; i < tabell.length; i++) {
//			sum += tabell[i];
//		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnest = false;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				finnest = true;
			}

		}
		return finnest;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		boolean funnet = false;
		int tallet = 0;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				funnet = true;
				tallet = i;
			}

		}
		if (funnet == false) {
			tallet = -1;
		}
		return tallet;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] tabRev = new int[tabell.length];
		int x = 0;
		for (int i = tabell.length - 1; i >= 0; i--) {
			tabRev[x] = tabell[i];
			x++;
		}
		return tabRev;

	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		int k = 1;
		while (k < tabell.length) {
			if (tabell[k - 1] > tabell[k]) {
				sortert = false;
			}
			k++;

		}

		return sortert;

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] tot = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++) {
			tot[i] = tabell1[i];
		}
		int k = 0;
		for (int i = tabell1.length; i < tabell1.length + tabell2.length; i++) {
			tot[i] = tabell2[k];
			k++;
		}
		return tot;

	}
}
