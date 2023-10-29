//Construtor Padrão
#include <iostream>
#include <cstdlib>
using namespace std; //Atenção ao usar com classes

int main() {

	int numero = 10;
	int soma = 0;
	int tabuada = 0;

//Par
	cout << "Mostrando a soma de todos os numeros pares" << endl;

    for(int i = 1;i <= numero; i++) {
    	if (i % 2 == 0) {
		soma += i;
		cout << "numero " << i << " par" << endl;
		//Utilize para testes: system("pause");
		} else {
			cout << "numero " << i << " nao eh par" << endl;
		}
	}
	cout << "A soma dos numeros:" << soma << endl;

	cout << "\n\n";
	system("pause");
}
