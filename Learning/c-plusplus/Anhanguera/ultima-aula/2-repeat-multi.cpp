//Start
#include <iostream>
using namespace std;

int multi(int a, int b) {
	int resultado = a * b;
	cout << "Resultado: " << resultado << endl;
	return 0;
}

int main() {

	int multi1, multi2;
	char pergunta;
	
do {
	
	//Pedir dados ao usu�rio
cout << "Digite o primeiro numero a ser calculado: ";
cin >> multi1;

cout << "Digite o segundo numero a ser calculado: ";
cin >> multi2;

multi(multi1, multi2);

cout << "Digite [0] para continuar: ";
cin >> pergunta;
} while (pergunta == '0');
	
return 0;
}