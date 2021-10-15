package com.sizanosky;

public class ComputadorB extends Computador {
    
	// Constants.
	final char CPU = 'O';
	final char OPONENTE = 'X';

    // Constructor.
    public ComputadorB() {
    }

    public void SetJogadaCompB() {
    	int pos = 9;
        
    	for (int lin=0; lin <= 2; lin++) {
    		for (int col=0; col <= 4; col++) {
    		
    			if (matrizTab[lin][col] == '_') {
	    			// Estou tendo problemas com essa parte também, talvez pela verificação das condições não estar funcionando de acordo
    				ArmazenaJogada(pos, CPU);
    			}
    			
    			else {
    				lin++;
    				col++;
    				pos--;
    			}
    		}
    	}
    }
}
