//Construtor Padrão
#include <iostream>
#include <cstdlib>
using namespace std; //Atenção ao usar com classes

int main() {

  int numero = 5;
  int soma = 0;

//Soma de todos os numeros
	cout << "Mostrando a soma de todos os numeros" << endl;

    for(int i = 1;i <= numero; i++) {
		soma += i;
      if (i % 2 != 0) {
      cout << "numero " << i << " impar" << endl;
      } else {
        cout << "numero " << i << " par" << endl;
      }
//Use para testes: system("pause");
    }
		cout << "A soma de todos os numeros:" << soma << endl;

	cout << "\n\n";
	system("pause");
}