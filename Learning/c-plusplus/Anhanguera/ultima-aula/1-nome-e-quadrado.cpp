#include <iostream>
using namespace std;

char quadrado10x10() {
for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 9; j++){
	cout << "@";
	}
cout << "@" << endl;
}
	return 0;
}

int main() {

char nome[10] = "Roberto";
cout << quadrado10x10() << endl << "Nome: " << nome << endl;

return 0;
}