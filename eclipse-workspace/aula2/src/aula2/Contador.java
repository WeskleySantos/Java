package aula2;

public class Contador {
	//Para nome de classes começam em maiusculo
	//Para metodos e atributos começa em minusculo
	int qt;
	
	void zerar() {
		qt = 0;
	}
	void incrementrar() {
		qt++;
	}
	void decrementrar() {
		if (qt > 0) {
			qt--;
		}
	}
	void monstrar() {
		System.out.print("Quantidade: " + qt);
	}
	
	
}
