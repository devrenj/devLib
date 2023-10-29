//Construtor Padrão
#include <iostream>
#include <cstdlib>
using namespace std; //Atenção ao usar com classes

int main() {

  int soma = 0, resultado = 0, numero;
  char controle = ' ';

//Impar com loop infinito e condi��o para parada
	cout << "Mostrando a soma de todos os numeros impares" << endl;

	for (;;) {
		
		soma = 0;
		cout << "Digite um numero para realizar a soma: ";
		cin >> numero;
		
	    for(int i = 1;i <= numero; i++) {
	    	if (i % 2 == 1) {
			soma += i;
			cout << "numero " << i << " impar" << endl;
			//system("pause");
			} else {
				cout << "numero " << i << " nao eh impar" << endl;
			}
		}
		cout << "A soma dos numeros:" << soma << endl << endl;
		cout << "Deseja realizar outra operacao? Digite [n] para encerrar: ";
		cin >> controle;
		if (controle == 'n') {
		 	break;
		}
	}
	cout << "\n\n";
	system("pause");
}