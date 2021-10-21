package com.sizanosky;

/*
 * Classe Tabuleiro
 *
 * Classe que valida e armazena todas as jogadas de todos os jogadores.
 *
 * @author: Marcos Fabricio Sizanosky
 * @version 1.0
 * @since: 2021-10-15
 */

/** A classe Tabuleiro valida, armazena e imprime todas as jogadas de todos os jogadores
 * a classe também controla o status da partida.*/
public class Tabuleiro {
	
	// Constants.
    final char HUMANO = 'X';
    final char CPU = 'O';

    // Variables.
	char [][]matrizTab;
	int jogadasValidas = 0;
	

	// Construtor.
	public Tabuleiro() {
	}
	
	
    // Methods.
	/** O método zeraTabuleiro() zera todas as jogadas e inicializa matrizTab com a forma do tabuleiro.*/
	public void criaTab() {
		matrizTab = new char[][]{{'_', '|', '_', '|', '_'},
								 {'_', '|', '_', '|', '_'},
								 {'_', '|', '_', '|', '_'}};
								 jogadasValidas = 0;
	}
	
	
	/** O método armazenaJogada() verifica se a jogada é valida e armazena a jogada em matrizTab.*/
    public void armazenaJogada(int posicao, char quemJogou) {
    	
    	switch(posicao) {

    	case 1: // Armazena na posição 1 de matrizTab.
    		if (matrizTab[0][0] != '_') {
    			System.out.println("Jogada invalida, passou a vez..."); // 
    			
    		} else {
    			matrizTab[0][0] = quemJogou;
    	    	System.out.println("Jogada válida >>>>>>>>"); // Imprime sempre que uma jogada é válida.
    			jogadasValidas++; // Incrementa o contador de jogadas validas.
    		}
    		break;
    		
    	case 2: // Armazena na posição 2 de matrizTab.
    		if (matrizTab[0][2] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[0][2] = quemJogou;
    	    	System.out.println("Jogada válida >>>>>>>>");
    			jogadasValidas++;
    		}
    		break;

    	case 3: // Armazena na posição 3 de matrizTab.
    		if (matrizTab[0][4] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[0][4] = quemJogou;
    	    	System.out.println("Jogada válida >>>>>>>>");
    			jogadasValidas++;
    		}
    		break;
    		
    	case 4: // Armazena na posição 4 de matrizTab.
    		if (matrizTab[1][0] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[1][0] = quemJogou;
    			System.out.println("Jogada válida >>>>>>>>");
    			jogadasValidas++;
    		}
    		break;
    		
    	case 5: // Armazena na posição 5 de matrizTab.
    		if (matrizTab[1][2] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[1][2] = quemJogou;
    			System.out.println("Jogada válida >>>>>>>>");
    			jogadasValidas++;
    		}
    		break;
    		
    	case 6: // Armazena na posição 6 de matrizTab.
    		if (matrizTab[1][4] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[1][4] = quemJogou;
    			System.out.println("Jogada válida >>>>>>>>");
    			jogadasValidas++;
    		}
    		break;
    		
    	case 7: // Armazena na posição 7 de matrizTab.
    		if (matrizTab[2][0] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[2][0] = quemJogou;
    			System.out.println("Jogada válida >>>>>>>>");
    			jogadasValidas++;
    		}
    		break;
    		
    	case 8: // Armazena na posição 8 de matrizTab.
    		if (matrizTab[2][2] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[2][2] = quemJogou;
    			System.out.println("Jogada válida >>>>>>>>");
    			jogadasValidas++;
    		}
    		break;
 
    	case 9: // Armazena na posição 9 de matrizTab.
    		if (matrizTab[2][4] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[2][4] = quemJogou;
    			System.out.println("Jogada válida >>>>>>>>");
    			jogadasValidas++;
    		}
    		break;

    	default: // Retorna uma mensagem e imprime as instruções na tela.
        	System.out.println("Jogada invalida >>>>>>>>"); // Imprime sempre que uma jogada esta fora da range.
    		infoTab();
    		
    	}	
    }
    
    
    /** O método verificaStatus() verifica o status atual da partida utilizando condicionais.*/
    public int verificaStatus() {
    	
    	// return 0 = jogo inacabado.
    	// return 1 = humano venceu.
    	// return 2 = CPU venceu.
    	// return 3 = empate.		
        
        // Verifica se o Humano venceu.
        if (// Horizontais.
        		(matrizTab[0][0] == HUMANO) && (matrizTab[0][2] == HUMANO) && (matrizTab[0][4] == HUMANO) ||
        		(matrizTab[1][0] == HUMANO) && (matrizTab[1][2] == HUMANO) && (matrizTab[1][4] == HUMANO) ||
        		(matrizTab[2][0] == HUMANO) && (matrizTab[2][2] == HUMANO) && (matrizTab[2][4] == HUMANO) ||
        	
        	// Verticais.
        		(matrizTab[0][0] == HUMANO) && (matrizTab[1][0] == HUMANO) && (matrizTab[2][0] == HUMANO) ||
        		(matrizTab[0][2] == HUMANO) && (matrizTab[1][2] == HUMANO) && (matrizTab[2][2] == HUMANO) ||
        		(matrizTab[0][4] == HUMANO) && (matrizTab[1][4] == HUMANO) && (matrizTab[2][4] == HUMANO) ||
        		
        	// Diagonais.
        		(matrizTab[0][0] == HUMANO) && (matrizTab[1][2] == HUMANO) && (matrizTab[2][4] == HUMANO) ||
        		(matrizTab[2][0] == HUMANO) && (matrizTab[1][2] == HUMANO) && (matrizTab[0][4] == HUMANO)) {
        	
        	// Retorna Humano venceu.
        	return 1;
        }

        // Verifica se o CPU venceu.
        else if (// Horizontais.
	        		(matrizTab[0][0] == CPU) && (matrizTab[0][2] == CPU) && (matrizTab[0][4] == CPU) ||
	        		(matrizTab[1][0] == CPU) && (matrizTab[1][2] == CPU) && (matrizTab[1][4] == CPU) ||
	        		(matrizTab[2][0] == CPU) && (matrizTab[2][2] == CPU) && (matrizTab[2][4] == CPU) ||
        	
        		// Verticais.
	        		(matrizTab[0][0] == CPU) && (matrizTab[1][0] == CPU) && (matrizTab[2][0] == CPU) ||
	        		(matrizTab[0][2] == CPU) && (matrizTab[1][2] == CPU) && (matrizTab[2][2] == CPU) ||
	        		(matrizTab[0][4] == CPU) && (matrizTab[1][4] == CPU) && (matrizTab[2][4] == CPU) ||

	        	// Diagonais.
		    		(matrizTab[0][0] == CPU) && (matrizTab[1][2] == CPU) && (matrizTab[2][4] == CPU) ||
		    		(matrizTab[2][0] == CPU) && (matrizTab[1][2] == CPU) && (matrizTab[0][4] == CPU)) {

        	// Retorna CPU venceu.
        	return 2;
        }
        
        else if(jogadasValidas == 9) {
        	// Retorna Empate.
        	return 3;
        }
     
        else
        	// Retorna jogo inacabado.
        	return 0;
    }
    
    
    /** O método imprimeTabuleiro() imprime o tabuleiro atual.*/
	public void imprimeTabuleiro() {

	    for (int i = 0; i <= 2; i++) {
				System.out.println(matrizTab[i]);
	    }
	    System.out.println();
	}
	

	/** O método infoTab() imprime uma instrução de como escolher as jogadas.*/
	public void infoTab() {
		System.out.println("Realize as jogadas de acordo com o mapa a seguir:");
	    System.out.println("* * * * *");
	    System.out.println("*" + " " + "1" + "|" + "2" + "|" + "3" + " " + "*");
	    System.out.println("*" + " " + "4" + "|" + "5" + "|" + "6" + " " + "*");
	    System.out.println("*" + " " + "7" + "|" + "8" + "|" + "9" + " " + "*");
	    System.out.println("* * * * *");
		System.out.println("_________________________________________________\n");

	}
}
