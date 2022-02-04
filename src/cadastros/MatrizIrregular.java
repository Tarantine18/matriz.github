package cadastros;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {

     System.out.print(" how many people will be recorded: ");
		Scanner sc = new Scanner(System.in);
     
		int NumberReco = sc.nextInt();

		String[][] nomesFilhos = new String[NumberReco][];
		
		for( int l = 0 ; l< nomesFilhos.length ; l=l+1) {
			System.out.print(" Enter for number of the sons " + " da pessoas: " + l + " ");
			int qtdFilhos = sc.nextInt();
			
			nomesFilhos[l] = new String[qtdFilhos];
			
			for( int c =0 ; c< nomesFilhos[l].length ; c++) {
				System.out.print(" digite o nome do filho: ");
				 sc.nextLine();
				nomesFilhos[l][c] = sc.nextLine();
				
			}
	
		}
		
		for(int l = 0 ; l< nomesFilhos.length ; l++) {
			System.out.println(" pessoa " + l + "tem "+ nomesFilhos[l].length + " filhos ");
			
			for(int c = 0 ; c< nomesFilhos[l].length ; c++) {
				System.out.println( nomesFilhos[l][c]);
			}
		}
		
		
		
		
		
		
		sc.close();
	}

}
