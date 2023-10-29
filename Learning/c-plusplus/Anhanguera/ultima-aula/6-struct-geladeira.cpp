#include <iostream>
using namespace std;

struct geladeira {
		char nome[25];
		char tipo[25];
		int quantidade;

// Necessário implementar as funções!
	void adicionarDados(Geladeira* add){
		// Geladeira.nome = add;
	}

	void mostrarDados(){
		// cout << Geladeira.nome;
	}

	void alterarQuantidade(int num){
		// Geladeira.quantidade = num;
	}

} typedef Geladeira;

int main(){
	
	char pergunta[25];
	//Pedir dados ao usuário
		cout << "Adicione um alimento: ";
		cin >> pergunta;
	//Implementar: Geladeira.adicionarDados(pergunta);
		cout << "Adicione a quantidade desse alimento: ";
		cin >> pergunta;
//Implementar:	Geladeira.alterarQuantidade(pergunta);	
	
	//Implementar: Geladeira.mostrarDados();

	return 0;		
}