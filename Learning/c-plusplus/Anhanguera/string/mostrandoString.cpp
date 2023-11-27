#include <iostream>
#include <string>
#include <locale.h>

using namespace std;

int main() 
{
	setlocale(LC_ALL, "");
	string nome = "Roberto";
	cout << "Meu nome é: " << nome;
	return 0;
}
