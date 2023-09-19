package Ativ1;

import java.io.IOException;
import java.util.Scanner;

public class GravaArquivo {

	public static void main(String[] args) throws IOException {
		Arquivo lerGravar = new Arquivo();
		
		
		String texto= "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("digite o texto");
		texto=in.nextLine();
		
		
		
		
		
		lerGravar.gravaArquivo(texto);
		
		lerGravar.LerArquivo(texto);
	}
}
