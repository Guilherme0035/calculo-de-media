package calculo.de.media;

import javax.swing.JOptionPane;

public class treinandomedia {

	public static void main(String[] args) {
	
		
	String nota1 = JOptionPane.showInputDialog("Digite a sua primeira nota");
	String nota2 = JOptionPane.showInputDialog("Digite a sua segunda nota");
	String nota3 = JOptionPane.showInputDialog("Digite a sua terceira nota");
	String nota4 = JOptionPane.showInputDialog("Digite a sua quarta nota");
	
	double dNota1= Double.parseDouble(nota1);
	double dNota2= Double.parseDouble(nota2);
	double dNota3= Double.parseDouble(nota3);
	double dNota4= Double.parseDouble(nota4);
	double resposta = 0;
	
	double media = ( dNota1 + dNota2 + dNota3 + dNota4) /4;
	
	
	JOptionPane.showConfirmDialog(null, "Desejar ver a sua média ?");
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Sua média foi de: " + media);
			
				if(media >=70) {
					JOptionPane.showMessageDialog(null, "Parabéns você foi aprovado");
					}
						if(media >40 && media <70) {
							JOptionPane.showMessageDialog(null, " Você está de recuperação");
							}
								if(media <=40) {
									JOptionPane.showMessageDialog(null, "Você está reprovado");									
									}
		}
	}
			
}
					
						



					
			 			
			
	
	

