package com.sizanosky;

/*
 * Classe ComputadorC
 *
 * Classe que executa o padrão de jogadas do CPU C. 
 *
 * @author  Marcos Fabricio Sizanosky
 * @version 1.0
 * @since   2021-10-15 
*/

/** A classe ComputadorC .*/
public class ComputadorC extends Computador {
	
    // Constructor.
    public ComputadorC() {
    }
    
    // Methods.
    /** O método getRandomNum() gera um numero aleatório entre 1 e 9. */
    public int getRandomNum(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    /** O método jogadaCompC() retorna uma jogada do ComputadorC gerada a partir da função getRandomNum().*/
    public int jogadaCompC(Tabuleiro tab) {
    	
    	int pos = getRandomNum(1, 9);
    	int jogada = 0;
    	
    	
    	if ((pos == 1) && (tab.matrizTab[0][0] == '_')) {
    		jogada = 1;
    	}
    	
    	else if ((pos == 2) && (tab.matrizTab[0][2] == '_')) {
    			jogada = 2;
    	}
    	
    	else if ((pos == 3) && (tab.matrizTab[0][4] == '_')) {
				jogada = 3;    			
		}
    	
    	else if ((pos == 4) && (tab.matrizTab[1][0] == '_')) {
				jogada = 4;	
		}
    	
    	else if ((pos == 5) && (tab.matrizTab[1][2] == '_')) {
				jogada = 5;	
		} 
    	
    	else if ((pos == 6) && (tab.matrizTab[1][4] == '_')) {
    			jogada = 6;	
		}
    	
    	else if ((pos == 7) && (tab.matrizTab[2][0] == '_')) {
				jogada = 7;    				
		}
    	
    	else if ((pos == 8) && (tab.matrizTab[2][2] == '_')) {
    		jogada = 8;    				
		}

    	else if ((pos == 9) && (tab.matrizTab[2][4] == '_')) {
			jogada = 9;  
		} 
    	else
    		jogada = jogadaCompC(tab);	

    	System.out.println(jogada);
		return jogada;
    }
}
