package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] i : matrise) {
			for (int j : i) {
				System.out.println(j);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String totString = "";
		for (int[] i : matrise) {
			for(int j : i) {
				totString += j + " ";
				
			}
			totString += "\n";
		}
		
		
		return totString;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] mat = new int[matrise.length][matrise[1].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				mat[i][j] = matrise[i][j]*tall;
			}
		}
//		for (int i = 0; i < mat.length; i++) {
//			for (int j = 0; j < mat[i].length; j++) {
//				mat[i][j] *= tall;
//			}
//		}
//		
		return mat;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean lik = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j] != b[i][j])
					lik = false;
			}
		}
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[] [] mat = new int[matrise.length] [matrise[0].length];
		for(int i = 0; i<matrise.length;i++) {
			for(int j = 0; j<matrise[0].length;j++) {
				mat[j][i] = matrise[i][j];
			}
		}
		
		
		
		return mat;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] matProd = new int[b.length][a[0].length];
		if (a[0].length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					matProd[i][j] = a[i][j] * b[i][j];
				}
			}
		} 
		return matProd;
	}
}
