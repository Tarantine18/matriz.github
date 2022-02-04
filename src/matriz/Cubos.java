package matriz;

public class Cubos {

	public static void main(String[] args) {

       int[][][] cub = new int[3][3][3];
   
       for( int l = 0 ; l<cub.length ; l=l+1) {
    	   for( int c = 0 ; c< cub[l].length ; c = c+1) {
    		   for( int p = 0 ; p < cub[l][c].length ; p=p+1) {
    			   
    			   cub[l][c][p] = l+c+p;
    			   
    			   
    		   }    
    	   }
       }

       int soma = 0;
       int somaPares = 0;
       int somaImpares = 0;
       
       
       for( int l = 0 ; l<cub.length ; l=l+1) {
    	   for( int c = 0 ; c< cub[l].length ; c = c+1) {
    		   for( int p = 0 ; p < cub[l][c].length ; p=p+1) {
    			   System.out.println( " l " + l + " - c "+ c +" -  p " + p);
    			   soma = soma +  cub[l][c][p] ;
    			   
    			   if(cub[l][c][p] % 2 ==0 ) {
    				somaPares = somaPares + cub[l][c][p];
    			   }
    			   else {
    				   somaImpares = somaImpares + cub[l][c][p];
    			   }
    			   
    		   }    
    	   }
       }
     System.out.println(" somas: " + soma);
     System.out.println(" somaPares: " + somaPares);
     System.out.println(" somaImpares: " + somaImpares	);
       
       
       
	}

}

