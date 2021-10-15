package com.sizanosky;

public class Computador extends Tabuleiro {
    
	// Constants.
    final int FACIL = 1;
    final int MEDIO = 2;
    final int DIFICIL = 3;
    
	private static int nivel;

    // Constructor.
    public Computador() {
    }

    // Methods.
    public void setCPU(int opcao) {

    	switch (opcao) {
    	case 1:
    		nivel = FACIL;
    		System.out.println("\nVocê selecionou o nível: \n    **** FÁCIL ****\n");
    		break;
    		
    	case 2:
    		nivel = MEDIO;
    		System.out.println("\nVocê selecionou o nível: \n    **** MÉDIO ****\n");
    		break;
    		
    	case 3:
    		nivel = DIFICIL;
    		System.out.println("\nVocê selecionou o nível: \n    **** DIFÍCIL ****\n");
    		
    	case 0:
    		System.out.println("Encerrando aplicação...");
			System.exit(0);
    		break;
    		
    	default:
    		System.out.println("Opção invalida!");
    	}
//    	return nivel;
    }

    public void setJogadaCPU() {

    	
        if (nivel == FACIL) {
        	ComputadorA compA = new ComputadorA();
            
            compA.SetJogadaCompA();

        } else if (nivel == MEDIO) {
        	ComputadorB compB = new ComputadorB();
            
            compB.SetJogadaCompB();

        } else if (nivel == DIFICIL) {
        	ComputadorC compC = new ComputadorC();
            
            compC.SetJogadaCompC();
        }
    }
}
