package com.sizanosky;

public class Tabuleiro extends JogoDaVelha {

	// Constants.
    final char HUMANO = 'X';
    final char CPU = 'O';

    // Variables.
	public char [][]matrizTab;
	public int jogadasValidas = 0;
	

	// Construtor.
	public Tabuleiro() {
		matrizTab = new char[][]{{'_', '|', '_', '|', '_'},
								 {'_', '|', '_', '|', '_'},
								 {'_', '|', '_', '|', '_'}};
	}
	
    // Methods.
    public void ArmazenaJogada (int posicao, char quemJogou){
    	
    	
    	switch(posicao) {

    	case 1:
    		if (matrizTab[0][0] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[0][0] = quemJogou;
    			jogadasValidas++;
    		}
    		break;
    	case 2:
    		if (matrizTab[0][2] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[0][2] = quemJogou;
    			jogadasValidas++;
    		}
    		break;

    		
    	case 3:
    		if (matrizTab[0][4] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[0][4] = quemJogou;
    			jogadasValidas++;
    		}
    		break;
    		
    	case 4:
    		if (matrizTab[1][0] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[1][0] = quemJogou;
    			jogadasValidas++;
    		}
    		break;
    		
    	case 5:
    		if (matrizTab[1][2] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[1][2] = quemJogou;
    			jogadasValidas++;
    		}
    		break;
    		
    	case 6:
    		if (matrizTab[1][4] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[1][4] = quemJogou;
    			jogadasValidas++;
    		}
    		break;
    		
    	case 7:
    		if (matrizTab[2][0] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[2][0] = quemJogou;
    			jogadasValidas++;
    		}
    		break;
    		
    	case 8:
    		if (matrizTab[2][2] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[2][2] = quemJogou;
    			jogadasValidas++;
    		}
    		break;
 
    	case 9:
    		if (matrizTab[2][4] != '_') {
    			System.out.println("Jogada invalida, passou a vez...");
    			
    		} else {
    			matrizTab[2][4] = quemJogou;
    			jogadasValidas++;
    		}
    		break;
    			
    	case 0:
    		System.out.println("Encerrando aplicação...");
			System.exit(0);
			break;

    	default:
    		System.out.println("Jogada invalida!!!");
    		InfoTab();
    		
    	}
    	System.out.println("Jogadas válidas >>>>>>>>" + jogadasValidas); // Estou usando para verificar se contador esta funcionando
    	AtualizaTabuleiro();
    }
    
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

        	System.out.printf("Parabens %s você venceu!", JogoDaVelha.nome);
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
	        		(matrizTab[2][0] == CPU) && (matrizTab[1][2] == CPU) && (matrizTab[0][4] == CPU)) {

	        	System.out.println("Você PERDEU!");
	        	return 2;
        }
         // Retorna Empate.
        else if(jogadasValidas == 9) {
        	System.out.println("EMPATE! Até a próxima HUMANO!");
        	return 3;
        }
     
        else
        	return 0;
    }
    
    // Atualiza o tabuleiro.
	public void AtualizaTabuleiro () {

	    for (int i = 0; i < 3; i++) {
				System.out.println(matrizTab[i]);
	    }
	    System.out.println();
	}

	// Imprime uma instrução de como escolher as jogadas.
	public void InfoTab() {
		System.out.println("Realize as jogadas de acordo com o mapa a seguir:");
	    System.out.println("* * * * *");
	    System.out.println("*" + " " + "1" + "|" + "2" + "|" + "3" + " " + "*");
	    System.out.println("*" + " " + "4" + "|" + "5" + "|" + "6" + " " + "*");
	    System.out.println("*" + " " + "7" + "|" + "8" + "|" + "9" + " " + "*");
	    System.out.println("* * * * *\n");
	}
}
