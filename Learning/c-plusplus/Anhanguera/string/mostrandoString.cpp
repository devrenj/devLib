#include <iostream>
#include <string>
#include <locale.h>

using namespace std;

int main() 
{
	setlocale(LC_ALL, "");
	string nome = "Roberto";
	cout << "Meu nome �: " << nome;
	return 0;
}
