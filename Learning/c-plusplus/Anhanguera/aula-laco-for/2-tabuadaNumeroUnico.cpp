//Construtor Padrão
#include <iostream>
#include <cstdlib>
using namespace std; //Atenção ao usar com classes

int main()
{
	int numero, soma, tabuada = 0;
	char controle = ' ';
	
//Tabuada de número único
	tabuada = 10;
	
	cout << "Tabuada ate " << tabuada << " vezes: " << endl;
	for (int i = 0; i <= tabuada; i++) {
		cout << tabuada << "x" << i << " = " << tabuada * i << endl;
	}
	cout << "\n\n";
	system("pause");
}