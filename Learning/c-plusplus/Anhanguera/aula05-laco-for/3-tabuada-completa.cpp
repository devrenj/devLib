//Construtor Padrão
#include <iostream>
#include <cstdlib>
using namespace std; //Atenção ao usar com classes

int main()
{
	int numero, soma, tabuada = 0;
	char controle = ' ';

//Tabuada completa
	tabuada = 10;
	
	cout << "Tabuada ate " << tabuada << " vezes: " << endl;
	for (int i = 0; i <= tabuada; i++) {
		for (int j = 0; j < tabuada || j == tabuada; j++){
			cout << i << "x" << j << " = " << i*j << endl;
		}
		cout << endl;
	}
	cout << "\n\n";
	system("pause");
}