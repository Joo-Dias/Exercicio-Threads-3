package view;

import java.util.Random;

import controller.ThreadMatriz;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int matriz[][] = new int[3][5];
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 5; coluna++) {
				// System.out.println(matriz[linha][coluna]);
				matriz[linha][coluna] = random.nextInt(100)+1;
			}
		}
		ThreadMatriz threadMatriz1 = new ThreadMatriz(matriz, 0);
		ThreadMatriz threadMatriz2 = new ThreadMatriz(matriz, 1);
		ThreadMatriz threadMatriz3 = new ThreadMatriz(matriz, 2);
		threadMatriz1.start();
		threadMatriz2.start();
		threadMatriz3.start();
	}

}
 