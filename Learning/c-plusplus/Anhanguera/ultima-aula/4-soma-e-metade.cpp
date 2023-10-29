//Start
#include <iostream>
using namespace std;

int soma(int a, int b) {
	int resultado = a + b;
	cout << "Resultado: " << resultado << endl;
	if ((resultado / 2) > a) {
		cout << "A metade eh maior que o primeiro numero";
	} else if ((resultado / 2) < a) {
		cout << "A metade eh menor que o primeiro numero";
	} else if ((resultado / 2) == a) {
		cout << "A metade eh igual ao primeiro numero";
	}
	return 0;
}

int main() {

int num1, num2;
	
cout << "Primeiro numero a ser somado: ";
cin >> num1;
cout << "Segundo numero a ser somado: ";
cin >> num2;

soma(num1, num2);
	
return 0;
}
