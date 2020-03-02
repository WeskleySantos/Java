package aula2;

public class Arma {
	
	int balas, maximo;
	// contrutor serve para inicializar o estado do objeto 
	// O construtor é chamado uma vez apenas.
	// SE A CLASSE N POSSUI CONSTRUTOR CRIA UM CONSTRUTOR IMPLICITO
	
	Arma(int balas, int maximo){
		this.balas = balas;
		this.maximo = maximo;
		
	}
	
	void atirar() {
		if (balas >= 1) {
			balas--;
			System.out.println(balas + 1 + "Errouuu");
		}else {
			System.out.println("Sem balas");
		}
		
	}
	void recaregar() {
		if (balas < maximo) {
			balas++;
			System.out.println("Recarregado" + balas);
		}else {
			System.out.println("Já Recarregado");
		}
		
	}
}


//EM UM REVOLVER EH POSSIVEL CARREGAR UMA MUNICAO POR VEZ E RECARREGAR TAMBEM
//NAO E POSSIVEL ATIRAR SEM MUNIÇAO E RECARREGAR CASO O NUMERO MAXIMO DE MUNIÇOES
/*FOR ATINGIDO. IMPREMENTE TAMBEM UMA FUNCIONALIDADE PARA MOSTRAR OS DADOS*/
