//Start
#include <iostream>
using namespace std;

 //Protótipos
//Implementando com Função recursiva
int fatorial(int a);
void linha();

int main() {

	int num1, resultado;
	
//Pedir dados ao usu�rio
		cout << "Digite o numero para ser fatorado: ";
		cin >> num1;
		cout << "Resultado do fatorial de " << num1 << ": " << fatorial(num1) << " (funcao recursiva)";
		linha();
		resultado = num1;

//Implementando com laço For
	for (int i = num1; i >= 0; i--) {
		//teste: cout << resultado << " " << i << endl; 
		if (num1 == 0) {
			resultado = 1;
		} else if (i > 1) {
			resultado = (i-1) * resultado;	
		}
	}
	
	cout << "Resultado do fatorial de " << num1 << ": " 
	<< resultado << " (laco de repeticao For)" << endl;
	
return 0;
}

//Funções
void linha() {
	cout << "\n_______________________________________\n";
}

int fatorial(int a) {
	if (a == 0)
	return 1;
	return a * fatorial(a-1);
}