package br.com.wuzuy.cm.visao;

import javax.swing.JFrame;

import br.com.wuzuy.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {

	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 27);
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null); // centralizar
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // finalizar processo ao apertar X
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}

}
