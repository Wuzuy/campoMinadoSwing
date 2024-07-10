package br.com.wuzuy.cm.visao;

import br.com.wuzuy.cm.modelo.Tabuleiro;

public class Temp {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(3,3,1);
		
		tabuleiro.registrarObservador(e -> {
			if(e.isGanhou()) {
				System.out.println("Ganhou!");	
			}else {
				System.out.println("deu. :(");
			}
		});
		
		tabuleiro.abrir(2, 2);
	}
}
