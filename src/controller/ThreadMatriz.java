package controller;

public class ThreadMatriz extends Thread{

	int[][] matriz;
	int linha;
	
	public ThreadMatriz(int[][] matriz, int linha) {
		this.matriz = matriz;
		this.linha = linha;
	}
	
	public void run() {
		int soma = 0;
		for(int i = 0; i < 5; i++) {
			soma = matriz[linha][i];
		}
		System.out.println("Linha: " +linha+ " | soma: "+soma);
	}

}
