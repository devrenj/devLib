//Start
#include <iostream>
#include <string>
using namespace std;

void linha() {
	cout << "______________" << endl;
}

int main() {

	string alunos[3];
	char respostas[3][5];
	char gabarito[5] = {'a','b','c','d','e'};
	int nota[3] = {0};
	
for (int i = 0; i < 3; i++) {
		//Pedir dados ao usuário
			cout << "Nome do aluno: ";
			cin >> alunos[i];
	for (int j = 0; j < 5; j++){
		//Pedir dados ao usuário
			cout << "Reposta da questao " << j+1 << ": ";
			cin >> respostas[i][j];
			if (gabarito[j] == respostas[i][j]) {
			nota[i]++;
			//Teste: cout << "\nNota computada: " << nota[i] << "\nResposta certa: " << gabarito[j] << endl << endl;
		}
	}	
}

linha();

for (int i = 0; i < 3; i++) {
cout << "\nNota do aluno " << alunos[i] << ": [" << nota[i] << "]" << endl;
}

return 0;
}